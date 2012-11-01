<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商户</title>
<%@ include file="../../include/header.jsp"%>
</head>
<body>
	<table class="table table-striped table-bordered bootstrap-datatable datatable">
		<thead>
			<tr>
				<th width="30%">名称</th>
				<th width="30%">地址</th>
				<th width="40%">操作</th>
			</tr>
		</thead>
		<c:forEach items="${merchants}" var="merchant">
			<tr>
				<td>${merchant.name }</td>
				<td>${merchant.addr }</td>
				<td><a href="${pageContext.request.contextPath}/admin/merchant/${merchant.id }.html?_method=delete">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>