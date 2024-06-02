package searchengine;

import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class AnalyseurOcc implements Analyseur{

    public Map<String, Double> analyser(List<String> contenudufichiertraité) {
    	Map<String,Double> listdestatistiquesdumots= new HashMap<>();
    	if (!contenudufichiertraité.isEmpty()) {
	    	for (String element : contenudufichiertraité) {
	    	   if(listdestatistiquesdumots.containsKey(element)) {
	    		   listdestatistiquesdumots.put(element, listdestatistiquesdumots.get(element)+1);
	    	   }
	    	   else {
	    		   listdestatistiquesdumots.put(element, 1.0);
	    	   }
	    	}
    	}
    	return listdestatistiquesdumots;
    }
}

    	    
    	

    
