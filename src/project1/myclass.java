package project1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class myclass {
	 static Map <String,ArrayList<Integer>> hashmap = new HashMap<String,ArrayList<Integer>>();
	public static void main(String[] args) {
	
      Map <String,Integer> dict= new HashMap<String,Integer>();
      Map <String,Integer> dict1 = new HashMap<String,Integer>();
     
      Scanner sc = new Scanner(System.in);
      System.out.println("How many entries");
      
     
      int m = sc.nextInt();
      int value =0;
      String v ="";
      String m1 ="";
      for(int i=0; i<m; i++)
      {
    	  String key = sc.next();
    	  value = sc.nextInt();
    	  dict.put(key, value);
      }
     for( Entry<String,Integer> entry : dict.entrySet())
     {
    	   
           v = entry.getKey();
          
           try {
			 m1 =datetoday(v);
		     /*  
		      
		       while (iterator.hasNext()) {
		    	   
	                // Get the entry at this iteration
	              
	  
	                System.out.println(entry1.getKey());
	                if (entry1.getKey().equals(m1)) {
	                    val = val+entry.getValue();
	                    
	                }
	                
	               
	            }*/
		       addValues(m1,entry.getValue());
		     /*  if(dict1.containsKey(m1))
		    	{
		    	   val = val + entry.getValue();
		    	}
		       dict1.put(m1,val);*/
			    
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
        
     
	}
     Iterator it = hashmap.keySet().iterator();
     ArrayList<Integer> templist = null;
     
   if( hashmap.containsKey("monday")&& hashmap.containsKey("sunday"))
   {
	   while(it.hasNext())
	     {
	    	 int f =0;
	    	 String key = it.next().toString();
	    	 templist = hashmap.get(key);
	    	 if(templist !=null) {
	    		 for(int h:templist) {
	    			 f += h;
	    		 }
	    	 }
	    	 
	    	 dict1.put(key,f);
	     } 
   }else
   {
	   System.out.println("do not have valid entry");
   }
     
     for(Entry<String,Integer> entry1 :dict1.entrySet())
     {
    	System.out.println(entry1.getKey()+entry1.getValue());
     }
     
	
      
	}
	public static String datetoday(String v) throws ParseException {
		   Calendar c = Calendar.getInstance();
           java.util.Date date1;
		date1 = new SimpleDateFormat("dd-MM-yyyy").parse(v);
  		c.setTime(date1);
  		String dayWeekText = new SimpleDateFormat("EEEE").format(date1);
  		return dayWeekText;
		
	}
	 private static void addValues(String key,int n)
     {
     	ArrayList<Integer> templist =null;
     	if(hashmap.containsKey(key))
     	{
     		templist = hashmap.get(key);
     		if(templist == null)
     			templist = new ArrayList<Integer>();
     		templist.add(n);
     	}else
     	{
     		templist = new ArrayList<Integer>();
     		templist.add(n);
     	}
     	hashmap.put(key,templist);
     } 
   
}
