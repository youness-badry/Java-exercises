package Presentation;

import Metier.Etudiant;
import Metier.GestionnaireEtudiant;

import java.util.ArrayList;
import java.util.Collections;

public class Controleur {
    private FenetrePrincipal fenetrePrincipal;
    private ListeEtudiants listeEtudiants;
    private Formulaire formulaire;
    private FenetreOptionTri fenetreOptionTri;
    private FenetreSupprimEtudiant fenetreSupprimEtudiant;
    private GestionnaireEtudiant gestionnaireEtudiant;


    public Controleur() {
        this.gestionnaireEtudiant = new GestionnaireEtudiant();
        this.afficherFenetrePrincipal();
    }
    public void afficherFenetrePrincipal() {
        this.fenetrePrincipal = new FenetrePrincipal();
        this.fenetrePrincipal.setControleur(this);
        fenetrePrincipal.setVisible(true);
    }
    public void afficherListeEtudiants() {
        ArrayList<Object> listeEtudiantsObject = gestionnaireEtudiant.getAll();
        ArrayList<Etudiant> listeEtuds = (ArrayList<Etudiant>)(ArrayList<?>)(listeEtudiantsObject);
        this.listeEtudiants = new ListeEtudiants(new ModelEtudiant(listeEtuds));
        listeEtudiants.setControleur(this);
        this.listeEtudiants.setVisible(true);
    }
    public void afficherFenetreOptionTri() {
        fenetreOptionTri = new FenetreOptionTri();
        fenetreOptionTri.setControleur(this);
        fenetreOptionTri.setVisible(true);
    }
    public void afficherListeEtudiantsTriee() {
        fenetreOptionTri.setVisible(false);
        this.listeEtudiants.setVisible(false);
        ArrayList<Object> listeEtudiantsObject = gestionnaireEtudiant.getAllOrderByName();
        ArrayList<Etudiant> listeEtuds = (ArrayList<Etudiant>)(ArrayList<?>)(listeEtudiantsObject);
        this.listeEtudiants = new ListeEtudiants(new ModelEtudiant(listeEtuds));
        listeEtudiants.setControleur(this);
        this.listeEtudiants.setVisible(true);
    }
    public void afficherFenetreSupprim() {
        fenetreSupprimEtudiant = new FenetreSupprimEtudiant();
        fenetreSupprimEtudiant.setControleur(this);
        fenetreSupprimEtudiant.setVisible(true);
    }
    public void supprimerEtudiantByNom(String nom) {
        gestionnaireEtudiant.delete(nom);
        fenetreSupprimEtudiant.setVisible(false);
        this.listeEtudiants.setVisible(false);
        this.afficherListeEtudiants();
    }
    public void afficherFormulaireAjoutEtudiant() {
        formulaire = new Formulaire();
        formulaire.setControleur(this);
        formulaire.setVisible(true);
    }
    public void ajouterEtudiant(Etudiant etudiant) {
        gestionnaireEtudiant.add(etudiant);
        formulaire.setVisible(false);
        this.listeEtudiants.setVisible(false);
        this.afficherListeEtudiants();
    }
    public void setVisibleListeEtudiants(boolean b) {
        this.listeEtudiants.setVisible(b);
    }
}
