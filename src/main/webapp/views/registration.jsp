<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
	<h1>Enter Details..!!</h1>

	<form action="/saveDetails" method="post">
		<table>
			<tr>
				<td>Enter Id</td>
				<td><input type="text" name="uId"></td>
			</tr>

			<tr>
				<td>Enter Name</td>
				<td><input type="text" name="uName"></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="pwd"></td>
			</tr>

			<tr>
				<td>Enter Phone No:</td>
				<td><input type="text" name="phone"></td>
			</tr>

			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Submit"></td>

			</tr>
		</table>

	</form>


</body>
</html>