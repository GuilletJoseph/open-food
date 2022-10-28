
package components;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.*;



public class RecupFichier {

	private static Stock stock;
	
	
	public RecupFichier() {
		
		
		super();
		
		RecupFichier.stock=new Stock();
		
	}




	public void getInstance() throws IOException {
		List<Produit> lstStock = new ArrayList<>();
		
		
		Path path = Paths.get(".\\src\\main\\resources\\open-food-facts.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		lines.remove(0);

		for (String line : lines) {

			String[] tokens = new String[30];
			for (int i = 0; i < line.split("\\|").length; i++) {
				tokens[i] = line.split("\\|")[i];
			}	
			
			Categorie categories=new Categorie(tokens[0]);
			Marque marques=new Marque(tokens[1]);
			
			
			
			//creer additifs
			String addit=tokens[29]+",";		
			String[]	maddit = addit.split(",");
				List<Additif> lstAdit = new ArrayList<>();
				for (int i=0; i<maddit.length; i++) {
					Additif additif= new Additif(maddit[i]);
					lstAdit.add(additif);				
				}
						
				
			//creer ingredients
			String ingr=tokens[4]+",";
			String[] arrIngredient = ingr.replace("_", "").trim().split("[,\\-]");
			List<Ingredient> lstIngredients = new ArrayList<>();
			
			for (int i=0; i<arrIngredient.length; i++) {
				
				
				Ingredient ingredient=new Ingredient(arrIngredient[i]);
				lstIngredients.add(ingredient);
				
			}
			
			//creer allergene
			String allerg=tokens[28]+",";
			allerg = allerg.toLowerCase().replace("fr:", "").replace("en:", "").replace("*", "").trim();
			
			String[]	arrAllergen = allerg.split(",");
				List<Allergene> lstAllergen = new ArrayList<>();
				
				for (int i=0; i<arrAllergen.length; i++) {
					
					
					Allergene allergene=new Allergene(arrAllergen[i]);
					lstAllergen.add(allergene);
					
				}
							
				//creer atributs
				Map<String, String> hm = new HashMap<>();
				for (int i=5; i < 27; i++) {				
					
					hm.put(" ",  tokens[i]);	
				}		
				
			Produit produit = new Produit(tokens[2], categories, marques, tokens[3], hm, lstIngredients,lstAdit, lstAllergen);
			lstStock.add(produit);  //ajouter dans stock					
			}		
		
		
		stock.setLstProduit(lstStock);	
		
		
	}
	public static Stock getStock() {
		return stock;
	}

}
