<form action="${pageContext.request.contextPath}/login/registerme" method="post" enctype="multipart/form-data">

    <label>User ID:</label>
    <input type="text" name="userId"><br/><br/>

    <label>Name:</label>
    <input type="text" name="name"><br/><br/>

    <label>Gender:</label>
    <input type="radio" name="gender" value="Male">Male
    <input type="radio" name="gender" value="Female">Female
    <br/><br/>

    <label>DOB:</label>
    <input type="date" name="dob"><br/><br/>

    <label>Username:</label>
    <input type="text" name="username"><br/><br/>

    <label>Password:</label>
    <input type="password" name="password"><br/><br/>

    <label>Confirm Password:</label>
    <input type="password" name="confirmPassword"><br/><br/>

    <label>Skills:</label>
    <input type="checkbox" name="skills" value="Java">Java
    <input type="checkbox" name="skills" value="Python">Python
    <input type="checkbox" name="skills" value="C++">C++<br/><br/>

    <label>Upload Photo:</label>
    <input type="file" name="photo"><br/><br/>

    <button type="submit">Register</button>
</form>
