package searchengine;

import java.util.List;

public class OnlyMiusNum implements Traiteur {
	@Override
	public List<String> traiter(List<String> fileToString) {
		
		for(int i=0 ;i<fileToString.size();i++) {
			fileToString.set(i,fileToString.get(i).toLowerCase().replace("[^a-zA-Z0-9]", ""));
		}
		return fileToString;
	}
}
