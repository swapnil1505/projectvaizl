package project1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class myclass {

	public static void main(String[] args) {
	
      Map <String,Integer> dict= new HashMap<String,Integer>();
      Map <String,Integer> dict1 = new HashMap<String,Integer>();
      Scanner sc = new Scanner(System.in);
      System.out.println("How many entries");
      int m = sc.nextInt();
      int value =0;
      String v ="";
      for(int i=0; i<m; i++)
      {
    	  String key = sc.next();
    	  value = sc.nextInt();
    	  dict.put(key, value);
      }
     for( Entry<String,Integer> entry : dict.entrySet())
     {
    	   
           v = entry.getKey();
           int val = entry.getValue();
           try {
			String m1 =datetoday(v);
		       Iterator<Entry<String, Integer>>iterator = dict1.entrySet().iterator();
		       while (iterator.hasNext()) {
		    	   
	                // Get the entry at this iteration
	                Map.Entry<String,Integer> entry1 = iterator.next();
	  
	                // Check if this key is the required key
	                if (entry1.getKey() == m1) {
	                    val = val+entry.getValue();
	                    
	                }
	                
	               
	            }
		       dict1.put(m1,val);
			    
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     
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

}
