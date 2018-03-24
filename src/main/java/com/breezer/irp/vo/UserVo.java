package com.breezer.irp.vo;

public class UserVo {
	private long idx;
	private String id;
	private String pw;
	private String nickName;
	
	
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
	@Override
	public String toString() {
		return "UserVo [idx=" + idx + ", id=" + id + ", pw=" + pw + ", nickName=" + nickName + "]";
	}
	
	
	
	

}
