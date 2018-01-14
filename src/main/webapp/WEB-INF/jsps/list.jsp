<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询所有</title>
</head>
<body>
	<center>
		<table>
			<tr>
				<td>id</td>
				<td>用户名</td>
				<td>密码</td>
				<td>年龄</td>
				<td>住址</td>
			</tr>
		<c:forEach items="${list}" var="user">
		<tr>
				<td>${user.user_id}</td>
				<td>${user.user_name}</td>
				<td>${user.user_password}</td>
				<td>${user.user_age}</td>
				<td>${user.user_add}</td>
			</tr>
		
		</c:forEach>

		</table>


	</center>
</body>
</html>