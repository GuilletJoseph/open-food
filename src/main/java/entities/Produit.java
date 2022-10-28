package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The type Produit.
 */
public class Produit {
	 private String nom;
	    private Categorie categorie;
	    private Marque marque;
	    private String scoreNutritionnel;
	    private Map<String, String> lstAttributs;
	    private List<Ingredient> lstIngredient;
	    private List<Additif> lstAdditif;
	    private List<Allergene> lstAllergene;

	    
	    
	    
	    
	    
	    public Produit(String nom,Categorie categorie, Marque marque, String scoreNutritionnel, Map<String, String> lstAttributs, List<Ingredient> lstIngredient, List<Additif> lstAdditif, List<Allergene> lstAllergene) {
	        this.nom = nom;
	        this.categorie = categorie;
	        this.marque = marque;
	        this.scoreNutritionnel = scoreNutritionnel;
	        this.lstAttributs = lstAttributs;
	        this.lstIngredient = lstIngredient;
	        this.lstAdditif = lstAdditif;
	        this.lstAllergene = lstAllergene;
	    }

 
    public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Categorie getCategorie() {
        return categorie;
    }


    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

  
    public void setMarque(Marque marque) {
        this.marque = marque;
    }


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getScoreNutritionnel() {
		return scoreNutritionnel;
	}


	public void setScoreNutritionnel(String scoreNutritionnel) {
		this.scoreNutritionnel = scoreNutritionnel;
	}


	public Map<String, String> getLstAttributs() {
		return lstAttributs;
	}


	public void setLstAttributs(Map<String, String> lstAttributs) {
		this.lstAttributs = lstAttributs;
	}


	public List<Ingredient> getLstIngredient() {
		return lstIngredient;
	}


	public void setLstIngredient(List<Ingredient> lstIngredient) {
		this.lstIngredient = lstIngredient;
	}


	public List<Additif> getLstAdditif() {
		return lstAdditif;
	}


	public void setLstAdditif(List<Additif> lstAdditif) {
		this.lstAdditif = lstAdditif;
	}


	public List<Allergene> getLstAllergene() {
		return lstAllergene;
	}


	public void setLstAllergene(List<Allergene> lstAllergene) {
		this.lstAllergene = lstAllergene;
	}

	public List<String>  addittoString() {
		
		List<String> st = new ArrayList<>();
		for (int i=0; i<lstAdditif.size(); i++) {
			
			st.add(lstAdditif.get(i).getLibelle()) ;
			
		}	
		
		return st;
	}

  
    
}
