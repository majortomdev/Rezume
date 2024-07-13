import React, { useState, useEffect } from "react";
import axios from "axios";
import "./Pages.css";

const Home = () => {
  const [urlObjects, setUrlObjects] = useState([]);
  const [url, setUrl] = useState("");
  const user = JSON.parse(localStorage.getItem("user"));

  useEffect(() => {
    const fetchUrlObjects = async () => {
      const response = await axios.get(
        `http://localhost:8080/api/urlobjects/urlsbyuserid/${user.id}`
      );
      setUrlObjects(response.data);
      console.log("eeeeeeeeeeee" + response.data);
    };
    fetchUrlObjects();
  }, [user.id]);

  const handleAddUrlObject = async (e) => {
    e.preventDefault();
    const userId = user.id;
    const newUrlObject = { theUrl: url, userId, active: true };
    const response = await axios.post(
      "http://localhost:8080/api/urlobjects/saveurl",
      newUrlObject
    );
    setUrlObjects([...urlObjects, response.data]);
    setUrl("");
  };

  return (
    <div className="home-container">
      <h2>URLs saved for {user.userName}</h2>
      <form onSubmit={handleAddUrlObject}>
        <input
          type="url"
          value={url}
          onChange={(e) => setUrl(e.target.value)}
          required
        />
        <button type="submit">Add Link to save</button>
      </form>
      <ul>
        {urlObjects.map((urlObj) => (
          <li className="listed-urls" key={urlObj.id}>
            <a href={urlObj.theUrl} target="_blank" rel="noopener noreferrer">
              {urlObj.theUrl}
            </a>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Home;
