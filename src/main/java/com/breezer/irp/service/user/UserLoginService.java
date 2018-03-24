package com.breezer.irp.service.user;

import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breezer.irp.repository.user.UserLoginDao;
import com.breezer.irp.vo.UserVo;

@Service("UserLoginService")
public class UserLoginService {
	
	@Autowired
	private UserLoginDao userLoginDao;
		
	public UserVo loginMessage(UserVo vo) {
		System.out.println("====== userLoginService: loginMessage ======");
		// pw 암호화
		try{
			 
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(vo.getPw().getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();
 
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
 
            // 결과갑 대입
            vo.setPw(hexString.toString());
            System.out.println("incoded pw : "+hexString.toString());
            
            
 
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
		
		return userLoginDao.getUserInfo(vo);
	}

}
