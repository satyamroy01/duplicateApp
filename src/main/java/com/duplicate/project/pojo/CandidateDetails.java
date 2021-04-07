package com.duplicate.project.pojo;

import java.sql.Date;

public class CandidateDetails {
	
	
	private Long examId;
	private Long userId;
	private String preferredLocation1;
	private String preferredLocation2;
	private String preferredLocation3;
	private boolean physicalDisability;
	private Date dob;
	private String candidateName;
	private String fatherName;
	private String motherName;
	private String postname;
	private String centreName;
	private String slotCode;
	private String freefield21;
	public String getFreefield21() {
		return freefield21;
	}
	public void setFreefield21(String freefield21) {
		this.freefield21 = freefield21;
	}
	private String email;
	private long mobileNum;
	public String getCentreName() {
		return centreName;
	}
	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}
	public String getSlotCode() {
		return slotCode;
	}
	public void setSlotCode(String slotCode) {
		this.slotCode = slotCode;
	}
	public String getPostname() {
		return postname;
	}
	public void setPostname(String postname) {
		this.postname = postname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidateName == null) ? 0 : candidateName.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((examId == null) ? 0 : examId.hashCode());
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + (int) (mobileNum ^ (mobileNum >>> 32));
		result = prime * result + ((motherName == null) ? 0 : motherName.hashCode());
		result = prime * result + (physicalDisability ? 1231 : 1237);
		result = prime * result + ((preferredLocation1 == null) ? 0 : preferredLocation1.hashCode());
		result = prime * result + ((preferredLocation2 == null) ? 0 : preferredLocation2.hashCode());
		result = prime * result + ((preferredLocation3 == null) ? 0 : preferredLocation3.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CandidateDetails other = (CandidateDetails) obj;
		if (candidateName == null) {
			if (other.candidateName != null)
				return false;
		} else if (!candidateName.equals(other.candidateName))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (examId == null) {
			if (other.examId != null)
				return false;
		} else if (!examId.equals(other.examId))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (mobileNum != other.mobileNum)
			return false;
		if (motherName == null) {
			if (other.motherName != null)
				return false;
		} else if (!motherName.equals(other.motherName))
			return false;
		if (physicalDisability != other.physicalDisability)
			return false;
		if (preferredLocation1 == null) {
			if (other.preferredLocation1 != null)
				return false;
		} else if (!preferredLocation1.equals(other.preferredLocation1))
			return false;
		if (preferredLocation2 == null) {
			if (other.preferredLocation2 != null)
				return false;
		} else if (!preferredLocation2.equals(other.preferredLocation2))
			return false;
		if (preferredLocation3 == null) {
			if (other.preferredLocation3 != null)
				return false;
		} else if (!preferredLocation3.equals(other.preferredLocation3))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "CandidateDetails [examId=" + examId + ", userId=" + userId + ", preferredLocation1="
				+ preferredLocation1 + ", preferredLocation2=" + preferredLocation2 + ", preferredLocation3="
				+ preferredLocation3 + ", physicalDisability=" + physicalDisability + ", dob=" + dob
				+ ", candidateName=" + candidateName + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", postname=" + postname + ", centreCode=" + centreName + ", slotCode=" + slotCode + ", email="
				+ email + ", mobileNum=" + mobileNum + "]";
	}
	public Long getExamId() {
		return examId;
	}
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPreferredLocation1() {
		return preferredLocation1;
	}
	public void setPreferredLocation1(String preferredLocation1) {
		this.preferredLocation1 = preferredLocation1;
	}
	public String getPreferredLocation2() {
		return preferredLocation2;
	}
	public void setPreferredLocation2(String preferredLocation2) {
		this.preferredLocation2 = preferredLocation2;
	}
	public String getPreferredLocation3() {
		return preferredLocation3;
	}
	public void setPreferredLocation3(String preferredLocation3) {
		this.preferredLocation3 = preferredLocation3;
	}
	public boolean isPhysicalDisability() {
		return physicalDisability;
	}
	public void setPhysicalDisability(boolean physicalDisability) {
		this.physicalDisability = physicalDisability;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	
	

}
