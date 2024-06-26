package searchengine;

import java.util.ArrayList;
import java.util.List;

public class TokenizerFr implements Traiteur {
	@Override
	public List <String> traiter(List<String> fileToString) {
        List<String> terminaisons = new ArrayList<>();
        terminaisons.add("ent");
        terminaisons.add("ez");
        terminaisons.add("ons");
        terminaisons.add("e");
        terminaisons.add("es");
        terminaisons.add("ions");
        terminaisons.add("iez");
        terminaisons.add("ient");
        terminaisons.add("ais");
        terminaisons.add("ait");
        terminaisons.add("er");
        terminaisons.add("ir");
        terminaisons.add("re");
        terminaisons.add("ais");
        terminaisons.add("ait");
        terminaisons.add("ions");
        terminaisons.add("iez");
        terminaisons.add("aient");
        terminaisons.add("is");
        terminaisons.add("issais");
        terminaisons.add("issait");
        terminaisons.add("issions");
        terminaisons.add("issiez");
        terminaisons.add("issent");
        terminaisons.add("îmes");
        terminaisons.add("îtes");
        terminaisons.add("ître");
        terminaisons.add("îtent");
        terminaisons.add("îtrai");
        terminaisons.add("îtras");
        terminaisons.add("îtra");
        terminaisons.add("îtrons");
        terminaisons.add("îtrez");
        terminaisons.add("îtront");
        terminaisons.add("îtriez");
        terminaisons.add("îtrais");
        terminaisons.add("îtrait");
        terminaisons.add("îtriions");
        terminaisons.add("îtriiez");
        terminaisons.add("îtraient");
        terminaisons.add("isse");
        terminaisons.add("isses");
        terminaisons.add("issiez");
        terminaisons.add("issons");
        terminaisons.add("issez");
        terminaisons.add("issant");
        terminaisons.add("issante");
        terminaisons.add("issantes");
        terminaisons.add("issants");
        terminaisons.add("ai");
        terminaisons.add("as");
        terminaisons.add("a");
        terminaisons.add("ons");
        terminaisons.add("ez");
        terminaisons.add("ont");
        terminaisons.add("erai");
        terminaisons.add("eras");
        terminaisons.add("era");
        terminaisons.add("erons");
        terminaisons.add("erez");
        terminaisons.add("eront");
        terminaisons.add("erais");
        terminaisons.add("erais");
        terminaisons.add("erait");
        terminaisons.add("erions");
        terminaisons.add("eriez");
        terminaisons.add("eraient");
        terminaisons.add("é");
        terminaisons.add("ée");
        terminaisons.add("ées");
        terminaisons.add("és");
        terminaisons.add("éz");
        terminaisons.add("ies");
        terminaisons.add("ient");
        terminaisons.add("iant");
        terminaisons.add("îtes");
        terminaisons.add("ît");
        terminaisons.add("ît");
        terminaisons.add("îmes");
        terminaisons.add("irai");
        terminaisons.add("irons");
        terminaisons.add("iront");
        terminaisons.add("irez");
        terminaisons.add("irai");
        terminaisons.add("irait");
        terminaisons.add("irais");
        terminaisons.add("iraient");
        terminaisons.add("iras");
        terminaisons.add("iriez");
        terminaisons.add("irions");
        terminaisons.add("isse");
        terminaisons.add("isses");
        terminaisons.add("issent");
        terminaisons.add("issiez");
        terminaisons.add("issions");
        terminaisons.add("issent");
        terminaisons.add("issiez");
        terminaisons.add("irais");
        terminaisons.add("irait");
        terminaisons.add("iras");
        terminaisons.add("irait");
        terminaisons.add("irait");
        terminaisons.add("îtes");
        terminaisons.add("iront");
        terminaisons.add("issent");
        terminaisons.add("iront");
        terminaisons.add("iront");
        terminaisons.add("iront");
        terminaisons.add("issant");
        terminaisons.add("issez");
        terminaisons.add("isses");
        terminaisons.add("issons");
        terminaisons.add("irais");
        terminaisons.add("irions");
        terminaisons.add("irons");
        terminaisons.add("îtes");
        terminaisons.add("îtes");
        terminaisons.add("it");
        terminaisons.add("ît");
        terminaisons.add("îmes");
        terminaisons.add("isse");
        terminaisons.add("isses");
        terminaisons.add("issent");
        terminaisons.add("it");
        terminaisons.add("ît");
        terminaisons.add("îtes");
        terminaisons.add("it");
        terminaisons.add("îmes");
        terminaisons.add("îtes");
        terminaisons.add("ir");
        terminaisons.add("irai");
        terminaisons.add("irais");
        terminaisons.add("irait");
        terminaisons.add("iras");
        terminaisons.add("irent");
        terminaisons.add("irons");
        terminaisons.add("iront");
        terminaisons.add("is");
        terminaisons.add("isse");
        terminaisons.add("isses");
        terminaisons.add("issez");
        terminaisons.add("issions");
        terminaisons.add("issiez");
        terminaisons.add("issons");
        terminaisons.add("issait");
        terminaisons.add("issais");
        terminaisons.add("issions");
        terminaisons.add("issiez");
        terminaisons.add("issait");
        terminaisons.add("issions");
        terminaisons.add("issiez");
        terminaisons.add("îtes");
        terminaisons.add("it");
        terminaisons.add("ît");
        terminaisons.add("isses");
        terminaisons.add("isses");
        terminaisons.add("issent");
        terminaisons.add("isses");
        terminaisons.add("ît");
        terminaisons.add("issent");
        terminaisons.add("ît");
        for (int i=0;i<fileToString.size();i++) {
        	if(fileToString.get(i).length()>3) {
        		for (String terminaison : terminaisons) {
        			if (fileToString.get(i).endsWith(terminaison)) {
        				fileToString.set(i,fileToString.get(i).substring(0, fileToString.get(i).length() - terminaison.length()));
	                    break;
        			}
        		}
        	}
        } return fileToString;
	}
}

	