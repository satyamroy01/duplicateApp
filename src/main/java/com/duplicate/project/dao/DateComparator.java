package com.duplicate.project.dao;

import java.util.Comparator;

import com.duplicate.project.pojo.CandidateDetails;

 public class DateComparator  implements Comparator<CandidateDetails> {
	@Override 
	public int compare(CandidateDetails a, CandidateDetails b) 
	    { 
			return b.getUserId().compareTo(a.getUserId()); 
	    } 


}
