(function() {
	var datas = {};

	// 用户点击注册
	$('#register').click(function() {
		
		datas.username = $('#username').val();
		datas.password = $('#password').val();
		datas.repassword = $('#repassword').val();
		
		// 前端数据验证
		if(!datas.username) {
			alert('用户名不能为空！');
			return;
		}
		
		if(!datas.password) {
			alert('密码不能为空！');
			return;
		}else {
			if(datas.password != datas.repassword) {
				alert('密码不一致！');
				return;
			}
		}
		
		var interests = [];
		$('input[name=interests]:checked').each(function() {
			var inter = $(this).val();
			interests.push(inter);
		});
		
		// 至少选择一个 interests
		if(interests.length < 1) {
			alert('至少选择一个 interests');
			return;
		}
		
//		datas.interests = interests.toString();
		datas.interests = interests.join(',');
		
		// 上面几行代码相当于
		/*
		var datas = {
				'username': $('#username').val(),
				'password': $('#password').val(),
				'repassword': $('#repassword').val(),
				'interests': interests.toString()
			};
		*/
		// 采用ajax提交用户数据
		$.post('register', datas).done(function(data) {
			console.log(data);
			
		}).fail(function() {
		});
		
	});
	
})();