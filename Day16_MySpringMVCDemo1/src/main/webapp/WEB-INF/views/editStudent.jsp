<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
</head>
<body>
<form action="/Day15_MySpringMVCDemo/student/updatestudent" method="post">
    <!-- Hidden field or readonly for ID -->
    Student Id : <input type="text" name="sid" id="sid" value="${stud.sid}" readonly><br>

    Student Name : <input type="text" name="sname" id="sname" value="${stud.sname}"><br>
    Student Email : <input type="email" name="email" id="email" value="${stud.email}"><br>
    Student Percentage : <input type="number" name="percentage" id="percnt" value="${stud.percentage}"><br>
    Student Address : <input type="text" name="address" id="addr" value="${stud.address}"><br>

    <button type="submit" name="btn" id="insert">Update Student</button>
</form>
</body>
</html>
