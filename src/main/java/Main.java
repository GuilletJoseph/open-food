import java.io.IOException;
import java.util.Scanner;

import components.RecupFichier;
import services.MenuService;



public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******** MENU RECENSEMENT ********");
		
		boolean running = true;
		RecupFichier recupFichier = new RecupFichier();
		recupFichier.getInstance();
		MenuService menuser=new MenuService();
		
		while (running) {
			System.out.println("	-----------------	");
			System.out.println("Choisissez une option :");
			System.out.println("1 - Rechercher les meilleurs produits pour une Marque donnée");
			System.out.println("2 - Rechercher les meilleurs produits pour une Catégorie donnée");
			System.out.println("3 - Rechercher les meilleurs produits par Marque et par Catégorie");
			System.out.println("4 - Afficher les allergènes les plus courants");
			System.out.println("5 - Afficher les additifs les plus courants");
			System.out.println("6 - Sortir");
			String userChoice = scanner.nextLine();

			switch (userChoice) {
			case "1":
				System.out.println("Ajouter un marque de produit");
				String st1=scanner.nextLine();
				menuser.afficherProduitParMarque(st1);
				break;

			case "2":
				System.out.println("Ajouter un categorie de produit");
				String st2=scanner.nextLine();
				menuser.afficherProduitParCategorie(st2);
				break;
			case "3":
				System.out.println("Ajouter un marque de produit");
				String st3=scanner.nextLine();
				System.out.println("Ajouter un categorie de produit");
				String st4=scanner.nextLine();
				menuser.afficherProduitParMarCat(st3,st4);		
				break;
			case "4":
				menuser.afficherAllergen();		
				break;
			case "5":
				
				break;
			case "6":
				running = false;
				break;
			}
		}
		
		scanner.close();
	}
}
