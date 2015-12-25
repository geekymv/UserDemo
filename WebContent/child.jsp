<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>弹框页面</title>
</head>
<body>
	你好！我是弹框页面
	<button onclick="closePage()">关闭</button>
	<script type="text/javascript">
	
		function closePage() {
		//	window.opener.close(); // 关闭父窗口
			// 给父窗口标签赋值
			window.opener.document.getElementById("yeye").value = "我是子页面传递过来的值"; 
			window.close(); // 关闭当前窗口
		}
	</script>
</body>
</html>