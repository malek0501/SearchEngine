package searchengine;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Index1 implements Index {
	private Map<String,Map <String,Double>> listIndex;
	public Index1 () { 
		this.listIndex= new HashMap<>();
	}
	public void addFilePath (Map<String,Double> listdestatistiquesdumots, String filePath) {
		for (String  element : listdestatistiquesdumots.keySet()) {
			if (listIndex.keySet().contains(element)){
				listIndex.get(element).put(filePath, listdestatistiquesdumots.get(element));
			}
			else {
				Map <String,Double> s =new HashMap<>();
				s.put(filePath, listdestatistiquesdumots.get(element));
				listIndex.put(element, s );
			}
		}
	}
	public Map<String,Map <String,Double>> getListIndex() {
		return listIndex;
	}
	
	public Map<String,Map<String,Double>> getStatWords(List<String>requet){
		 Map<String,Map <String,Double>> StatWords = new HashMap<>();
		 for(String word : requet) {
			 if (listIndex.keySet().contains(word)) {
				 StatWords.put(word, listIndex.get(word));
			 }
		 }
		 return StatWords;
	}
}
 