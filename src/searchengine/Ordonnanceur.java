package searchengine;

import java.util.List;
import java.util.Map;

public interface Ordonnanceur {
	public List<ElementStat<String, Double>> calculeScore(Map <String, Map <String, Double>> listIndex);
}
