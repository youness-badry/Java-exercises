public class Professeur extends Personne implements Enseignant{

    private String nom;
    private Integer numeroSomme;
    private String email;
    private String grade;
    private Module[] cours = new Module[4];


    public Professeur(String nom, Integer numeroSomme, String email, String grade) {
        this.nom = nom;
        this.numeroSomme = numeroSomme;
        this.email = email;
        this.grade = grade;
    }

    public Professeur() {
        this("",0,"","");
    }

    public String getNom() {
        return nom;
    }

    public Integer getNumeroSomme() {
        return numeroSomme;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumeroSomme(Integer numeroSomme) {
        this.numeroSomme = numeroSomme;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void afficheInfoProfesseur() {

        System.out.println("Info Professeur : ");
        System.out.println("nom = "+nom);
        System.out.println("numero Somme = "+numeroSomme);
        System.out.println("email = "+email);
        System.out.println("grade = "+grade);
        System.out.println("---------------");
    }

    public double getChargeHoraire() {
        double chargeHoraire=0;
        for(int i=0;i<cours.length;i++) {
            chargeHoraire += cours[i].getChargeHoraireModule();
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