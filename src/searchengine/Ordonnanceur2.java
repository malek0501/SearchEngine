package searchengine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ordonnanceur2 implements Ordonnanceur {
	
	
	@Override
	public List<ElementStat<String, Double>> calculeScore(Map<String, Map<String, Double>> listIndex) {
		  if (listIndex.isEmpty() ) {
		        return new ArrayList<>(); 
		    }
		  else {
			  Map <String, ElementStat<Double,Double>> fichierScoreOcc = new HashMap<>();
			  //Map<String,Double> fichierScore=new HashMap<>();
			  List<ElementStat<String, Double>> listScore= new ArrayList<>();
			  for (String word : listIndex.keySet()) { 
				  for (String elemnt :listIndex.get(word).keySet()) {
					  Double sumScore;
					  Double occurrenceCount;
				  	if (fichierScoreOcc.containsKey(elemnt)) {
				  		sumScore = fichierScoreOcc.get(elemnt).getKey() + listIndex.get(word).get(elemnt);
	                    occurrenceCount = fichierScoreOcc.get(elemnt).getValue() + 1.0;
				  		fichierScoreOcc.get(elemnt).setKey (sumScore);
				  		fichierScoreOcc.get(elemnt).setValue (occurrenceCount);
				  	}else {
				  		occurrenceCount=1.0;
				  		sumScore=listIndex.get(word).get(elemnt);
				  		fichierScoreOcc.put (elemnt, new ElementStat<>(sumScore,occurrenceCount));
				  		/*System.out.println(fichierScoreOcc.get(elemnt).key);
				  		System.out.println(fichierScoreOcc.get(elemnt).value);*/
				  	}
				  }
			  }
			  for(String element : fichierScoreOcc.keySet()) {
				
				  listScore.add(new ElementStat<>(element,fichierScoreOcc.get(element).getKey()*fichierScoreOcc.get(element).getValue()));
				  
			  }
			  /*for (Map.Entry<String, Double> entry : fichierScore.entrySet()) {
		            String element = entry.getKey();
		            Double stat = entry.getValue();
		            ElementStat<String, Double> motOccurrence = new ElementStat<>(element, stat);
		            listScore.add(motOccurrence);
		        }*/
		  Collections.sort(listScore, Comparator.comparing(ElementStat::getValue, Comparator.reverseOrder()));
		  return listScore;
		  }

	}
	
    
}


