package searchengine;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Ordonnanceur1 implements Ordonnanceur {
	
	public List<ElementStat<String, Double>> calculeScore(Map <String, Map <String, Double>> listIndex) {
	    if (listIndex.isEmpty()) {
	        return new ArrayList<>(); 
	    }
	    Map <String, Double> fichierScore = new HashMap<>();
	    List<ElementStat<String, Double>> listScore= new ArrayList<>();
	    for (String word : listIndex.keySet()) { 
	    		for (String elemnt :listIndex.get(word).keySet()) {
	    		if (fichierScore.containsKey(elemnt)) {
    				fichierScore.put(elemnt, (fichierScore.get(elemnt) + listIndex.get(word).get(elemnt)));
	    		}else {
	    			fichierScore.put (elemnt, listIndex.get(word).get(elemnt));
	    			}
	    		}
	    	}
	    for (Map.Entry<String, Double> entry : fichierScore.entrySet()) {
            String element = entry.getKey();
            Double stat = entry.getValue();
            ElementStat<String, Double> motOccurrence = new ElementStat<>(element, stat);
            listScore.add(motOccurrence);
        }
	    Collections.sort(listScore, Comparator.comparing(ElementStat::getValue, Comparator.reverseOrder()));
		return listScore;
	}
	
}
