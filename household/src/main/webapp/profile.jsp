
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
import = "java.sql.*, com.dao.ProfileDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
<%@include file="component/allcss.jsp"%>
 <style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
	
	background= url("img/p 15.jpg");
}

</style>
</head>

<body BACKGROUND="img/p 15.JPG">
	<%@include file="component/navbar.jsp"%>
	
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">Seller Profile</p>
						

						<form action="ProfileRegister" method="post">
							<div class="mb-3">
								<label class="form-label">First Name</label> <input required
									name="firstname" type="text" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Last Name</label> <input required
									name="lastname" type="text" class="form-control">
							</div>
 
 							<div class="mb-3">
								<label class="form-label">Email address</label> <input required
									name="email" type="email" class="form-control">
							</div>
							

							<div class="mb-3">
								<label class="form-label">Password</label> <input required
									name="password" type="password" class="form-control">
							</div>
							
							<div class="mb-3">
								<label class="form-label">Contact Number</label> <input required
									name="contact" type="text" class="form-control">
							</div>

				            <div class="mb-3">
								<label class="form-label">Address</label> <input required
									name="address" type="text" class="form-control">
							</div>
				            Product: <select name="products" >
<option value = "">--Please choose an option--</option>
<option value = "Tiffin service">Tiffin Service</option>
<option value = "Chocolates">Homemade chocolates</option>
<option value = "Cake">Cake</option>
<option value = "Cookies">Cookies</option>
<option value = "Muffin">Muffin</option>
</select><br><br>
Product Details:  <br><textarea rows= "3" cols= "40" name="product_dtls"> </textarea><br><br>
				
							<button type="submit" class="btn bg-warning text-white col-md-12">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>