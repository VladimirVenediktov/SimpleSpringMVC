<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--чтобы получить возможность использовать библиотеку тегов JSP--%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<body>
<h2>Hello,<br>${name}!</h2>
<%--доступ к информации об аутентификации пользователя: выводить приветствие на основе логина--%>
<p>Hello <security:authentication property="principal.username" />!</p>
</body>
</html>
