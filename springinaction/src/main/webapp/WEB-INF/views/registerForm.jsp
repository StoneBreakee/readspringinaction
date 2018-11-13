<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>register</h1>
    <form method = "POST" enctype="multipart/form-data">
        First name : <input type="text" name="firstName"/><br />
        Last name : <input type="text" name="lastName"/><br />
        Username : <input type="text" name="username"/><br />
        Password : <input type="text" name="password"/><br />
        <input type="file"
                       name="profilePicture"
                       accept="image/jpeg,image/png,image/gif,image/jpg" /><br/>
        <input type="submit" value="Register" />
    </form>
</body>
</html>
