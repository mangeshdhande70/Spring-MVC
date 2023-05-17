<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to our page</h1>

<form action="/save" method="post">

<table>

<tr>
<th>Book Name: </th>
<td><input type="text" name="bName" /></td>
</tr>
<tr>
<th>Book author: </th>
<td><input type="text" name="bAuthor" /></td>
</tr>


</table>
 <button type="submit">Submit</button>

</form>

</body>
</html>