package searchengine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Index2 implements Index {
	public List<MotScoreFile<String,String,Double>> listIndex;
	public Index2 () { 
		this.listIndex= new ArrayList<>();
	}
	public void addFilePath (Map<String,Double> listdestatistiquesdumots, String filePath) {
		for (String element : listdestatistiquesdumots.keySet()) {
			listIndex.add(new MotScoreFile<>(element,filePath,listdestatistiquesdumots.get(element)));
		}
	}
 private Map<String,Double> getMapFiles(String word){
	 Map <String,Double> MapFiles = new HashMap<>();
	 for (MotScoreFile<String,String,Double> triple :listIndex) {
		 if (triple.getKey().equals(word)){
			 MapFiles.put(triple.getValue1(), triple.getValue2());
			 //System.out.println("("+triple.getKey()+","+ triple.getValue1()+","+triple.getValue2()+")");
			 
		 }
	 }
	 return MapFiles;
 }
	public Map<String,Map<String,Double>> getStatWords(List<String>requet){
		 Map<String,Map <String,Double>> StatWords = new HashMap<>();
		 for(String word : requet) {
			 Map <String,Double> MapFiles = new HashMap<>();
			 MapFiles = getMapFiles(word);
			 StatWords.put(word, MapFiles);
	 
		 }
		 return StatWords;
	}

}
