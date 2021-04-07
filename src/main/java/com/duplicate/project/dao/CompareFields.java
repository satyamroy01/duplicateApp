package com.duplicate.project.dao;
import java.util.Comparator;

import com.duplicate.project.pojo.CandidateDetails;
import com.duplicate.project.pojo.DuplicateDetails;

 public class CompareFields  implements Comparator<DuplicateDetails> {
	@Override 
	public int compare(DuplicateDetails a, DuplicateDetails b) 
	    { 
			return b.getUser_id().compareTo(a.getUser_id()); 
	    } 


}