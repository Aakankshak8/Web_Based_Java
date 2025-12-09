<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="2">
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Product Quantity</th>
<th>Product Price</th>
<th>Product MfgDate</th>
<th>Customer Id</th>
<th>Action</th>
</tr>
<c:forEach var="prod" items="${plist}"><tr>
<td>${prod.pid}</td>
<td>${prod.pname}</td>
<td>${prod.qty}</td>
<td>${prod.price}</td>
<td>${prod.mfgdate}</td>
<td>${prod.cid}</td>
<td>
  <a href="deleteproduct/${prod.pid}">delete</a>/
  <a href="editproduct/${prod.pid}">edit</a>
</td>
</tr>
</c:forEach>
<a href="addproduct">Add New Product</a>
</table>

</body>
</html>