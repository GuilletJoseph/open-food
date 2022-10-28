package services;

import components.RecupFichier;
import entities.Produit;
import entities.Stock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuService {
	
	public void afficherProduitParMarque(String st){
		List<Produit> lstStock = RecupFichier.getStock().getLstProduit();
		
		st = st.toLowerCase();
		
		for(Produit produit : lstStock){
			String marque = produit.getMarque().getNom().toLowerCase();
	
			if(produit.getScoreNutritionnel().contains("a") && marque.equals(st)){
				System.out.println(marque+ " " + produit.getNom()+ "-nutrition Grade="+ produit.getScoreNutritionnel());
			}
		}
		
		
	}
	
	
	public void afficherProduitParCategorie(String st){
		List<Produit> lstStock = RecupFichier.getStock().getLstProduit();
		
		st = st.toLowerCase();
		
		for(Produit produit : lstStock){
			String categorie = produit.getCategorie().getLibelle().toLowerCase();
	
			if(produit.getScoreNutritionnel().contains("a") && categorie.equals(st)){
				System.out.println(categorie+ " " + produit.getNom()+ "-nutrition Grade="+ produit.getScoreNutritionnel());
			}
		}
		
		
	}
	
	
	
	public void afficherProduitParMarCat(String st1, String st2){
		List<Produit> lstStock = RecupFichier.getStock().getLstProduit();
		
		st1 = st1.toLowerCase();
		st2 = st2.toLowerCase();
		
		for(Produit produit : lstStock){
			
			String marque = produit.getMarque().getNom().toLowerCase();
			String categorie = produit.getCategorie().getLibelle().toLowerCase();
			
	
			if(produit.getScoreNutritionnel().contains("a") && marque.equals(st1) && categorie.equals(st1)){
				System.out.println(categorie+ " " + produit.getNom()+ "-nutrition Grade="+ produit.getScoreNutritionnel());
			}
		}	
	}
	
	
	
	public void afficherAllergen() {
		List<Produit> lstStock = RecupFichier.getStock().getLstProduit();
		System.out.println("Les allergènes les plus courants:");
		Map<String, Integer> al = new HashMap<>();
		for (Produit produit : lstStock) {	
			if ();
		
			
			
			
		}		
		
		
		
	}	
}
