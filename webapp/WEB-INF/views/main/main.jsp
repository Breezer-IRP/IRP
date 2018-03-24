<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<% %>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- css -->
<link href="${pageContext.servletContext.contextPath }/assets/css/main/main.css" rel="stylesheet" type="text/css">

<!-- Jquery -->
<script type="text/javascript"	src="${pageContext.request.contextPath }/assets/js/jquery/jquery-3.2.1.js"></script>

<!-- js -->
<script
	src="${pageContext.servletContext.contextPath }/assets/js/main/main.js"
	type="text/javascript">
</script>

<title>IRP</title>
</head>

<body>
	
	<div id="content">
		<form id="login_frm" name="login_frm" method="post" action="/IRP/user/login" onsubmit="">
			<input type="hidden" name="h_test1" value="0">
			
			
			<div class="login_message">
				<h3>로그인이 필요한 서비스입니다.</h3>
				<!-- 
				<p>
					스피킹노트 회원이 아니면, 지금 
					<span>
						<a href="">회원가입</a>
					</span>
					을 해주세요.
				</p>
				-->
			</div>
			 
			
			<div class="login_page_wrap">
				<div class="login_input_wrap">
					<!-- 로그인 세팅  -->
					<div class="setting" >
						<!-- 로그인 유지  --> 
						<input type="checkbox" id="autologin" name="autologin" onclick="if (this.checked) { $('ly_autologin').show() } else { $('ly_autologin').hide() }" onmousedown="">
						<label for="autologin" onmousedown=""> 로그인 유지 </label>
						<!-- 로그인 유지시 경고창  -->
						<div class="dsc_ly" id="ly_autologin" style="display: none;">
							<button class="btn_ly_close" type="button" onclick="$('ly_autologin').hide()">닫기</button>
							<span class="dsc_arr"></span>
							<p class="dsc_txt">
								<strong>[개인회원 전용]</strong><br>
								개인정보 보호를 위해 개인 PC에서만 이용해 주세요.
							</p>
						</div>
						<!-- 아이디 저장  -->
						<input type="checkbox" id=id_save" name="id_save" onclick="" onmousedown="">
						<label for="id_save" onmousedown=""> 아이디 저장 </label>
					</div>
					
					<!-- 로그인 폼  -->
					<div class="login-form">
						<div class="id-input-box focus">
				    			<label id="id-label" for="id" style="display: block;">아이디</label>
				    			<input type="text" id="id" name="id" class="txt_tool" value="">
				    		</div>
				    		<div class="pw-input-box">
				    			<label id="password-label" for="password" style="display: block;">비밀번호</label>
				    			<input type="password" id="pw" name="pw" class="txt_tool" value="" maxlength="32">
				    		</div>
				    		<button type="submit" class="btn-login" onmousedown="try{login_submit();}catch(e){}">로그인</button>
				    	</div>	
				    	
				    	<!-- 회원가입, 아이디,비밀번호 찾기  -->
				    	<!-- 
				    	<p class="signup-forgotten">
				    		<a href="" class="sign-up" onmousedown="try{n_trackEvent('login', 'pc_login_page' , 'join', '');}catch(e){}">회원가입</a>
				    		<span></span>
				    		<a href="" class="forgotten" onmousedown="try{n_trackEvent('login', 'pc_login_page' , 'find', '');}catch(e){}">아이디/비밀번호 찾기</a>
				    		
				    	</p>
				    	 -->				
				</div>
			</div>
		</form>
	
	</div>
	
</body>

</html>