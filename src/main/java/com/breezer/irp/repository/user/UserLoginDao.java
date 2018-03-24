package com.breezer.irp.repository.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.breezer.irp.vo.UserVo;

@Repository("UserLoginDao")
public class UserLoginDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public UserVo getUserInfo(UserVo vo) {
		UserVo result = sqlSession.selectOne("userlogin.getUserInfo", vo);
		return result;
	}

}
