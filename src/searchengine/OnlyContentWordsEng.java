package searchengine;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class OnlyContentWordsEng implements Traiteur {

	@Override
	public List <String> traiter(List<String> fileToString) {
		Set<String> meaninglessWords = new HashSet<>();
		meaninglessWords.add("the");
		meaninglessWords.add("a");
		meaninglessWords.add("an");
		meaninglessWords.add("this");
		meaninglessWords.add("that");
		meaninglessWords.add("these");
		meaninglessWords.add("those");
		meaninglessWords.add("such");
		meaninglessWords.add("some");
		meaninglessWords.add("any");
		meaninglessWords.add("one");
		meaninglessWords.add("two");
		meaninglessWords.add("three");
		meaninglessWords.add("four");
		meaninglessWords.add("five");
		meaninglessWords.add("six");
		meaninglessWords.add("seven");
		meaninglessWords.add("eight");
		meaninglessWords.add("nine");
		meaninglessWords.add("ten");
		meaninglessWords.add("first");
		meaninglessWords.add("second");
		meaninglessWords.add("third");
		meaninglessWords.add("last");
		meaninglessWords.add("next");
		meaninglessWords.add("other");
		meaninglessWords.add("another");
		meaninglessWords.add("more");
		meaninglessWords.add("less");
		meaninglessWords.add("most");
		meaninglessWords.add("least");
		meaninglessWords.add("many");
		meaninglessWords.add("few");
		meaninglessWords.add("much");
		meaninglessWords.add("little");
		meaninglessWords.add("several");
		meaninglessWords.add("all");
		meaninglessWords.add("both");
		meaninglessWords.add("either");
		meaninglessWords.add("neither");
		meaninglessWords.add("every");
		meaninglessWords.add("each");
		meaninglessWords.add("no");
		meaninglessWords.add("none");
		meaninglessWords.add("everybody");
		meaninglessWords.add("everyone");
		meaninglessWords.add("nobody");
		meaninglessWords.add("someone");
		meaninglessWords.add("anyone");
		meaninglessWords.add("something");
		meaninglessWords.add("anything");
		meaninglessWords.add("nothing");
		meaninglessWords.add("somewhere");
		meaninglessWords.add("anywhere");
		meaninglessWords.add("nowhere");
		meaninglessWords.add("there");
		meaninglessWords.add("here");
		meaninglessWords.add("where");
		meaninglessWords.add("when");
		meaninglessWords.add("why");
		meaninglessWords.add("how");
		meaninglessWords.add("which");
		meaninglessWords.add("what");
		meaninglessWords.add("who");
		meaninglessWords.add("whom");
		meaninglessWords.add("whose");
		meaninglessWords.add("whichever");
		meaninglessWords.add("whatever");
		meaninglessWords.add("whoever");
		meaninglessWords.add("whomever");
		meaninglessWords.add("whosever");
		meaninglessWords.add("until");
		meaninglessWords.add("unless");
		meaninglessWords.add("although");
		meaninglessWords.add("though");
		meaninglessWords.add("because");
		meaninglessWords.add("since");
		meaninglessWords.add("if");
		meaninglessWords.add("when");
		meaninglessWords.add("while");
		meaninglessWords.add("whereas");
		meaninglessWords.add("whether");
		meaninglessWords.add("wherever");
		meaninglessWords.add("whenever");
		meaninglessWords.add("however");
		meaninglessWords.add("so");
		meaninglessWords.add("then");
		meaninglessWords.add("thus");
		meaninglessWords.add("therefore");
		meaninglessWords.add("besides");
		meaninglessWords.add("however");
		meaninglessWords.add("nevertheless");
		meaninglessWords.add("meanwhile");
		meaninglessWords.add("furthermore");
		meaninglessWords.add("moreover");
		meaninglessWords.add("hence");
		meaninglessWords.add("consequently");
		meaninglessWords.add("accordingly");
		meaninglessWords.add("otherwise");
		meaninglessWords.add("instead");
		meaninglessWords.add("else");
		meaninglessWords.add("also");
		meaninglessWords.add("too");
		meaninglessWords.add("either");
		meaninglessWords.add("neither");
		meaninglessWords.add("indeed");
		meaninglessWords.add("possibly");
		meaninglessWords.add("probably");
		meaninglessWords.add("certainly");
		meaninglessWords.add("maybe");
		meaninglessWords.add("perhaps");
		meaninglessWords.add("just");
		meaninglessWords.add("only");
		meaninglessWords.add("almost");
		meaninglessWords.add("even");
		meaninglessWords.add("actually");
		meaninglessWords.add("finally");
		meaninglessWords.add("currently");
		meaninglessWords.add("previously");
		meaninglessWords.add("recently");
		meaninglessWords.add("early");
		meaninglessWords.add("now");
		meaninglessWords.add("later");
		meaninglessWords.add("soon");
		meaninglessWords.add("tomorrow");
		meaninglessWords.add("yesterday");
		meaninglessWords.add("last");
		meaninglessWords.add("next");
		meaninglessWords.add("every");
		meaninglessWords.add("all");
		meaninglessWords.add("each");
		meaninglessWords.add("both");
		meaninglessWords.add("either");
		meaninglessWords.add("neither");
		meaninglessWords.add("none");
		meaninglessWords.add("few");
		meaninglessWords.add("several");
		meaninglessWords.add("many");
		meaninglessWords.add("much");
		meaninglessWords.add("some");
		meaninglessWords.add("any");

        for (String word : fileToString) {
            if (meaninglessWords.contains(word)) {
            	fileToString.remove(word);
                break;
            }
        }
		        return fileToString;
	}
}