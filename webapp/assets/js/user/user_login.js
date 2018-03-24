


/*
function login_submit() {
	console.log("====== login_submit ======")
}*/


$(function(){
	
	// 아이디 보이기/숨기기
	inputId = document.getElementById("id")
	idLabel = document.getElementById("id-label")
	
	inputId.onkeyup = function(event) {
		if( inputId.value.length > 0 ) {
			idLabel.style.display="none";
		} else {
			idLabel.style.display="block";
		}
	}
	
	// 비밀번호 보이기/숨기기
	inputPw = document.getElementById("pw")
	pwLabel = document.getElementById("password-label")
	
	inputPw.onkeyup = function(event) {
		if( inputPw.value.length > 0 ) {
			pwLabel.style.display="none";
		} else {
			pwLabel.style.display="block";
		}
	}
	
})










