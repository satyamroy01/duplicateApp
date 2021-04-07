package com.duplicate.project.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
	
	 public static Connection getConnection(){  
	        Connection con=null;  
	        try{
	        	
	        	FileInputStream fis=new FileInputStream("src/main/java/com/duplicate/project/util/connection.prop"); 
	            Properties p=new Properties (); 
	            p.load (fis); 
	            String dname= (String) p.get ("Dname"); 
	            String url= (String) p.get ("URL"); 
	            String username= (String) p.get ("Uname"); 
	            String password= (String) p.get ("password"); 
	            Class.forName(dname);  
	          con=DriverManager.getConnection(url,username,password); 
	            //  con=DriverManager.getConnection("jdbc:postgresql://10.100.101.157:5432/MIDC_FIRE_AFTER_AUTOSUBMIT","mumbai_test","db@mumbai157"); 
	            //con=DriverManager.getConnection("jdbc:postgresql://10.25.4.46:5432/REVENUE","postgres","root"); 
	            System.out.println("Db Connected");
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }  
	        return con;  
	    }  
	

}
