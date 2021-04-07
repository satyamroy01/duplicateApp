package com.duplicate.project.duplicate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.collections.impl.block.factory.HashingStrategies;
import org.eclipse.collections.impl.utility.ListIterate;


import com.duplicate.project.dao.Dao;


import com.duplicate.project.pojo.CandidateDetails;
import com.duplicate.project.pojo.DuplicateDetails;
import com.duplicate.project.pojo.ExcelDetail;
import com.duplicate.project.pojo.ExcelView;
import com.duplicate.project.pojo.RddPosts;
import com.duplicate.project.util.DbConnection;



/**
 * Hello world!
 *
 */
public class App2 
{

   
	public static void main( String[] args )
    {
 
    	Dao dao=new Dao();
    	List<CandidateDetails> CandidateList=new ArrayList<CandidateDetails>();
    	
      
    	
        int count1=0;
    	List<DuplicateDetails> list1= new ArrayList<DuplicateDetails>(); 
    	List<CandidateDetails> list2= new ArrayList<CandidateDetails>(); 
    	List<CandidateDetails> isDuplicateList= new ArrayList<CandidateDetails>();
    	List<CandidateDetails> differnceList= new ArrayList<CandidateDetails>();
        
    	List <DuplicateDetails> Posts = new ArrayList<DuplicateDetails>();
    	Posts=Dao.getPost();
        
    	
    	//excel detail
    	 List<ExcelDetail> ExcelPrint = new ArrayList<ExcelDetail>();
    	//ExcelDetail ex= new ExcelDetail();
    	
    	
    	for(DuplicateDetails d :Posts) {
    		ExcelDetail ex= new ExcelDetail();
    		list1=Dao.getList1(d.getAllPosts()); // to get list of candidates
        	System.out.println("list1 size"+list1.size());
    		
        	int count=0;
        	int i=0;
        	
        	@SuppressWarnings("unchecked")
    		List<DuplicateDetails> list11 = list1
                    .stream()
                    .filter(distinctByKeys(DuplicateDetails::getCandidateName, DuplicateDetails::getFatherName,DuplicateDetails::getMotherName,DuplicateDetails::getDob))
                    .collect(Collectors.toList());
        	
        	
        	list1.removeAll(list11);
        	
        	
        	
        	//unique duplicate list generation
        	@SuppressWarnings("unchecked")
    		List<DuplicateDetails> filteredList = list1
                    .stream()
                    .filter(distinctByKeys(DuplicateDetails::getCandidateName, DuplicateDetails::getFatherName,DuplicateDetails::getMotherName,DuplicateDetails::getDob))
                    .collect(Collectors.toList());
        	System.out.println("count of distinct"+filteredList.size());
        	
        	
        	CandidateList=Dao.getCandidatesList(d.getAllPosts());
        	System.out.println("CandidateList size "+CandidateList.size());
        	
        	for(CandidateDetails cd:CandidateList) {
        		for(DuplicateDetails ds:filteredList) {
        			if((cd.getCandidateName().equalsIgnoreCase(ds.getCandidateName())) && (cd.getFatherName().equalsIgnoreCase(ds.getFatherName()))
        					&& (cd.getMotherName().equalsIgnoreCase(ds.getMotherName())) && (cd.getDob().equals(ds.getDob())))  {
        				
        					list2.add(cd);
        		}
        		}
        	}
        	
        	System.out.println("list2 size "+list2.size());
        	
        	
        	
        	
        	
        	//To find count of k(no of duplicate registrations done by a candidate for the sheet 1)
			
			  for(DuplicateDetails ds:filteredList) 
			  {
				  for(CandidateDetails cd:list2) 
				  {
			  if((ds.getCandidateName().equalsIgnoreCase(cd.getCandidateName())) &&
			  (ds.getFatherName().equalsIgnoreCase(cd.getFatherName())) &&
			  (ds.getMotherName().equalsIgnoreCase(cd.getMotherName())) &&
			  (ds.getDob().equals(cd.getDob()))) {
				  i++;
			  
			  }
			  ds.setCount(i); 
			  } 
				  i=0;
			  }
			 
        	
        	//unique_referrence_report
			
			  ex.setPostApplied(d.getAllPosts());
			  
			  ex.setTotalCount(CandidateList.size());
			  ex.setUniqueCount(filteredList.size()); 
			  ex.setDuplicateCount(list2.size());
			  
			  ExcelPrint.add(ex);
			 
        	//unique_referrence_report////
        	
        	
        	
        	
        	
        	System.out.println("excel:::...:::::::::"+ex.toString());
        	
      //  System.out.print("excel::::::::+++::::"+ExcelPrint.toString());
		if(!(list2.size()==0)) {
			 	
			  
			//	String replaced = d.getExamCode().replaceAll("[()]", "");
			//	 replaced = d.getExamCode().replace("(", "").replace(")","").replace("-","").replace("_","");
			//	 replaced = replaced.replaceAll("[  ]", "");
			
			
		//	  String excelFilePath2 = "D:\\Department\\MIDC\\"+d.getAllPosts() +".xls";
			  
			/* try { 
				 //dao.writeExcel(filteredList, excelFilePath2);
			  
			  dao.writeExcel2(list2,excelFilePath2,d.getAllPosts());
			  
			  } catch(IOException e)
			  {
				  e.printStackTrace();
			  }
			 */
				  
				  list2.clear();
				 // ExcelPrint.clear();
			}
			else {
				count1++;
			}
			
			
			 list2.clear();
    	}
    //ExcelPrint.add(ex);
    	
    //System.out.print("excel::::::::+++::::"+ExcelPrint.toString());
    	 
    	 
		
		  String excelFilePath2 = "D:\\Department\\MIDC\\MIDC_DUP_REPORT_UNIQUE.xls";
	/*	  
	try { // dao.writeExcel(filteredList, excelFilePath2);
		  dao.writeExcel3(ExcelPrint,excelFilePath2);
		  } 
	catch(IOException e)
		{ 
			e.printStackTrace(); 
		  }*/
		 
    	 
    	 
    	 
    }
    	
    
    	
   
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
    
    	

    
   

