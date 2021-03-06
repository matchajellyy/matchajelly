package com.spring.dct.vo;

public class CartsVO {

	private int cartNo;
	private int userNo;
	private int cartAmount;
	private int lectureNo;
	private int mentoringNo;
	
	public int getCartNo() {
		return cartNo;
	}
	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getCartAmount() {
		return cartAmount;
	}
	public void setCartAmount(int cartAmount) {
		this.cartAmount = cartAmount;
	}
	public int getLectureNo() {
		return lectureNo;
	}
	public void setLectureNo(int lectureNo) {
		this.lectureNo = lectureNo;
	}
	public int getMentoringNo() {
		return mentoringNo;
	}
	public void setMentoringNo(int mentoringNo) {
		this.mentoringNo = mentoringNo;
	}
	
	@Override
	public String toString() {
		return "CartsVO [cartNo=" + cartNo + ", userNo=" + userNo + ", cartAmount=" + cartAmount + ", lectureNo="
				+ lectureNo + ", mentoringNo=" + mentoringNo + "]";
	}

}
