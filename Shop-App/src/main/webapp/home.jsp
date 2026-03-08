<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E-Shop | Home</title>

<style>
body{
    font-family: Arial, sans-serif;
    margin:0;
    background:#f4f4f4;
}

/* Navbar */
.navbar{
    background:#333;
    color:white;
    padding:15px;
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.navbar h1{
    margin:0;
}

.navbar a{
    color:white;
    text-decoration:none;
    margin-left:20px;
    font-weight:bold;
}

.navbar a:hover{
    color:#00c6ff;
}

/* Hero Section */
.hero{
    background:linear-gradient(120deg,#4facfe,#00f2fe);
    color:white;
    text-align:center;
    padding:60px 20px;
}

.hero h2{
    font-size:36px;
    margin-bottom:10px;
}

.hero p{
    font-size:18px;
}

/* Products */
.products{
    padding:40px;
    text-align:center;
}

.product-container{
    display:flex;
    justify-content:center;
    gap:20px;
    flex-wrap:wrap;
}

.product{
    background:white;
    width:220px;
    padding:15px;
    border-radius:10px;
    box-shadow:0 3px 10px rgba(0,0,0,0.2);
}

.product img{
    width:100%;
    border-radius:8px;
}

.product h3{
    margin:10px 0 5px 0;
}

.price{
    color:green;
    font-weight:bold;
}

.btn{
    display:inline-block;
    margin-top:10px;
    padding:8px 15px;
    background:#4facfe;
    color:white;
    border-radius:5px;
    text-decoration:none;
}

.btn:hover{
    background:#00c6ff;
}

/* Footer */
.footer{
    background:#333;
    color:white;
    text-align:center;
    padding:15px;
    margin-top:40px;
}
</style>

</head>
<body>

<!-- Navbar -->
<div class="navbar">
    <h1>E-Shop</h1>
    <div>
        <a href="Home.jsp">Home</a>
        <a href="#">Cart</a>
    </div>
</div>

<!-- Hero Section -->
<div class="hero">
    <h2>Welcome to E-Shop</h2>
    <p>Best deals on electronics, fashion, and more!</p>
</div>

<!-- Products -->
<div class="products">
    <h2>Featured Products</h2>

    <div class="product-container">

        <div class="product">
            <img src="https://via.placeholder.com/200" alt="Product">
            <h3>Smartphone</h3>
            <p class="price">₹15,999</p>
            <a href="#" class="btn">Add to Cart</a>
        </div>

        <div class="product">
            <img src="https://via.placeholder.com/200" alt="Product">
            <h3>Headphones</h3>
            <p class="price">₹2,499</p>
            <a href="#" class="btn">Add to Cart</a>
        </div>

        <div class="product">
            <img src="https://via.placeholder.com/200" alt="Product">
            <h3>Laptop</h3>
            <p class="price">₹55,000</p>
            <a href="#" class="btn">Add to Cart</a>
        </div>

        <div class="product">
            <img src="https://via.placeholder.com/200" alt="Product">
            <h3>Smart Watch</h3>
            <p class="price">₹3,999</p>
            <a href="#" class="btn">Add to Cart</a>
        </div>

    </div>
</div>

<!-- Footer -->
<div class="footer">
    <p>© 2026 E-Shop | All Rights Reserved</p>
</div>

</body>
</html>