<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加商户</title>
<%@ include file="../../include/header.jsp"%>
</head>
<body>
	<form
		action="${pageContext.request.contextPath}/admin/merchant/add.html"
		method="post" class="form-horizontal">

		<div class="control-group">
			<label class="control-label" for="name">名称：</label>
			<div class="controls">
				<input type="text" class="input-xlarge" placeholder="请输入数字..."
					id="name" name="name"> <span class="help-inline"><font
					color="red">*</font>商户名称</span>
			</div>
		</div>

		<div class="control-group">
			<label class="control-label" for="addr">地址：</label>
			<div class="controls">
				<input type="text" class="input-xlarge" placeholder="请输入数字..."
					id="addr" name="addr"> <span class="help-inline">商户地址</span>
			</div>
		</div>
		<div class="form-actions">
			<button type="submit" class="btn btn-primary">增加</button>

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
		</div>
	</form>
</body>
</html>