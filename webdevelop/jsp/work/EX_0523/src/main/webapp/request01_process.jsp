<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	로그인 한 페이지
	<%
		String userId = request.getParameter("id");
		String userPwd = request.getParameter("pwd");
	%>
	<p> 아이디 : <%= userId %></p>
	<p> 비밀번호 : <%= userPwd %></p>
	
	
	
	
</body>
</html>