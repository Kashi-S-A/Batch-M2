<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<style>
    body{
        font-family: Arial, sans-serif;
        background: linear-gradient(120deg,#4facfe,#00f2fe);
        height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
        margin:0;
    }

    .container{
        background:white;
        padding:30px;
        width:350px;
        border-radius:10px;
        box-shadow:0 5px 15px rgba(0,0,0,0.2);
    }

    h2{
        text-align:center;
        margin-bottom:20px;
        color:#333;
    }

    label{
        font-weight:bold;
        display:block;
        margin-top:10px;
    }

    input{
        width:100%;
        padding:10px;
        margin-top:5px;
        border-radius:5px;
        border:1px solid #ccc;
        font-size:14px;
    }

    input:focus{
        border-color:#4facfe;
        outline:none;
    }

    .btn{
        width:100%;
        padding:12px;
        margin-top:20px;
        background:#4facfe;
        color:white;
        border:none;
        border-radius:5px;
        font-size:16px;
        cursor:pointer;
    }

    .btn:hover{
        background:#00c6ff;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Register</h2>

    <form action="register" method="post">

        <label>Username</label>
        <input type="text" name="username" required>

        <label>Email</label>
        <input type="email" name="email" required>

        <label>Phone</label>
        <input type="tel" name="phone" pattern="[0-9]{10}" required>

        <label>Password</label>
        <input type="password" name="password" required>

        <button type="submit" class="btn">Register</button>

    </form>
    
    <a href="login.jsp">Already Register ? Login Here</a>
</div>

</body>
</html>