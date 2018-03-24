


/*
function login_submit() {
	console.log("====== login_submit ======")
}*/



function login() {
	console.log("====== login ======")
	$.ajax({
		url : "/IRP/user/login",
		type : "post",
		dataType : "json",
		data : "fbId=" + fb_userID + "&nickName=" + fb_name + "&token="
				+ fb_token + "&signedRequest=" + fb_signedRequest
				+ "&expiresIn=" + fb_expiresIn + "&email=" + fb_email
				+ "&gender=" + fb_gender + "&ageRange=" + fb_age_range
				+ "&locale=" + fb_locale + "&pictureUrl=" + fb_picture_url,
		success : function(response) {
			if (response.result == "fail") {
				console.log("response.result = fail")
				if (response.message == "login-id-null") {
					console.log("response.message = login-id-null")
					loginFormRender();
				} else {
					console.log(response.message);
				}

				return;
			}

			console.log("response.result = success")
			console.log("response.data = " + response.data)

			// 로그인 성공시 mytour 페이지로 이동한다
			// window.location.href = "/breezer/tour/mytour"
			window.location.href = "/breezer/" + response.data

		},
		error : function(xhr, status, e) {
			console.error(status + ":" + e);
		}
	});
}