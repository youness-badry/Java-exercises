import java.util.ArrayList;
import java.util.HashMap;

public class Professeur extends Personne implements Enseignent {
	private Integer  nummerSomme;
	private Grade grade;
	public  HashMap<String, ArrayList<Module>> chargeHoraire;
	public Professeur() {
		super();
		chargeHoraire = new HashMap<String, ArrayList<Module>>();
	}
	public Professeur(String nom, Integer nummerSomme, String email, String grade) throws ErrGradeProf{
		super(nom, email);
		if(!(grade.equals("PA") || grade.equals("PH") || grade.equals("PES"))) {
			throw new ErrGradeProf("Grade non valide");
		}
		chargeHoraire = new HashMap<String, ArrayList<Module> > ();;
		this.nummerSomme = nummerSomme;
		this.grade = Grade.valueOf(grade);
	}

	public Integer getNummerSomme() {
		return nummerSomme;
	}
	public void setNummerSomme(Integer nummerSomme) {
		this.nummerSomme = nummerSomme;
	}

	public Grade getGrade() {
		return grade;
	}
	public void setGrade(String grade) throws ErrGradeProf{
		if(!(grade.equals("PA") || grade.equals("PH") || grade.equals("PES"))) {
			throw new ErrGradeProf("Grade non valide");
		}else {
			this.grade = Grade.valueOf(grade);
		}
	}
	@Override
	public String toString() {
		return "Professeur [nom=" + this.getNom() + ", nummerSomme=" + nummerSomme + ","
				+ " email=" + this.getEmail() + ", grade=" + grade
				+ "]";
	}

	public void afficher() {
		System.out.println(this.toString());
	}
	public boolean addChargeHoraire(String Date, ArrayList<Module> charge) {
		if(this.chargeHoraire.containsKey(Date)) return false;
		this.chargeHoraire.put(Date, charge);
		return true;
	}
	public boolean updateChargeHoraire(String date, ArrayList<Module> charge) {
		if(!this.chargeHoraire.containsKey(date)) {
			return false;
		}
		this.chargeHoraire.put(date, charge);
		return true;
	}
	@Override
	public Double getChargeHoraire() {
		double charge = 0;
		ArrayList<ArrayList<Module>> list = new ArrayList<>( this.chargeHoraire.values());
		for(int i = 0; i < list.size(); i ++) {
			for( int j = 0; j < list.get(i).size(); j ++) {
				charge = charge + list.get(i).get(j).getChargeHoraireModule();
			}
		}
		return charge;
	}
	public double getChargeAnnuelle(String ann??e) {
		double charge = 0;
		for( int j = 0; j < this.chargeHoraire.get(ann??e).size(); j ++) {
				charge = charge + this.chargeHoraire.get(ann??e).get(j).getChargeHoraireModule();
			}
		return charge;
	}
	@Override
	public Double getVacations() {
		double somme = 0;
		int charge ;
		if(this.grade.equals(Grade.PA)) {
			charge = 320;
		}
		else {
			if(this.grade.equals(Grade.PH)){
				charge = 300;;
			}
			else {
				charge = 280;
			}
		}
		if(this.getChargeHoraire() > charge ) {
			somme = 32*400*0.66 + (this.getChargeHoraire() - charge ) *600*0.83;
		}
		else {
			somme = this.getChargeHoraire()*400*0.66;
		}
		return somme +5000*this.chargeHoraire.size();
	}
	public Double getVacationAnnuelle(String ann??e) {
		double somme = 0;
		int charge ;
		if(this.grade.equals(Grade.PA)) {
			charge = 320;
		}
		else {
			if(this.grade.equals(Grade.PH)){
				charge = 300;;
			}
			else {
				charge = 280;
			}
		}
		if(this.getChargeAnnuelle(ann??e) > charge ) {
			somme = 32*400*0.66 + (this.getChargeAnnuelle(ann??e) - charge ) *600*0.83;
		}
		else {
			somme = this.getChargeAnnuelle(ann??e)*400*0.66;
		}
		return somme +5000;
	}




}
