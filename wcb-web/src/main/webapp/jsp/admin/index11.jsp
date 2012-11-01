<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/adminIndex.css"
	rel="stylesheet" type="text/css" />
<title>首页</title>
<%@include file="include/header.jsp"%>
<link href="${pageContext.request.contextPath}/css/tree.css"
	rel="stylesheet" />
</head>
<body>
	<div class="container">
		<div class="top">顶部</div>
		<div class="left">
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
		</div>
		<div class="right" id="mainContent">右侧</div>
		<div class="foot">底部</div>
	</div>
</body>
<%@include file="include/footer.jsp"%>
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
		//window.parent.mainFrame.location.href = obj;
		$("#mainContent").load(obj);
	}
</script>
</html>