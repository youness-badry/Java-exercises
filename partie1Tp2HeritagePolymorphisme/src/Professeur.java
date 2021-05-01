import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Professeur extends Personne implements Enseignant{

    private Integer numeroSomme;
    private String grade;
    private HashMap<String/*Annee*/,ArrayList<Module>> chargeHoraire = new HashMap<>();


    public Professeur(String nom, Integer numeroSomme, String email, String grade) {
        super(nom,email);
        this.numeroSomme = numeroSomme;
        this.grade = grade;
    }

    public Professeur() {
        super("","");
        this.numeroSomme = 0;
        this.grade = "";
    }

    public Integer getNumeroSomme() {
        return numeroSomme;
    }

    public String getGrade() {
        return grade;
    }
    public ArrayList<Module> getModules() { // retourne la liste des modules de l'annee en cours
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        String year = Integer.toString(currentYear);
        return chargeHoraire.get(year);
    }
    public ArrayList<Module> getModules(String date) { // retourne les modules d'une annee quelconque
        return chargeHoraire.get(date);
    }
    public void setNumeroSomme(Integer numeroSomme) {
        this.numeroSomme = numeroSomme;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void afficherInfo() {

        System.out.println("Info Professeur : ");
        System.out.println("nom = "+getNom());
        System.out.println("numero Somme = "+numeroSomme);
        System.out.println("email = "+getEmail());
        System.out.println("grade = "+grade);
        System.out.println("---------------");
    }

    public double getChargeHoraire() { // retourne la charge horaire de l'annee en cours du professeur
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        String year = Integer.toString(currentYear);
        return getChargeHoraireAnnuelle(year);
    }
    public double getChargeHoraireAnnuelle(String annee) { // retourne la charge horaire annuelle d'une annee quelconque du professeur
        double chargeHr=0;
        ArrayList<Module> modules = chargeHoraire.get(annee);

        for(Module itemModule : modules) {
            chargeHr += itemModule.getChargeHoraireModule();
        }

        return chargeHr;
    }

    public double getVacations() { // retourne la vacation de l'annee en cours du professeur
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        String year = Integer.toString(currentYear);
        return getVacationAnnuelle(year);

    }
    public double getVacationAnnuelle(String Date) { // retourne la vacation annuelle d'une annee quelconque du professeur
        int chargeMinimal=0;
        double heuresSup=0;
        double vacation=0;
        if(grade.equals("PA")) {
            chargeMinimal = 320;
        }else if(grade.equals("PH")) {
            chargeMinimal = 300;
        }else if(grade.equals("PES")) {
            chargeMinimal = 280;
        }
        heuresSup = getChargeHoraireAnnuelle(Date) - chargeMinimal;
        vacation= (400*getChargeHoraireAnnuelle(Date))*(1-0.34)+(600*heuresSup)*(1-0.17)+5000;
        return vacation;

    }

    public boolean addChargeHoraire(String Date,ArrayList<Module> modules) {
        if(! chargeHoraire.containsKey(Date)) {
            chargeHoraire.put(Date,modules);
            return true;
        }else {
            return false;
        }
    }
    public boolean updateChargeHoraire(String date,ArrayList<Module> nouvModules) {
        if(chargeHoraire.containsKey(date)) {
            chargeHoraire.put(date,nouvModules);
            return true;
        }else{
            return false;
        }
    }



}