package com.duplicate.project.pojo;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;

public class DuplicateDetails {
	private int count;
	private Long user_id;
	private String candidateName;
	private String motherName;
	private String fatherName;
	private Date dob;
	//private Array  postApplied;
	private String postApplied;
	private String allPosts;
	private String freefield21;
	
	
	
	
	public String getFreefield21() {
		return freefield21;
	}
	public void setFreefield21(String freefield21) {
		this.freefield21 = freefield21;
	}
	public String getAllPosts() {
		return allPosts;
	}
	public void setAllPosts(String allPosts) {
		this.allPosts = allPosts;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	public String getCandidateName() {
		return candidateName;
	}
	
	
	
	@Override
	public String toString() {
		return "DuplicateDetails [count=" + count + ", user_id=" + user_id + ", candidateName=" + candidateName
				+ ", motherName=" + motherName + ", fatherName=" + fatherName + ", dob=" + dob + ", postApplied="
				+ postApplied + ", allPosts=" + allPosts + "]";
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getUser_id() {
		return user_id;
	}
	public String getPostApplied() {
		return postApplied;
	}
	public void setPostApplied(String postApplied) {
		this.postApplied = postApplied;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	/*public void setPostApplied(Array array) {
		// TODO Auto-generated method stub
		this.postApplied = array;
	}*/
	

}
