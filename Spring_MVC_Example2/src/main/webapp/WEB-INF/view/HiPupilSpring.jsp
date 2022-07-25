<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style/mainStyle.css">
<title>Insert title here</title>
</head>
<body>

Hola ${param.namePupil }. Welcome to Spring course

<p><br>

<h2>Attention</h2>

${finalMessage}

<p>

<img alt="foto" src="${pageContext.request.contextPath}/resources/images/Barato.jpeg">

</body>
</html>