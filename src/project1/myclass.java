package project1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;







public class myclass {
	  static Map <String,ArrayList<Integer>> hashmap = new HashMap<String,ArrayList<Integer>>();
	
	  public static Map<String,Integer>function(Map<String,Integer> dict){
   
      Map <String,Integer> dict1 = new HashMap<String,Integer>();
      int value =0;
      String v ="";
      String m1 ="";
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
     
   if( hashmap.containsKey("Monday")&& hashmap.containsKey("Sunday"))
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
         if(!dict1.containsKey("Tuesday"))
         {
        	 int valu = (dict1.get("Monday")+dict1.get("Wednesday"))/2; 
        	  dict1.putIfAbsent("Tuesday", valu);
         }
		 if(!dict1.containsKey("Thursday"))
		 {
		  int valu1 =(dict1.get("Wednesday")+dict1.get("Friday"))/2;
		  dict1.putIfAbsent("Thursday", valu1);
		  
		 }
		  if(!dict1.containsKey("Wednesday"))
		  {
		  int valu2 =(dict1.get("Tuesday")+dict1.get("Thursday"))/2; 
		  dict1.putIfAbsent("Wednesday", valu2);
		  }
		  if(!dict.containsKey("Friday"))
		  {
			  int valu3 =(dict1.get("Thursday")+dict1.get("Saturday"))/2; 
			  dict1.putIfAbsent("Friday", valu3);
		  }
		  if(!dict1.containsKey("Saturday"))
		  {
			  int valu4 =(dict1.get("Friday")+dict1.get("Sunday"))/2; 
			  dict1.putIfAbsent("Saturday", valu4);
		  }
         Map<String,Integer> dict2 = new HashMap<String,Integer>();
		ArrayList<String> ar =new ArrayList<String>(
				Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
		Iterator<String> itr1 = ar.iterator();
		while(itr1.hasNext())
			
		{
			String key = itr1.next();
			Integer val11 =dict1.get(key);
			dict2.put(key,val11);
		}
		  
		  
		  
		  
		  
		
	
   
     
	return dict2;
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
