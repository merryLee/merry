package com.cdg.merry.domain;

import java.sql.Date;

public class Board {
	
	private long boardNo;
	private String title;
	private String contents;
	private int userNo;
	private Date createDate;
	private Date updateDate;
	private int hit;
	
	public long getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(long boardNo2) {
		this.boardNo = boardNo2;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

	

}
