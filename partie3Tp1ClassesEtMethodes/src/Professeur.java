public class Professeur {

    private String nom;
    private Integer numeroSomme;
    private String email;
    private String grade;

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


}