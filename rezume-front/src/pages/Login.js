import React, { useState } from "react";
import axios from "axios";

//export default function Login() {
const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");

  const loginSubmit = async (e) => {
    e.preventDefault();
    try {
      console.log("yyOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOyyyyyyyyy");
      const response = await axios.post("http://localhost:8080/userlogin", {
        email,
        password,
      });
      setMessage(response.data);
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
