package com.duplicate.project.duplicate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.duplicate.project.dao.Dao;
import com.duplicate.project.pojo.CandidateDetails;
import com.duplicate.project.pojo.DuplicateDetails;



/**
 * Hello world!
 *
 */
public class App 
{

   
	public static void main( String[] args )
    {
 
    	Dao dao=new Dao();
    	List<CandidateDetails> CandidateList=new ArrayList<CandidateDetails>();
    	
      
    	
        
    	List<DuplicateDetails> list1= new ArrayList<DuplicateDetails>(); 
    	List<CandidateDetails> list2= new ArrayList<CandidateDetails>(); 
    	List<CandidateDetails> isDuplicateList= new ArrayList<CandidateDetails>();
    	List<CandidateDetails> isDuplicateList1= new ArrayList<CandidateDetails>();
    	//List<CandidateDetails> differnceList= new ArrayList<CandidateDetails>();
        
    	//list1=Dao.getList1(); // to get list of candidates
    	System.out.println("list1 size(Total count of candidates): "+list1.size());
    	System.out.println(list1.toString());
    	
    	
    	CandidateList=Dao.getCandidatesList();
    	
    	
    	int count=0;
    	int i=0;
    	
    	

    //**************** normal condition	

 	@SuppressWarnings("unchecked")
	List<DuplicateDetails> list11 = list1
                .stream()
                .filter(distinctByKeys(DuplicateDetails::getCandidateName, DuplicateDetails::getFatherName,DuplicateDetails::getMotherName,DuplicateDetails::getDob))
                .collect(Collectors.toList());
 	//two parameters
 	/*List<DuplicateDetails> list11 = list1
            .stream()
            .filter(distinctByKeys(DuplicateDetails::getCandidateName, DuplicateDetails::getDob))
            .collect(Collectors.toList());*/
    	
 	list1.removeAll(list11);
    	
    	
    	
    	//unique duplicate list generation
    	@SuppressWarnings("unchecked")
	List<DuplicateDetails> filteredList = list1
                .stream()
                .filter(distinctByKeys(DuplicateDetails::getCandidateName, DuplicateDetails::getFatherName,DuplicateDetails::getMotherName,DuplicateDetails::getDob))
                .collect(Collectors.toList());
    	/*List<DuplicateDetails> filteredList = list1
                .stream()
                .filter(distinctByKeys(DuplicateDetails::getCandidateName,DuplicateDetails::getDob))
                .collect(Collectors.toList());*/
    	System.out.println("count of distinct duplicates "+filteredList.size());
    	//System.out.println(filteredList.toString());
    	
    	CandidateList=Dao.getCandidatesList();
    	System.out.println("CandidateList size "+CandidateList.size());
    		
    	
    	
    	
    	//Complete duplicate list generation (Sheet 2 generation) 
 	for(CandidateDetails cd:CandidateList) {
    		for(DuplicateDetails ds:filteredList) {
    			if((cd.getCandidateName().equalsIgnoreCase(ds.getCandidateName())) && (cd.getFatherName().equalsIgnoreCase(ds.getFatherName()))
    					&& (cd.getMotherName().equalsIgnoreCase(ds.getMotherName())) && (cd.getDob().equals(ds.getDob())) )  {
    				
    					list2.add(cd);
    					
    		}
    		}
    	}
 	
			
 	System.out.println("list2 size(count of total duplicates): "+list2.size());
 	
 	
 	
 	
    	//for two parameters
    	/*for(CandidateDetails cd:CandidateList) {
    		for(DuplicateDetails ds:filteredList) {
    			if((cd.getCandidateName().equalsIgnoreCase(ds.getCandidateName()))  && (cd.getDob().equals(ds.getDob())))  {
    				
    					list2.add(cd);
    		}
    		}
    	}*/
    	
    	
    	//To find count of k(no of duplicate registrations done by a candidate for the sheet 1)
    	for(DuplicateDetails ds:filteredList) {
    	for(CandidateDetails cd:list2) {
    			if((ds.getCandidateName().equalsIgnoreCase(cd.getCandidateName())) && (ds.getFatherName().equalsIgnoreCase(cd.getFatherName()))
    					&& (ds.getMotherName().equalsIgnoreCase(cd.getMotherName())) && (ds.getDob().equals(cd.getDob())) )  {
    				i++;
    				
    				/*switch(i) {
        			case 2:ds.setCount(2);
        			break;
        			case 3:ds.setCount(3);
        			break;
        			case 4:ds.setCount(4);
        			break;
        			case 5:ds.setCount(5);
        			break;
        			case 6:ds.setCount(6);
        			break;
        			case 7:ds.setCount(7);
        			break;
        			case 8:ds.setCount(8);
        			break;
        			case 9:ds.setCount(9);
        			break;
        			case 10:ds.setCount(10);
        			break;
        			case 11:ds.setCount(11);
        			break;
        			case 12:ds.setCount(12);
        			break;
        			}*/
    				
    			}
    		ds.setCount(i);	
    	}
    	i=0;
    	}
    	// two parameters k count
    	/*for(DuplicateDetails ds:filteredList) {
        	for(CandidateDetails cd:list2) {
        			if((ds.getCandidateName().equalsIgnoreCase(cd.getCandidateName())) &&  (ds.getDob().equals(cd.getDob())))  {
        				i++;
        			}
        		ds.setCount(i);	
        	}
        	i=0;
        	}*/
	
    	
    	
    	
    	//String excelFilePath = "D:\\Department\\Water\\Duplicate\\Unique_Dietician.xls";
    	String excelFilePath2 = "D:\\Department\\MUHS\\audit_report\\MUHS_DUPLICATE_REPORT\\Steno-Typist.xls";
    	
    	try {
    	dao.writeExcel(filteredList, excelFilePath2);
    	dao.writeExcel2(list2, excelFilePath2);
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
 	
    	}
    	
		
    
    
    	
	/* public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
     {
       Map<Object, Boolean> seen = new ConcurrentHashMap<>();
       return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
     }*/
	
	
    
   
    	
    	

    
    	
   
    private static <T> Predicate<T> distinctByKeys(Function<? super T, ?>... keyExtractors)
    {
      final Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();
       
      return t ->
      {
        final List<?> keys = Arrays.stream(keyExtractors)
                    .map(ke -> ke.apply(t))
                    .collect(Collectors.toList());
         
        return seen.putIfAbsent(keys, Boolean.TRUE) == null;
      };
    }
  
 }
    
    	

    
   

