package searchengine;

import java.util.List;
import java.util.Map;

public interface Index {
	public void addFilePath (Map<String,Double> listdestatistiquesdumots, String filePath);
	public Map<String,Map<String,Double>> getStatWords(List<String>requet);
}
