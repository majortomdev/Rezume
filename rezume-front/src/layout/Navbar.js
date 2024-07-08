import React from "react";
import { Router, Route, Routes, Link, Switch } from "react-router-dom";
import Login from "../pages/Login";

export default function Navbar() {
  return (
    <div>
      <nav
        className="navbar navbar-expand-lg navbardark"
        style={{ backgroundColor: "#966c3e" }}
      >
        <a className="navbar-brand ms-3" href="#">
          Rezume
        </a>
        <button
          className="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <button
          style={{ float: "right" }}
          className="btn btn-outline-light ms-2 me-2"
          react-router-dom
        >
          <Link to="/Login">Log In</Link>
        </button>
        <button className="btn btn-outline-light ms-2 me-2">Sign Up</button>
        {/* </div> */}
      </nav>

      <Routes>
        <Route path="/Login" element={<Login />} />
      </Routes>
    </div>
  );
}