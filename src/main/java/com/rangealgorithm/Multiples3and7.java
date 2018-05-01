package com.rangealgorithm;

import java.util.LinkedHashMap;
import java.util.Map;

public class Multiples3and7 {
	
	public static Map<String,String> countMultiples(int min,int max)
	{
		Map<String,String> multiples = new LinkedHashMap<String,String>();
		
		if (min>=1 && max<= 200)
		{
		for (int i=min; i<=max; i++){

	       if (i%3==0 && i%7 == 0) {
	           multiples.put(String.valueOf(i),"MS3 and ME");
    	   }else if (i%7 == 0){
    		   multiples.put(String.valueOf(i), "MS3");
    	   } else if (i%3==0 ){
    		   multiples.put(String.valueOf(i),"ME");
    	   } else{
    		   multiples.put(String.valueOf(i),String.valueOf(i));
    	   }
	    }
		
	    return multiples;
		}
		
		return null;
		
		
		
	}
}
