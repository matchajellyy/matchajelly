package com.spring.dct.vo;

import java.sql.Timestamp;

/*
 CREATE TABLE mentor_comments (
    rno NUMBER PRIMARY KEY,
    writer VARCHAR2(50) NOT NULL,
    mentoring_no NUMBER NOT NULL,
    content VARCHAR2(1000) NOT NULL,
    reg_date DATE DEFAULT sysdate,
    update_date DATE DEFAULT NULL
);

ALTER TABLE mentor_comments 
ADD rating NUMBER NOT NULL;
 */

public class MentoringReplyVO {
	
	private int rno;
	private String writer;
	private int mentoringNo;
	private String content;
	private Timestamp regDate;
	private Timestamp updateDate;
	private int rating;
	
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getMentoringNo() {
		return mentoringNo;
	}
	public void setMentoringNo(int mentoringNo) {
		this.mentoringNo = mentoringNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "MentoringReplyVO [rno=" + rno + ", writer=" + writer + ", mentoringNo=" + mentoringNo + ", content="
				+ content + ", regDate=" + regDate + ", updateDate=" + updateDate + ", rating=" + rating + "]";
	}
	
	
	

}






















