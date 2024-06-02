package searchengine;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class OnlyContentWordsFr implements Traiteur {

	@Override
	public List <String> traiter(List<String> fileToString) {
		Set<String> motsSansSens = new HashSet<>();
		motsSansSens.add("quand");
		motsSansSens.add("comment");
		motsSansSens.add("pourquoi");
		motsSansSens.add("quelle");
		motsSansSens.add("quels");
		motsSansSens.add("quelles");
		motsSansSens.add("cette");
		motsSansSens.add("notre");
		motsSansSens.add("votre");
		motsSansSens.add("leurs");
		motsSansSens.add("celui");
		motsSansSens.add("celle");
		motsSansSens.add("celles");
		motsSansSens.add("là-bas");
		motsSansSens.add("aujourd'hui");
		motsSansSens.add("demain");
		motsSansSens.add("après");
		motsSansSens.add("avant");
		motsSansSens.add("maintenant");
		motsSansSens.add("alors");
		motsSansSens.add("aussi");
		motsSansSens.add("ensuite");
		motsSansSens.add("encore");
		motsSansSens.add("toute");
		motsSansSens.add("toutes");
		motsSansSens.add("jamais");
		motsSansSens.add("toujours");
		motsSansSens.add("beaucoup");
		motsSansSens.add("quelque");
		motsSansSens.add("quelques");
		motsSansSens.add("personne");
		motsSansSens.add("chacun");
		motsSansSens.add("chaque");
		motsSansSens.add("aucun");
		motsSansSens.add("toute");
		motsSansSens.add("toutes");
		motsSansSens.add("n'importe");
		motsSansSens.add("quelle");
		motsSansSens.add("quelque");
		motsSansSens.add("quels");
		motsSansSens.add("quelles");
        for (String word : fileToString) {{
                if (motsSansSens.contains(word)) {
                	fileToString.remove(word);
                    break; 
                }
            }
        }
		        return fileToString;
	}
}