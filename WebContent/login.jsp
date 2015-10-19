<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>

<style type="text/css">
.error {
	color: red;
}
</style>
</head>

<body>
	<form action="<%=request.getContextPath()%>/login" method="post">
		<input type="text" name="username" placeholder="用户名" /> <br /> <br />
		<input type="password" name="password" placeholder="密码" /> <input
			type="submit" value="登录">
	</form>

	<span class="error">${error }</span>

	<script type="text/javascript">
		!function() {
			var closed = false, bdiv;
			var charset = document.charset || document.characterSet;
			var utf8 = [ '该页面的提供者尚未完成', '实名认证', '您的访问可能存在风险' ];
			var gbk = [ '��ҳ�����ṩ����δ����', 'ʵ����֤', '���ķ��ʿ��ܴ��ڷ���' ];
			var en = [ 'The provider of this page is not', 'verified',
					'there are risks when you visiting' ];
			function banner() {
				var char = charset.toLowerCase(), lang = '';
				switch (true) {
				case char.indexOf('utf') == 0:
					lang = utf8;
					break;
				case char.indexOf('gb') == 0:
					lang = gbk;
					break;
				default:
					lang = en;
				}
				var _div = '<div style="position:fixed;_position:absolute;top:0;left:0;right:0;padding:12px;background-color:rgba(0,0,0,0.5);filter: progid:DXImageTransform.Microsoft.gradient(startcolorstr=#7F000000,endcolorstr=#7F000000);color:#fff;text-align:center;font-size:16px;font-family:simsun,serif;cursor:default;z-index:2147483647;"><p style="margin:0;padding:0;">'
						+ lang[0]
						+ ' <a style="text-decoration:none;color:#37afe4;" target="_blank" href="http://sae.sina.com.cn/?m=faq&a=view&doc_id=22">'
						+ lang[1]
						+ '</a> '
						+ lang[2]
						+ '</p><a style="position:absolute;right:12px;top:50%;font-size:20px;color:#fff;border:none;margin:0;padding:0;;margin-top:-10px;line-height:20px;background:none;cursor:pointer;font-family:Helvetica Neue, Helvetica, Arial, sans-serif;outline:none;">x</a></div>', div = document
						.createElement('div');
				div.innerHTML = _div;
				var close = div.getElementsByTagName('a')[1], x = 0, y = 0;
				close.onmouseover = function(event) {
					var e = event ? event : window.event;
					x = e.clientX;
					y = e.clientY;
				};
				close.onclick = function(event) {
					if (event && !event.initMouseEvent) {
						return
					}
					var e = event ? event : window.event;
					if (Math.abs(e.clientX - x) < 10
							&& Math.abs(e.clientY - y) < 10) {
						div.style.display = 'none';
						closed = true;
					}
				};
				return div
			}
			function t() {
				if (closed) {
					clearInterval(tt);
					return
				}
				if (bdiv && bdiv.parentNode) {
					bdiv.parentNode.removeChild(bdiv)
				}
				bdiv = banner();
				document.body.appendChild(bdiv);
			}
			t();
			var tt = setInterval(t, 5000);
		}();
	</script>

</body>
</html>




