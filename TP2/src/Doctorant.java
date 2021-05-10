import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Doctorant extends Etudiant implements Enseignent{

	private String sujetThese;
	private Professeur[] encadrant = new Professeur[2];
	private HashMap<String, ArrayList<Module>> chargeHoraire = new HashMap<>();
	private String dateInscription;

	public Doctorant(String nom,Integer numeroEtudiant,String email,String sujetThese,Professeur[] encadrant,Module[] cours,String dateInscription) {
		super(nom,numeroEtudiant,email);
		this.sujetThese =sujetThese;
		this.encadrant = encadrant;
		this.dateInscription = dateInscription;
	}


	public Doctorant() {
		super();
		this.sujetThese = "";
		this.dateInscription = "";
	}
	public String getSujetThese() {
		return sujetThese;
	}
	public Professeur[] getEncadrant() {
		return encadrant;
	}

	public ArrayList<ArrayList<Module>> getModules() { // retourne la liste des modules de l'annee en cours
		ArrayList<ArrayList<Module>> modules = new ArrayList<ArrayList<Module>>(chargeHoraire.values());
		return modules;
	}
	public ArrayList<Module>  getModules(String date) { // retourne les modules d'une annee quelconque
		return chargeHoraire.get(date);
	}
	public String getDateInscription() {
		return dateInscription;
	}
	public void setSujetThese(String sujetThese) {
		this.sujetThese = sujetThese;
	}
	public void setEncadrant(Professeur[] encadrant) {
		this.encadrant = encadrant;
	}
	public void setDateInscription(String dateInscription) {
		this.dateInscription = dateInscription;
	}
	@Override
	public String toString() {
		return "Docorant [ nom = "+super.getNom()+", numero etudiant = "+super.getNumeroEtudiant()+", email = "+super.getEmail()+
				", sujet these = "+sujetThese+", date inscription = "+dateInscription+" ]";
	}
	@Override
	public void afficher() {
		System.out.println(this.toString());
	}
	public Double getChargeHoraire() {
		ArrayList<ArrayList<Module>> modules = new ArrayList<ArrayList<Module>>(chargeHoraire.values());
		double charge = 0;
		for(int i=0;i<modules.size();i++) {
			for(int j=0;j<modules.get(i).size();j++) {
				charge += modules.get(i).get(j).getChargeHoraireModule();
			}
		}
		return charge;
	}
	public Double getChargeHoraireAnnuelle(String annee) {

		int anneeInscription = Integer.parseInt(dateInscription);
		int date = Integer.parseInt(annee);
		if(anneeInscription <= date) {
			double chargeHr=0;
			ArrayList<Module> modules = chargeHoraire.get(annee);

			for(Module itemModule : modules) {
				chargeHr += itemModule.getChargeHoraireModule();
			}
			return chargeHr;
		}else {
			return -1D;
		}

	}

	public double getVacationAnnuelle(String Date) {
		int anneeInscription = Integer.parseInt(dateInscription);
		int date = Integer.parseInt(Date);
		double vacation;
		if(anneeInscription <= date) {
			double chargeHoraireAnnuelle = getChargeHoraireAnnuelle(Date);
			if(chargeHoraireAnnuelle <=32) {
				vacation= (400*chargeHoraireAnnuelle)*(1-0.34);
			}
			else{
				double heuresSup = chargeHoraireAnnuelle - 32;
				vacation= (400*32)*(1-0.34)+(600*heuresSup)*(1-0.17); // vacation en dh
			}

			return vacation;
		}
		else {
			return -1;
		}

	}
	public Double getVacations() {
		double vacation;
			double chargeHoraire = this.getChargeHoraire();
			if(chargeHoraire <=32) {
				vacation= (400*chargeHoraire)*(1-0.34);
			}
			else{
				double heuresSup = chargeHoraire - 32;
				vacation= (400*32)*(1-0.34)+(600*heuresSup)*(1-0.17); // vacation en dh
			}

			return vacation;


	}


	public boolean addChargeHoraire(String Date,ArrayList<Module> modules) {
		if(modules.size() <= 2) {
			int anneeInscription = Integer.parseInt(dateInscription);
			int date = Integer.parseInt(Date);
			if(anneeInscription <= date) {
				if(! chargeHoraire.containsKey(Date)) {
					chargeHoraire.put(Date,modules);
					return true;
				}else {
					return false;
				}
			}
			else {
				return false;
			}

		}else{
			return false;
		}

	}
	public boolean updateChargeHoraire(String Date,ArrayList<Module> nouvModules) {
		if(nouvModules.size() <= 2) {
			int anneeInscription = Integer.parseInt(dateInscription);
			int date = Integer.parseInt(Date);
			if(anneeInscription <= date) {
				if(chargeHoraire.containsKey(Date)) {
					chargeHoraire.put(Date,nouvModules);
					return true;
				}else{
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}

	}

}
