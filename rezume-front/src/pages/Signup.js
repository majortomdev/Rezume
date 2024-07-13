import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const Signup = () => {
  const [email, setEmail] = useState("");
  const [name, setName] = useState("");
  const [password, setPassword] = useState("");
  const [userName, setUserName] = useState("");
  const navigate = useNavigate();

  const signupSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post(
        "http://localhost:8080/api/users/usersignup",
        {
          userName,
          name,
          email,
          password,
        }
      );
      localStorage.setItem("user", JSON.stringify(response.data));
      navigate("/Home");
    } catch (err) {
      console.log(err);
    }
  };
  return (
    <div className="signup-container">
      <form onSubmit={signupSubmit}>
        <div class="form-group">
          <label for="inputEmail1">Email address</label>
          <input
            type="email"
            class="form-control"
            id="inputEmail2"
            aria-describedby="emailHelp"
            placeholder="Enter email"
            onChange={(e) => setEmail(e.target.value)}
          />
          <small id="emailHelp" class="form-text text-muted">
            We'll never share your email with anyone else.
          </small>
        </div>
        <div class="form-group">
          <label for="inputPassword2">Password</label>
          <input
            type="password"
            class="form-control"
            id="inputPassword2"
            placeholder="Password"
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <div class="form-group">
          <label for="inputName2">Name</label>
          <input
            type="text"
            class="form-control"
            id="inputName2"
            placeholder="Name"
            onChange={(e) => setName(e.target.value)}
          />
        </div>
        <div class="form-group">
          <label for="userName">UserName</label>
          <input
            type="text"
            class="form-control"
            id="userName"
            placeholder="Your account username"
            onChange={(e) => setUserName(e.target.value)}
          />
        </div>

        <button type="submit" class="btn btn-primary m-2">
          Submit
        </button>
      </form>
    </div>
  );
};

export default Signup;
