package searchengine;

import java.util.List;

public class TokenizerEng implements Traiteur {
	@Override
	public List <String> traiter(List<String> fileToString) {
		        for (int i=0;i<fileToString.size();i++) {
		            if (fileToString.get(i).endsWith("ing")) {
		            	fileToString.set (i, fileToString.get(i).substring(0, fileToString.get(i).length() - 3)); 
		            }
		            else if (fileToString.get(i).endsWith("ed")) {
		            	fileToString.set (i, fileToString.get(i).substring(0, fileToString.get(i).length() - 2));
		            }
		            else if (fileToString.get(i).length()> 5 ) {
		            	fileToString.set (i, fileToString.get(i).substring(0,5));

		            }
		        }
		        return fileToString;
			}
}