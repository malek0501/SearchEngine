package searchengine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyseurSimple implements Analyseur {

	@Override
	public Map<String, Double> analyser(List<String> contenudufichiertraité) {
		Map <String, Double> listdestatistiquesdumots = new HashMap<>();
		for(String element: contenudufichiertraité) {
			listdestatistiquesdumots.put(element, 1.0);
		}
		return listdestatistiquesdumots;
	}

}
