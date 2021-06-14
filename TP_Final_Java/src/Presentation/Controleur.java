package Presentation;

import Metier.*;
import Metier.Module;

import java.util.ArrayList;
import java.util.Collections;

public class Controleur {
    private FenetrePrincipal fenetrePrincipal;
    private ListeEtudiants listeEtudiants;
    private Formulaire formulaire;
    private FenetreOptionTri fenetreOptionTri;
    private FenetreSupprimEtudiant fenetreSupprimEtudiant;
    private FenetreListeModules fenetreListeModules;
    private FenetreListeNotes fenetreListeNotes;
    private FenetreAjouterNote fenetreAjouterNote;
    private GestionnaireEtudiant gestionnaireEtudiant;
    private GestionnaireNote gestionnaireNote;
    private GestionnaireModule gestionnaireModule;


    public Controleur() {
        this.gestionnaireEtudiant = new GestionnaireEtudiant();
        this.gestionnaireModule = new GestionnaireModule();
        this.gestionnaireNote = new GestionnaireNote();
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
    public void afficherListeModules() {
        ArrayList<Object> listeModulesObject = gestionnaireModule.getAll();
        ArrayList<Module> liste = (ArrayList<Module>)(ArrayList<?>)(listeModulesObject);
        this.fenetreListeModules = new FenetreListeModules(new ModelModule(liste));
        fenetreListeModules.setControleur(this);
        this.fenetreListeModules.setVisible(true);
    }
    public void afficherListeNotes() {
        ArrayList<Object> listeNotesObject = gestionnaireNote.getAll();
        ArrayList<Note> liste = (ArrayList<Note>)(ArrayList<?>)(listeNotesObject);
        this.fenetreListeNotes = new FenetreListeNotes(new ModelNote(liste));
        fenetreListeNotes.setControleur(this);
        this.fenetreListeNotes.setVisible(true);
    }
    public void afficherFenetreAjoutNote() {
        fenetreAjouterNote = new FenetreAjouterNote();
        fenetreAjouterNote.setControleur(this);
        fenetreAjouterNote.setVisible(true);
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
    public void ajouterNote(Note note) {
        gestionnaireNote.add(note);
        fenetreAjouterNote.setVisible(false);
    }
    public void setVisibleListeEtudiants(boolean b) {
        this.listeEtudiants.setVisible(b);
    }
    public void setVisibleListeModules(boolean b) {
        this.fenetreListeModules.setVisible(b);
    }
    public void setVisibleListeNotes(boolean b) {
        this.fenetreListeNotes.setVisible(b);
    }
}
