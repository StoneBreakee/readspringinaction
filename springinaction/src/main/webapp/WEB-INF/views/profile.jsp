<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Your Profile</h1>
    <c:out value="${spitter.username}"/>
</body>
</html>
