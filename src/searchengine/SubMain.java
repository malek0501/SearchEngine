package searchengine;


import java.util.List;

public class SubMain {
	
	public void processFr( List<Traiteur> listTraiteur) {
		TokenizerFr tokenizer = new TokenizerFr ();
        OnlyContentWordsFr onlyContentWordsFr = new OnlyContentWordsFr();
        listTraiteur.add(onlyContentWordsFr);
        listTraiteur.add(tokenizer);	
	}
	
	public void processEng( List<Traiteur> listTraiteur){
		TokenizerEng tokenizerEng = new TokenizerEng ();
        OnlyContentWordsEng onlyContentWordsEng = new OnlyContentWordsEng();
        listTraiteur.add(onlyContentWordsEng);
        listTraiteur.add(tokenizerEng);	
	}
	
	public void simpleSearchMain (List<String> queryTerms, String path, List<Traiteur> listTraiteur, int n, int p) {
		SearchEngine searchEngine ;
		AllToWords allToWords= new AllToWords();
		AnalyseurSimple analyseurSimple=new AnalyseurSimple();
    	Ordonnanceur1 ordonnanceur1 = new Ordonnanceur1();
    	if (n == 1) {
    		Index1 index1 =new Index1();
    		searchEngine = new SearchEngine(index1,listTraiteur,ordonnanceur1,analyseurSimple,allToWords);
        	searchEngine.index(path);
        	searchEngine.resultSearch(queryTerms, p);
    	}else {
    		Index2 index2 =new Index2();
    		searchEngine = new SearchEngine(index2,listTraiteur,ordonnanceur1,analyseurSimple,allToWords);
        	searchEngine.index(path);
        	searchEngine.resultSearch(queryTerms,p);
    	}	
	}
	
	
	
	public void advancedSearchMain (List<String> queryTerms, String path, List<Traiteur> listTraiteur, int ana, int ind, int p) {
		SearchEngine searchEngine ;
		AllToWords allToWords= new AllToWords();
		if (ana == 1) {
		AnalyseurOcc analyseurOcc=new AnalyseurOcc(); 
		if (ind == 1) {
	    	Index1 index11 =new Index1();
	    	Ordonnanceur1 ordonnanceur22=new Ordonnanceur1();
	    	searchEngine = new SearchEngine(index11,listTraiteur,ordonnanceur22,analyseurOcc,allToWords);
	    	searchEngine.index(path);
	    	searchEngine.resultSearch(queryTerms, p);
		}else {
			Index2 index22 =new Index2();
	    	Ordonnanceur1 ordonnanceur22=new Ordonnanceur1();
	    	searchEngine = new SearchEngine(index22,listTraiteur,ordonnanceur22,analyseurOcc,allToWords);
	    	searchEngine.index(path);
	    	searchEngine.resultSearch(queryTerms,p);
			}
		
		}else {
		AnalyseurPourcentage analyseurPourcentage = new AnalyseurPourcentage();
		if (ind == 1) {
	    	Index1 index11 =new Index1();
	    	Ordonnanceur1 ordonnanceur11=new Ordonnanceur1();
	    	searchEngine = new SearchEngine(index11,listTraiteur,ordonnanceur11,analyseurPourcentage,allToWords);
	    	searchEngine.index(path);
	    	searchEngine.resultSearch(queryTerms, p);
		}else {
			Index2 index22 =new Index2();
	    	Ordonnanceur1 ordonnanceur11=new Ordonnanceur1();
	    	searchEngine = new SearchEngine(index22,listTraiteur,ordonnanceur11,analyseurPourcentage,allToWords);
	    	searchEngine.index(path);
	    	searchEngine.resultSearch(queryTerms, p);
			}
		}
	}
	
	public void veryAdvancedSearchMain(List<String> queryTerms, String path, List<Traiteur> listTraiteur, int ana, int ind, int p) {
		SearchEngine searchEngine ;
		AllToWords allToWords= new AllToWords();
		if (ana == 1) {
		AnalyseurOcc analyseurOcc=new AnalyseurOcc(); 
		if (ind == 1) {
	    	Index1 index11 =new Index1();
	    	Ordonnanceur2 ordonnanceur22=new Ordonnanceur2();
	    	searchEngine = new SearchEngine(index11,listTraiteur,ordonnanceur22,analyseurOcc,allToWords);
	    	searchEngine.index(path);
	    	searchEngine.resultSearch(queryTerms, p);
		}else {
			Index2 index22 =new Index2();
	    	Ordonnanceur2 ordonnanceur22=new Ordonnanceur2();
	    	searchEngine = new SearchEngine(index22,listTraiteur,ordonnanceur22,analyseurOcc,allToWords);
	    	searchEngine.index(path);
	    	searchEngine.resultSearch(queryTerms, p);
			}
		
		}else {
		AnalyseurPourcentage analyseurPourcentage = new AnalyseurPourcentage();
		if (ind == 1) {
	    	Index1 index11 =new Index1();
	    	Ordonnanceur2 ordonnanceur11=new Ordonnanceur2();
	    	searchEngine = new SearchEngine(index11,listTraiteur,ordonnanceur11,analyseurPourcentage,allToWords);
	    	searchEngine.index(path);
	    	searchEngine.resultSearch(queryTerms, p);
		}else {
			Index2 index22 =new Index2();
	    	Ordonnanceur2 ordonnanceur11=new Ordonnanceur2();
	    	searchEngine = new SearchEngine(index22,listTraiteur,ordonnanceur11,analyseurPourcentage,allToWords);
	    	searchEngine.index(path);
	    	searchEngine.resultSearch(queryTerms, p);
			}
		}
	}
}
