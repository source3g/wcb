<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="include/header.jsp"%>
<link
	href="${pageContext.request.contextPath}/css/tree.css"
	rel="stylesheet" />
<script type="text/javascript">
	$(document).ready(function() {
		$("#wenzhang>dd>dl>dd").hide();
		$.each($("#wenzhang>dd>dl>dt"), function() {
			$(this).click(function() {
				$("#wenzhang>dd>dl>dd ").not($(this).next()).slideUp();
				$(this).next().slideToggle(500);
			});
		});
	});

	function goSpace(obj) {
		window.parent.mainFrame.location.href = obj;
	}
</script>
</head>
<body>
	<dl id="wenzhang">
		<dd>
			<dl>
				<dt>商户管理</dt>
				<dd>
					<ul>
						<li><a
							href="javascript:goSpace('${pageContext.request.contextPath}/admin/merchant/add.html')">增加商户</a></li>
						<li><a
							href="javascript:goSpace('${pageContext.request.contextPath}/admin/merchant/list.html')">查询商户</a></li>
					</ul>
				</dd>

			</dl>
		</dd>
	</dl>
</body>
</html>