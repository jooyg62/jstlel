<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("i", 10);
	int i = 20;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>데이터 타입</h1>
	${iVal } </br>
	${lVal } </br>
	${fVal } </br>
	${bVal } </br>
	-${obj }-
	
	<h1>연산</h1>
	${iVal+20*lVal/2-10 } </br>
	${iVal < lVal && fVal < 5 } </br>
	${empty obj } </br>
	
	<h1>요청 파라미터 가져오기</h1>
	<%=request.getParameter("a") %>
	${param.a }
	
	<h1>객체 접근</h1>
	${sessionScope.vo.no } <br>
	${vo.no } <br>
	${vo.name } <br>
	
	<h2>Map 객체 접근</h2>
	${map.iVal } </br>
	${map.lVal } </br>
	${map.fVal } </br>
	${map.bVal } </br>
</body>
</html>