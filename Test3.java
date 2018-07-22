package Methods3;


import java.awt.Component;
import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.sound.sampled.Line;
	 
	public class Test3<YamlConfiguration> {
	  
	    public static void main(String[] args) {
	 
	    	try {
	    	BufferedReader reader = new BufferedReader(new FileReader("C://Users/NT/Descktop/Homework4.txt"));
	    	}
	    	catch (Exception e);
	    	
	        String line;
	        List<String> lines = new ArrayList<String>();
	        while ((line = reader.readLine()) != null) {
	            lines.add(line);
	        }
	       
	        
	        
	      
	        Map< Integer, String> hashMap = new HashMap<Integer, String>();  
	        Map<Integer, String> map;
			for (Line i : lines) map.put(((Object) i).getKey(),i);
	        }
	
	   
	    public  void loadHashMap(){
	        try {
	            
	            File f = new File ("C://Users/NT/Descktop/Homework41.txt");
	            List hashmap;
				hashmap.clear();
	            if (f.exists()) {
	                Object cfg;
					cfg.load(f);
	                Set<String> keys = cfg.getKeys(false);
	                if (keys.size()>0)
	                    for (String key : keys)
	                            hashmap.put(key, cfg.getString(key);
	            }
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	    }
	    
	    
	}


