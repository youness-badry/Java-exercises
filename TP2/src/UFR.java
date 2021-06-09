import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UFR {
	private ArrayList<Enseignent> enseignents;
	private ArrayList<Module> modules;
	public UFR() {
		super();
		enseignents = new ArrayList<Enseignent>();
		modules = new ArrayList<Module>();
	}
	
	public void afficher() {
		for( Enseignent val : enseignents ) {
			if(val instanceof Professeur) {
				((Professeur) val).afficher();
			}
			if(val instanceof Doctorant) {
				((Doctorant) val).afficher();
			}
			System.out.println("La charge horaire de l'enseignant = "+val.getChargeHoraire()+System.lineSeparator());
		}
	}
	
	public Double getVacations() {
		double sommeVac=0;
		for(Enseignent val : enseignents) {
			sommeVac += val.getVacations();
		}
		return sommeVac;
	}

	public static void main(String[] args) {
//		Etudiant(String nom,Integer numeroEtudiant,String email)

		Etudiant e1 = new Etudiant("adil",120,"adil@gmail.com");
		Etudiant e2 = new Etudiant("salim",140,"salim@gmail.com");
		Etudiant e3 = new Etudiant("mohamed",96,"mohamed@gmail.com");
		HashMap<Integer,Etudiant> mapEtudiants = new HashMap<>();
		mapEtudiants.put(1,e1);
		mapEtudiants.put(2,e2);
		mapEtudiants.put(3,e3);
		for(Map.Entry<Integer,Etudiant> paire : mapEtudiants.entrySet()) {
			System.out.println("etudiant "+paire.getKey()+", son nom : "+paire.getValue().getNom());
		}
	}

}
