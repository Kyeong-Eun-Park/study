<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="top.jsp" />
	<input type="button" value="회원가입" onclick="location.href='JoinForm'"> <!-- JoinFormServlet -->
	<input type="button" value="로그인" onclick="location.href='LoginForm'"> <!-- LoginFormServlet -->
	<input type="button" value="회원목록" onclick="location.href='List'"> <!-- ListServlet -->
</body>
</html>