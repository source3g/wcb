<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加商户</title>
<%@ include file="../include/header.jsp"%>
</head>
<body>
	<form
		action="${pageContext.request.contextPath}/admin/merchant/add.html"
		method="post">
		名称：<input type="text" name="name"><br> 
		地址：<input type="text"
			name="addr"><br /> <input type="submit" value="增加"><br />
		<c:if test="${ not empty success }">
		${success }
	</c:if>
		<c:if test="${not empty errors}">
			<ul>
				<c:forEach items="${errors}" var="error">
					<li>${error.defaultMessage}</li>
				</c:forEach>
			</ul>
		</c:if>
	</form>
</body>
</html>