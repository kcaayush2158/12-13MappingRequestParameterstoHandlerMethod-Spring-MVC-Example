<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h3>You have successfully registered with following Info::</h3>
</body>
<a href="/12-13MappingRequestParameterstoHandlerMethod/">Back</a>
<table>

			<tr>
				<td>User Name</td>
				<td>${user.name}</td>
			</tr>

			<tr>
				<td>Email</td>
				<td>${user.email}</td>
			</tr>


			<tr>
				<td>Age</td>
				<td>${user.age}</td>
			</tr>


			<tr>
				<td>Country</td>
				<td>${user.country}</td>
			</tr>

</table>
</body>
</html>