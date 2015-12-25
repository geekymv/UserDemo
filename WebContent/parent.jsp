<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>父页面</title>
</head>
<body>
	<button onclick="showChild()">点击</button>
	
	<input type="text" id="yeye" value="我是默认值" />
	
	<script type="text/javascript">
		function showChild() {
			window.open("child.jsp", "我是子页面", 200, 400);
		}
	</script>
</body>
</html>