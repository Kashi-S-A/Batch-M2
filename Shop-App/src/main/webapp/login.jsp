<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>

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

    .register-link{
        text-align:center;
        margin-top:15px;
        font-size:14px;
    }

    .register-link a{
        color:#4facfe;
        text-decoration:none;
        font-weight:bold;
    }

    .register-link a:hover{
        text-decoration:underline;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Login</h2>
	<h4 style="color: green">${succ}</h4>
	<h4 style="color: red">${err}</h4>
	
    <form action="login" method="post">

        <label>Email</label>
        <input type="email" name="email" required>

        <label>Password</label>
        <input type="password" name="password" required>

        <button type="submit" class="btn">Login</button>

    </form>

    <div class="register-link">
        Don't have an account? <a href="register.jsp">Register</a>
    </div>

</div>

</body>
</html>