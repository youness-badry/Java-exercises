import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Doctorant extends Etudiant implements Enseignant{

    private String sujetThese;
    private Professeur[] encadrant = new Professeur[2];
    private HashMap<String/*Annee*/, ArrayList<Module>> chargeHoraire = new HashMap<>();
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

    public ArrayList<Module> getModules() { // retourne la liste des modules de l'annee en cours
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        String year = Integer.toString(currentYear);
        return chargeHoraire.get(year);
    }
    public ArrayList<Module> getModules(String date) { // retourne les modules d'une annee quelconque
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
    public void afficherInfo() {
        System.out.println("Info Doctorant : ");
        super.afficherInfo();
    }
   public double getChargeHoraire() { // retourne la charge horaire de l'annee en cours du doctorant
       Calendar calendar = Calendar.getInstance();
       int currentYear = calendar.get(Calendar.YEAR);
       String year = Integer.toString(currentYear);
       return getChargeHoraireAnnuelle(year);
   }
    public double getChargeHoraireAnnuelle(String annee) { // retourne la charge horaire annuelle d'une annee quelconque du doctorant

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
            return -1;
        }

    }

    public double getVacations() { // retourne la vacation de l'annee en cours du doctorant
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        String year = Integer.toString(currentYear);
        return getVacationAnnuelle(year);

    }
    public double getVacationAnnuelle(String Date) { // retourne la vacation d'une annee quelconque du doctorant
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
                if(chargeHoraire.containsKey(date)) {
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
