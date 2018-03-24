package com.breezer.irp.vo;

public class GiftMoney {
	private long idx;
	private String inesrtDate;
	private String firendName;
	private String eventKind;
	private String eventName;
	private long money;
	private String memo;
	
	
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public String getInesrtDate() {
		return inesrtDate;
	}
	public void setInesrtDate(String inesrtDate) {
		this.inesrtDate = inesrtDate;
	}
	public String getFirendName() {
		return firendName;
	}
	public void setFirendName(String firendName) {
		this.firendName = firendName;
	}
	public String getEventKind() {
		return eventKind;
	}
	public void setEventKind(String eventKind) {
		this.eventKind = eventKind;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	@Override
	public String toString() {
		return "GiftMoney [idx=" + idx + ", inesrtDate=" + inesrtDate + ", firendName=" + firendName + ", eventKind="
				+ eventKind + ", eventName=" + eventName + ", money=" + money + ", memo=" + memo + ", getIdx()="
				+ getIdx() + ", getInesrtDate()=" + getInesrtDate() + ", getFirendName()=" + getFirendName()
				+ ", getEventKind()=" + getEventKind() + ", getEventName()=" + getEventName() + ", getMoney()="
				+ getMoney() + ", getMemo()=" + getMemo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
