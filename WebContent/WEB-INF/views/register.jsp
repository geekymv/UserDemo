<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>
	username:<input type="text" id="username" name="username"/>	<br/>
	password:<input type="password" id="password" name="password"/> <br/>
	repassword:<input type="password" id="repassword" name="repassword"/> <br/>
	
	interests:
	<input type="checkbox" name="interests" value="1" /> 11
	<input type="checkbox" name="interests" value="2" /> 22
	<input type="checkbox" name="interests" value="3" /> 33
	<input type="checkbox" name="interests" value="4" /> 44
	
	<br/>
	<input type="button" value="注册" id="register" />
	
	<script type="text/javascript" src="resources/scripts/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="resources/scripts/ui/user.js"></script>
</body>

</html>