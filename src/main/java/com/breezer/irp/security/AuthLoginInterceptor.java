package com.breezer.irp.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.breezer.irp.dto.JSONResult;
import com.breezer.irp.service.user.UserLoginService;
import com.breezer.irp.vo.UserVo;
import com.fasterxml.jackson.databind.ObjectMapper;


public class AuthLoginInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	private UserLoginService userLoginService;
	
	@Override
	public boolean preHandle( 
		HttpServletRequest request, 
		HttpServletResponse response, 
		Object handler
		)
		throws Exception {
		System.out.println("====== AuthloginInterceptor ======");
		

		// 요청 url로 부터 변수 데이터를 받는다 
		UserVo vo = new UserVo();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		vo.setId(id);
		vo.setPw(pw);

		// 받은 데이터로부터 user 정보를 가져온다 
		System.out.println("auth/user/login vo = " + vo );
		UserVo userVo = userLoginService.loginMessage(vo);
		
		// userVo 가 null 이면 id가 존재하지 않으므로 다시 로그인 페이지로 보낸다 
		if( userVo == null ) {
			System.out.println("authLogin : get user info fail");
			//response.sendRedirect( request.getContextPath() + "/" );
			
			response.sendRedirect( request.getContextPath() +"/login" );
			return false;
			/*
			JSONResult jsonResult = JSONResult.fail("login");
			String json = new ObjectMapper().writeValueAsString( jsonResult );
		
			response.setContentType( "application/json; charset=utf-8" );
			response.getWriter().print( json );
			return false;*/
		}
		
		

		
		
		// userVo, id 둘다 존재하므로 세션을 저장하고 mytour 페이지로 이동한다 
		
		System.out.println("authLogin : login success");
		//System.out.println("login id : " + userVo.getId());
		
		// session 처리
		HttpSession session = request.getSession( true );
		session.setAttribute( "authUser", userVo );
		
		response.sendRedirect( request.getContextPath() +"/main" );
		//JSONResult jsonResult = JSONResult.success(userVo.getId());
		//String json = new ObjectMapper().writeValueAsString( jsonResult );
	
		//response.setContentType( "application/json; charset=utf-8" );
		//response.getWriter().print( json );
		
		
		
		
		return false;
	}

}
