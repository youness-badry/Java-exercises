public class UFR {

    private Enseignant[] enseignants = new Enseignant[6]; // 23 profs et 8 doctorants
    private Module[] modules = new Module[108];

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

    public void setEnseignants(Enseignant[] enseignants) {
        this.enseignants = enseignants;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }
}
