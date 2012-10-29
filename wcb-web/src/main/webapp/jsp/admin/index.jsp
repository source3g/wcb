<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员后台</title>
</head>
<frameset rows="59,*" cols="*" frameborder="no" border="0"
	framespacing="0">
	<frame src="${pageContext.request.contextPath }/jsp/admin/top.jsp"
		name="topFrame" scrolling="no" noresize="noresize" id="topFrame"
		title="topFrame" />
	<frameset cols="213,*" frameborder="no" border="0" framespacing="0">
		<frame src="${pageContext.request.contextPath }/jsp/admin/left.jsp"
			name="leftFrame" scrolling="no" noresize="noresize" id="leftFrame"
			title="leftFrame" />
		<frame
			src="${pageContext.request.contextPath }/jsp/admin/main.jsp"
			name="mainFrame" id="mainFrame" title="mainFrame" />
	</frameset>
</frameset>
<noframes>
	<body>
	</body>
</noframes>
</html>