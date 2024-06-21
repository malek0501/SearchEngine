package searchengine;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
    	long startTime = System.currentTimeMillis();
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a query: ");
        String query = scanner.nextLine();
        System.out.print("Select language of search (1: English, 2: French): ");
        int languageChoice = scanner.nextInt();
         

        List<String> queryTerms = new ArrayList<>();
        for (String term : query.split(" ")) {
            queryTerms.add(term);
        }
        
        OnlyMiusNum onlyMinusNum = new OnlyMiusNum();
        List<Traiteur> listTraiteur = new ArrayList<>();
        listTraiteur.add(onlyMinusNum);
        String path = "C:\\Users\\malek\\Desktop\\malek\\ENIT\\Java\\MpJava\\corpus";
        
        SubMain sm = new SubMain();
        
        
        switch (languageChoice) {
        case 2:
        	sm.processFr(listTraiteur);
            break;
        case 1:
        	sm.processEng(listTraiteur);
            break;
        default :
        	System.out.println("Choix invalid !!! Veuillez choisir entre 1 et 2");
    }
        
        for (Traiteur traiteur:listTraiteur) {
        	queryTerms=traiteur.traiter(queryTerms);
    	}

    	System.out.print("Select the number of results you want to obtain ");
        int p = scanner.nextInt();

        
        System.out.print("Select search method  (1: Simple, 2: Advanced, 3:Very Advanced): ");
        int searchMethod = scanner.nextInt();
        scanner.nextLine();
        
        switch (searchMethod) {
        case 1:

        	System.out.print("Select the type of the Index (1: Index with map , 2: Index with list): ");
            int indexChoice = scanner.nextInt();
            long startTime1 = System.currentTimeMillis();
        	sm.simpleSearchMain(queryTerms, path, listTraiteur, indexChoice, p);
        	
        	
        	long endTime1 = System.currentTimeMillis();
            long executionTime1 = endTime1 - startTime1;
            System.out.println("Temps d'exécution : " + executionTime1 + " millisecondes");
        	break;
	    case 2:
        	System.out.print("Select the type of the Analyzer (1: Occurrences  Analyzeur , 2: Pourcentages Analyzer): ");
            int analyseurChoice = scanner.nextInt();

        	System.out.print("Select the type of the Index (1: Index with map , 2: Index with list): ");
            int indexChoice2 = scanner.nextInt();
            long startTime2 = System.currentTimeMillis();
	    	sm.advancedSearchMain(queryTerms, path, listTraiteur,analyseurChoice, indexChoice2, p);
	    	
	    	
	    	long endTime2 = System.currentTimeMillis();
            long executionTime2 = endTime2 - startTime2;
            System.out.println("Temps d'exécution : " + executionTime2 + " millisecondes");
	    	
	    	break;
	    case 3:

        	System.out.print("Select the type of the Analyzer (1: Occurrences  Analyzeur , 2: Pourcentages Analyzer): ");
            int analyseurChoice3 = scanner.nextInt();
        	System.out.print("Select the type of the Index (1: Index with map , 2: Index with list): ");
        	long startTime3 = System.currentTimeMillis();
            int indexChoice3 = scanner.nextInt();
	    	sm.veryAdvancedSearchMain(queryTerms, path, listTraiteur, analyseurChoice3, indexChoice3, p);
	    	
	    	long endTime3 = System.currentTimeMillis();
            long executionTime3 = endTime3 - startTime3;
            System.out.println("Temps réel d'exécution : " + executionTime3 + " millisecondes");
	    	
	    	break;
	    default :
        	System.out.println("Choix invalid !!! Veuillez choisir entre 1 ,2 et 3");
        }
        
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Temps total d'execution : " + executionTime + " millisecondes");
        scanner.close();
    }
}