<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/student/updatestudent" method="post">
Student Id : <input type="text" name="sid" id="sid"><br>
Student Name : <input type="text" name="sname" id="sname"><br>
Student Email : <input type="email" name="email" id="email"><br>
Student Percentage : <input type="number" name="percentage" id="percnt"><br>
Student Address : <input type="text" name="address" id="addr"><br>



<button type="submit" name="btn" id="insert">Update Student</button>
</form>

</body>
</html>