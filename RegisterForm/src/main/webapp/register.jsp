
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f2f5;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        margin: 0;
    }

    .container {
        background-color: white;
        padding: 25px;
        width: 350px;
        border-radius: 10px;
        box-shadow: 0 0 10px gray;
    }

    h2 {
        text-align: center;
        color: #007bff;
    }

    label {
        display: block;
        margin-top: 12px;
    }

    input, select {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    button {
        width: 100%;
        padding: 12px;
        margin-top: 20px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>
</head>

<body>

<div class="container">
    <h2>Registration Form</h2>

    <form action="regform" method="post">

        <label>Full Name</label>
        <input type="text" name="name"
               placeholder="Enter your full name" required>

        <label>Email</label>
        <input type="email" name="email"
               placeholder="Enter your email" required>

        <label>Password</label>
        <input type="password" name="password"
               placeholder="Enter password" required>

        <label>Mobile Number</label>
        <input type="tel" name="mobile"
               pattern="[0-9]{10}"
               placeholder="Enter 10-digit mobile number"
               required>

       

        <button type="submit">Register</button>

    </form>
</div>

</body>
</html>
