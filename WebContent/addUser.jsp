<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>	

	<form action="${pageContext.request.contextPath }/addUser" method="post">
		<input type="text" name="username" placeholder="用户名"  /> <br/><br/>
		<input type="password" name="password" placeholder="密码" /> <br/><br/>
		<input type="submit" value="添加">
	</form>

</body>
</html>