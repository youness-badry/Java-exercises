import java.util.ArrayList;

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

}
