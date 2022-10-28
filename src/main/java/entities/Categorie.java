package entities;

/**
 * The type Categorie.
 */
public class Categorie {

    private String libelle;

    
    
    
    

    public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Gets libelle.
     *
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Sets libelle.
     *
     * @param libelle the libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
