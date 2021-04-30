abstract class Personne {
    private String nom;
    private String email;

    public Personne(String nom,String email){
        this.nom = nom;
        this.email = email;
    }
    public Personne(){
        this.nom = "";
        this.email = "";
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
