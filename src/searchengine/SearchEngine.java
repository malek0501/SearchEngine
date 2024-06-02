package searchengine;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;


public class SearchEngine {
	
    Index index ;
	List<Traiteur> listTraiteur;
	DocLecteur lecteur;
    Ordonnanceur ordonnanceur;
    Analyseur analyseur;
    public SearchEngine(Index index ,List<Traiteur> listTraiteur ,Ordonnanceur ordonnanceur ,Analyseur analyseur,DocLecteur lecteur) {
    	this.index=index;
    	this.analyseur=analyseur;
    	this.listTraiteur=listTraiteur;
    	this.ordonnanceur=ordonnanceur;
    	this.lecteur=lecteur;
    }
    public void index(String path){
        File filePath = Paths.get(path).toFile();
        if(filePath.exists()){
            if(filePath.isDirectory()){
                System.out.println(path+" is a directory");
                indexDirectory(path);
            }else{
                System.out.println(path+" is a file");
                indexSingleDocument(path);
            }
        }else{
            System.out.println(path+" does not exist");
        }
    }



    private void indexSingleDocument(String path){
    	List<String> words =lecteur.lire(path);
    	for (Traiteur traiteur:listTraiteur) {
    		words=traiteur.traiter(words);
    		
    	}
    		index.addFilePath(analyseur.analyser(words),path);
    }
    
    
    
    private void indexDirectory(String path){
        File pathFile = Paths.get(path).toFile();
        File[] files = pathFile.listFiles();
        for(File f: files ){
            if(f.isDirectory()){
                indexDirectory(f.getAbsolutePath());      
            }else{
                indexSingleDocument(f.getAbsolutePath());
            }
        }
    }
   public void resultSearch(List<String>requet, int n) {
    	List<ElementStat<String, Double>> listScore=ordonnanceur.calculeScore(index.getStatWords(requet));
    	System.out.println("------------------------------------");
    	System.out.println(".....Resultats de la recherche......");
    	System.out.println("");  
    	System.out.println("");
    	System.out.println("");
    	for(int i=0;i<n;i++) {
    		if (i == listScore.size())
    			break;
	    		System.out.println(i+1 + " /"+" File: " + listScore.get(i).getKey());
	        	System.out.println("Score: " + listScore.get(i).getValue());
	        	System.out.println("");
	        	System.out.println("------------------------------------");
	        	
    	}
    	System.out.println("------l'affichage est termine-------");
    }
}











