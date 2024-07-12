import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

//export default function Login() {
const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");
  const navigate = useNavigate();

  const loginSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post(
        "http://localhost:8080/api/users/userlogin",
        {
          email,
          password,
        }
      );
      console.log("Response data is:   " + response.data);
      localStorage.setItem("user", JSON.stringify(response.data));
      setMessage("That went ok there jimmy");
      navigate("/Home");
    } catch (err) {
      setMessage("Something went wrong, please check your credentials.");
    }
  };
  return (
    <div>
      <form onSubmit={loginSubmit}>
        <div class="form-group">
          <label for="inputEmail1">Email address</label>
          <input
            type="email"
            class="form-control"
            id="inputEmail1"
            aria-describedby="emailHelp"
            placeholder="Enter email"
            onChange={(e) => setEmail(e.target.value)}
          />
          <small id="emailHelp" class="form-text text-muted">
            We'll never share your email with anyone else.
          </small>
        </div>
        <div class="form-group">
          <label for="inputPassword1">Password</label>
          <input
            type="password"
            class="form-control"
            id="inputPassword1"
            placeholder="Password"
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>

        <button type="submit" class="btn btn-primary m-2">
          Submit
        </button>
      </form>
      <p>{message}</p>
    </div>
  );
};

export default Login;
