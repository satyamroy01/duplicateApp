package com.duplicate.project.customkey;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Oops {

	int age;
	String colour;
	String breed;
	
	
	
	public Oops(int a,String c,String b) {
		this.age=a;
		this.colour=c;
		this.breed=b;
	}
	
	public Oops(String c,String b) {
		
		this.colour=c;
		this.breed=b;
	}
	public String setBreed(String pug) {
		
		return pug;
	}
	
	@Override
	public String toString() {
		return "Oops [age=" + age + ", colour=" + colour + ", breed=" + breed + "]";
	}

     public static void main(String args[]) {
    	 
    	 Oops object=new Oops(12,"Black","GermanSpherad");
    	 //	System.out.println(object.toString());
    	 	//try {
				//Oops obj=(Oops)Class.forName("com.duplicate.project.customkey.Oops").newInstance();
				
				List<String> s1=new ArrayList<>();
				s1.add("first");
				s1.add("second");
				List<String> s2=new ArrayList<>();
				s2.addAll(s1);
				s1.parallelStream();
				System.out.print("hi "+s2);
				Iterator i=s1.iterator();
				
				if(i.hasNext()) {
					//i.next();
					//i.remove();
					System.out.print("\n"+s1);
				}
								
				LinkedList<String> llist=new LinkedList<>();
				llist.add("ererer");
				llist.addAll(s2);
				Iterator i2=llist.iterator();
				int s=10;
				System.out.print(s++);
				System.out.print(s++);
				System.out.print(--s);
			/*//} catch (InstantiationException e) {	
				// 
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// 
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
     char b=126;
     
			  
}
}