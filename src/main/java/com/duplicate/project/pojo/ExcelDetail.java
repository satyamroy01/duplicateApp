package com.duplicate.project.pojo;

public class ExcelDetail {

	private String postApplied;
	private int totalCount;
	private int uniqueCount;
	private int duplicateCount;
	
	
	@Override
	public String toString() {
		return "ExcelDetail [postApplied=" + postApplied + ", totalCount=" + totalCount + ", uniqueCount=" + uniqueCount
				+ ", duplicateCount=" + duplicateCount + "]";
	}
	
	public String getPostApplied() {
		return postApplied;
	}
	public void setPostApplied(String postApplied) {
		this.postApplied = postApplied;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getUniqueCount() {
		return uniqueCount;
	}
	public void setUniqueCount(int uniqueCount) {
		this.uniqueCount = uniqueCount;
	}
	public int getDuplicateCount() {
		return duplicateCount;
	}
	public void setDuplicateCount(int duplicateCount) {
		this.duplicateCount = duplicateCount;
	}
	
	
}
