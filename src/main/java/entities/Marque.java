package entities;

public class Marque {
	private String nom;

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marque(String nom) {
		super();
		this.nom = nom;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Marque [nom=" + nom + "]";
	}
	
	
}
