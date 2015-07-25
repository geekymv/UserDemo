<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
<style type="text/css">
	tr, td, th{
		border: 1px solid #ccc;
	}
</style>
</head>

<body>
	<!-- 从session中获取用户名 -->
	欢迎${user.username } 访问...
	
	<h2>用户列表</h2>
	<table style="width: 400px; height: 100px; border: 1px solid #ccc; border-collapse: collapse; text-align: center;">
		<thead>
			<tr>
				<th>编号</th>
				<th>用户名</th>
				<th>密码</th>
			</tr>
		</thead>
		<tbody id="users">
		</tbody>

	</table>
	
	<hr/>
	
	<a href="${pageContext.request.contextPath }/addUser">添加用户</a>	
	

	
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/scripts/jquery-1.8.3.min.js"></script>
	
	<script type="text/javascript">
		var contextPath = '${pageContext.request.contextPath}';
	</script>
	
	<script type="text/javascript">
		$(function() {
			// 使用post请求用户列表数据，渲染在页面上
			$.post(contextPath+'/users', 'json').done(function(datas) {
				
				// 将后台返回的字符串数据转换成json格式的
				datas = JSON.parse(datas);
				
				var html = '';
				for(var i = 0, len = datas.length; i < len; i++) {
					var user = datas[i];
					
					html += '<tr>'
							+ '<td>'+user.id+'</td>'
							+ '<td>'+user.username+'</td>'
							+ '<td>'+user.password+'</td>'
						 + '</tr>';
				}
				// 将拼接后的用户列表渲染在页面上
				$('#users').html(html);
				
			}).fail(function(res) {
			});
			
		});	
	</script>
</body>
</html>