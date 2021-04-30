public class Module {

    private String libelle;
    private Integer coefficient;
    private Integer nbrHeuresCours;
    private Integer nbrHeuresTD;
    private Integer nbrHeuresTP;
    private Professeur professeurEnseignant;

    public Module(String libelle, Integer coefficient, Integer nbrHeuresCours, Integer nbrHeuresTD, Integer nbrHeuresTP, Professeur professeurEnseignant) {
        this.libelle = libelle;
        this.coefficient = coefficient;
        this.nbrHeuresCours = nbrHeuresCours;
        this.nbrHeuresTD = nbrHeuresTD;
        this.nbrHeuresTP = nbrHeuresTP;
        this.professeurEnseignant = professeurEnseignant;

    }

    public Module() {

        this("", 0, 0, 0, 0, new Professeur());
    }


    public String getLibelle() {
        return libelle;
    }

    public Integer getCoefficient() {
        return coefficient;
    }

    public Integer getNbrHeuresCours() {
        return nbrHeuresCours;
    }

    public Integer getNbrHeuresTD() {
        return nbrHeuresTD;
    }

    public Integer getNbrHeuresTP() {
        return nbrHeuresTP;
    }

    public Professeur getProfesseurEnseignant() {
        return professeurEnseignant;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }

    public void setNbrHeuresCours(Integer nbrHeuresCours) {
        this.nbrHeuresCours = nbrHeuresCours;
    }

    public void setNbrHeuresTD(Integer nbrHeuresTD) {
        this.nbrHeuresTD = nbrHeuresTD;
    }

    public void setNbrHeuresTP(Integer nbrHeuresTP) {
        this.nbrHeuresTP = nbrHeuresTP;
    }

    public void setProfesseurEnseignant(Professeur professeurEnseignant) {
        this.professeurEnseignant = professeurEnseignant;
    }

    public void afficheInfoModule() {

        System.out.println("Info Module : ");
        System.out.println("libelle = " + libelle);
        System.out.println("coefficient = " + coefficient);
        System.out.println("nbrHeuresCours = " + nbrHeuresCours);
        System.out.println("nbrHeuresTD = " + nbrHeuresTD);
        System.out.println("nbrHeuresTP = " + nbrHeuresTP);
        System.out.println("professeur Enseignant = ");
        professeurEnseignant.afficheInfoProfesseur();

    }
    public double getChargeHoraireModule() {
        double chargeHoraire = (nbrHeuresCours * 1.5) + (nbrHeuresTD) + (nbrHeuresTP * 0.75);
        return chargeHoraire;
    }
}
