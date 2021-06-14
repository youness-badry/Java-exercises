package Metier;

import java.util.ArrayList;

public class Etudiant implements Comparable{
    private Integer numero;
    private String nom;
    private String prenom;
    private String email;
    private String sexe;

    public Etudiant(Integer numero, String nom, String prenom, String email, String sexe) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public int compareTo(Object o) {
        Etudiant e = (Etudiant) o;
        return nom.compareTo(e.getNom());
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", sexe='" + sexe + '\'' +
                '}';
    }
}
