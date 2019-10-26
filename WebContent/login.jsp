<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome, Please Log In</title>
</head>
<body>
	
	<form method="post" action="/Dosimetry_Calculator/Login">
	
		<div class="field"><label>Username: </label>
		<input type="text" name="username" placeholder="Username"/> <br/></div>
		<div class="field"><label>Password: </label>
		<input type="password" name="password" placeholder="Password"/> <br/></div>
		
		<div class="submit">
			<button type="submit">Submit</button>
		</div>
	
	</form>
	
</body>
</html>