import java.util.ArrayList;

public class Etudiant extends Personne{

	private Integer numeroEtudiant;
	private ArrayList<UniteEnseignement> uniteEnseignements;

	public Etudiant() {
		super("","");
		this.numeroEtudiant=0;
	}
	public Etudiant(String nom,Integer numeroEtudiant,String email) {
		super(nom,email);
		this.numeroEtudiant = numeroEtudiant;
	}

	public Integer getNumeroEtudiant() {
		return numeroEtudiant;
	}
	public void setNumeroEtudiant(Integer numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}
	@Override
	public String toString() {
		return "Etudiant [ nom = "+super.getNom()+", numero etudiant = "+numeroEtudiant+", email = "+super.getEmail()+" ]";
	}
	@Override
	public void afficher() {
		System.out.println(this.toString());
	}
	public boolean addModule(UniteEnseignement uniteEnseignement) {
		return uniteEnseignements.add(uniteEnseignement);
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Etudiant etudiant = (Etudiant) o;
		return numeroEtudiant.equals(etudiant.getNumeroEtudiant());
	}
}
