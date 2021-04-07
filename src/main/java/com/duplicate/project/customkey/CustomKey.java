package com.duplicate.project.customkey;

import java.sql.Date;

import com.duplicate.project.pojo.DuplicateDetails;

public class CustomKey {
	
	
	
	  private long id;
	  private String name;
	  private String mother_name;
	  private String father_name;
	  private Date dob;
	   
	  public CustomKey(final DuplicateDetails duplicateDetails)
	  {
	    this.name = duplicateDetails.getCandidateName();
	    this.father_name = duplicateDetails.getFatherName();
	    this.mother_name = duplicateDetails.getFatherName();
	    this.dob=duplicateDetails.getDob();
	    
	  }
	   
	  //Getters and setters
	   
	  @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + (int) (id ^ (id >>> 32));
	    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	    CustomKey other = (CustomKey) obj;
	    if (name != other.name)
	      return false;
	    if (name == null) {
	      if (other.name != null)
	        return false;
	    } else if (!name.equals(other.name))
	      return false;
	    
	    
	    if (father_name != other.father_name)
		      return false;
		    if (father_name == null) {
		      if (other.father_name != null)
		        return false;
		    } else if (!father_name.equals(other.father_name))
		      return false;
		    
		    if (mother_name != other.mother_name)
			      return false;
			    if (mother_name == null) {
			      if (other.mother_name != null)
			        return false;
			    } else if (!mother_name.equals(other.mother_name))
			      return false;
			    
			    if (dob != other.dob)
				      return false;
				    if (dob == null) {
				      if (other.dob != null)
				        return false;
				    } else if (!dob.equals(other.dob))
				      return false;
	    return true;
	  }
	}


