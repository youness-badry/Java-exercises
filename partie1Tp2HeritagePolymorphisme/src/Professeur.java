public class Professeur extends Personne implements Enseignant{

    private Integer numeroSomme;
    private String grade;
    private Module[] cours = new Module[4];


    public Professeur(String nom, Integer numeroSomme, String email, String grade,Module[] cours) {
        super(nom,email);
        this.numeroSomme = numeroSomme;
        this.grade = grade;
        this.cours = cours;
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

    public double getChargeHoraire() {
        double chargeHoraire=0;
        for(Module item : cours) {
            chargeHoraire += item.getChargeHoraireModule();
        }
        return chargeHoraire;
    }
    public double getVacations() {
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
        heuresSup = getChargeHoraire() - chargeMinimal;
        vacation= (400*getChargeHoraire())*(1-0.34)+(600*heuresSup)*(1-0.17)+5000;
        return vacation;

    }


}