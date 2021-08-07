package project1;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class myclass1 {
     @Test
	public void function()
	{
		Map<String,Integer> dict = new HashMap<String,Integer>(){{
			put("30-12-2019",1);
			//put("31-12-2019",2);
			put("01-01-2020",4);
			put("02-01-2020",2);
			put("03-01-2020",3);
			put("04-01-2020",1);
			put("05-01-2020",3);
			put("06-01-2020",2);
			put("07-01-2020",2);
			put("08-01-2020",3);
		}};
		Map<String,Integer> dict1 = new HashMap<String,Integer>(){{
			put("Monday",3);
			put("Tuesday",2);
			put("Wednesday",7);
			put("Thursday",2);
			put("Friday",3);
			put("Saturday",1);
			put("Sunday",3);
			
			
			
		}};
		assertEquals(dict1,myclass.function(dict));

		
		
	}
}
