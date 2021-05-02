import java.util.ArrayList;
import java.util.Objects;

public class Etudiant implements Comparable<Etudiant> {
    private Integer numeroEtudiant;
    private String nom;
    private String email;

    public Etudiant(Integer numeroEtudiant, String nom, String email) {
        this.numeroEtudiant = numeroEtudiant;
        this.nom = nom;
        this.email = email;
    }

    public Integer getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(Integer numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void afficheInfo() {
        System.out.println("-----Info Etudiant-----");
        System.out.println("numero : "+numeroEtudiant);
        System.out.println("nom : "+nom);
        System.out.println("email : "+email+System.lineSeparator());

    }

    @Override
    public int compareTo(Etudiant e) {
        return numeroEtudiant.compareTo(e.numeroEtudiant);
    }

}
