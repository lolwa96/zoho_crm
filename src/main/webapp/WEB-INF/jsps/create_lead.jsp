<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Create | New Lead</h2>
<hr>

	<form action="savelead" method="post">
	<pre>
	
	First Name:  <input type="text" name="firstName"/>
	Last Name:   <input type="text" name="lastName"/>
	Email:       <input type="text" name="email"/>
	Lead Source: <select name="leadSource">
	  <option value="radio">Radio</option>
	  <option value="tv commercial">Tv Commercial</option>
	  <option value="news paper">News Paper</option>
	  <option value="online">Online</option>
	</select>
	Mobile:      <input type="text" name="mobile"/>
	
	<input type="submit" value="Save"/>
	
	
	
	</pre>
	</form>

</body>
</html>