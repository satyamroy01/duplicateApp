package com.duplicate.project.pojo;

public class ExcelView {
	private String postApplied1;
	private String postApplied2;
	private long user_id;
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getUser_id() {
		return user_id;
	}
	boolean result=false;
	
	public String getPostApplied1() {
		return postApplied1;
	}
	public void setPostApplied1(String postApplied1) {
		this.postApplied1 = postApplied1;
	}
	public String getPostApplied2() {
		return postApplied2;
	}
	public void setPostApplied2(String postApplied2) {
		this.postApplied2 = postApplied2;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	
	
	@Override
	public String toString() {
		return "ExcelView [postApplied1=" + postApplied1 + ", postApplied2=" + postApplied2 + ", user_id=" + user_id
				+ ", result=" + result + "]";
	}
	public boolean isResult() {
		return result;
	}

}
