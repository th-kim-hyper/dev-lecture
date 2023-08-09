package com.example.demo.model;

import java.util.Date;

public class TodoItem {
	
	private String content;
	private String status;
	private Date createDt;
	
	public TodoItem() {
		
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	@Override
	public String toString() {
		return "TodoItem : " + super.toString();
	}
	
}
