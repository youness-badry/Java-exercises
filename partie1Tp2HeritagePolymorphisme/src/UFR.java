import java.util.ArrayList;

public class UFR {

    private ArrayList<Enseignant> enseignants = new ArrayList<>();
    private ArrayList<Module> modules= new ArrayList<>();

    public UFR() {

    }
    public void afficher() {

        for(Enseignant item : enseignants){
            if(item instanceof Professeur)
            {
                ((Professeur) item).afficherInfo();
            }else if(item instanceof Doctorant) {
                ((Doctorant) item).afficherInfo();
            }
            System.out.println("La charge horaire de l'enseignant est : "+ item.getChargeHoraire()+" heures"+System.lineSeparator());
        }
    }
    public double getVacations() {
        double chargeFinanciereVacations=0;
        for(Enseignant item : enseignants){
            chargeFinanciereVacations += item.getVacations();
        }
        return chargeFinanciereVacations;
    }

    public void setEnseignants(ArrayList<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }

    public void setModules(ArrayList<Enseignant> enseignants) {
        this.modules = modules;
    }

    public Personne rechercheMembre(Personne p) {
        if(enseignants.contains((Enseignant) p)) {
            return p;
        }else{
            return null;
        }
    }

}
