<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 스크립트릿 -->
	<% int a = 2;
	   int b = 4;
	   int sum = a + b;
	   out.println("2 + 4 = " + sum);%>
	<br>
	
	<% for(int i = 0; i <= 10; i++){
		if(i % 2 == 0){
			out.println(i + "<br>");
		}
	}%>
	
</body>
</html>