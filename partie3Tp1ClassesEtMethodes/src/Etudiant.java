public class Etudiant {
    private String nom;
    private Integer numeroEtudiant;
    private String email;

    public Etudiant() {
        this("",0,"");
    }
    public Etudiant(String nom,Integer numeroEtudiant,String email) {
        this.nom = nom;
        this.numeroEtudiant = numeroEtudiant;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }
    public Integer getNumeroEtudiant() {
        return numeroEtudiant;
    }
    public String getEmail() {
        return email;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNumeroEtudiant(Integer numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void afficheInfoEtudiant() {
        System.out.println("Info Etudiant : ");
        System.out.println("nom = "+nom);
        System.out.println("numero Etudiant = "+numeroEtudiant);
        System.out.println("email = "+email);
        System.out.println("---------------");
    }









}
