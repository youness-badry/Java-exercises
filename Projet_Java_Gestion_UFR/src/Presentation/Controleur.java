package Presentation;

import Metier.Module;
import Metier.*;

import java.util.ArrayList;

public class Controleur {
    private FenetrePrincipalApplication fenetrePrincipalApplication;
    private FenetreGestionFormations fenetreGestionFormations;
    private FenetreGestionModules fenetreGestionModules;
    private FenetreGestionEtudiants fenetreGestionEtudiants;
    private FenetreGestionPersonnel fenetreGestionPersonnel;

    private FenetreSupprimEtudiant fenetreSupprimEtudiant;
    private FenetreListeModules fenetreListeModules;
    private FenetreListeNotes fenetreListeNotes;
    private FenetreListeEtudiants fenetreListeEtudiants;
    private FenetreListeEtudiantsParOrdre fenetreListeEtudiantsParOrdre;
    private FenetreListeFormations fenetreListeFormations;
    private FenetreAjoutFormation fenetreAjoutFormation;
    private FenetreAjoutModule fenetreAjoutModule;
    private FenetreAjoutEtudiant fenetreAjoutEtudiant;
    private FenetreAjouterNote fenetreAjouterNote;

    private GestionnaireEtudiant gestionnaireEtudiant;
    private GestionnaireNote gestionnaireNote;
    private GestionnaireModule gestionnaireModule;
    private GestionnaireFormation gestionnaireFormation;

    public Controleur() {
        this.gestionnaireEtudiant = new GestionnaireEtudiant();
        this.gestionnaireModule = new GestionnaireModule();
        this.gestionnaireNote = new GestionnaireNote();
        this.gestionnaireFormation = new GestionnaireFormation();
        this.afficherFenetrePrincipalApplication();
    }

    public void afficherFenetrePrincipalApplication() {
        this.fenetrePrincipalApplication = new FenetrePrincipalApplication();
        this.fenetrePrincipalApplication.setControleur(this);
        fenetrePrincipalApplication.setVisible(true);
    }

    public void afficherFenetreGestionFormations() {
        this.fenetreGestionFormations = new FenetreGestionFormations();
        this.fenetreGestionFormations.setControleur(this);
        fenetreGestionFormations.setVisible(true);
    }

    public void afficherFenetreGestionModules() {
        this.fenetreGestionModules = new FenetreGestionModules();
        this.fenetreGestionModules.setControleur(this);
        fenetreGestionModules.setVisible(true);
    }

    public void afficherFenetreGestionEtudiants() {
        this.fenetreGestionEtudiants = new FenetreGestionEtudiants();
        this.fenetreGestionEtudiants.setControleur(this);
        fenetreGestionEtudiants.setVisible(true);
    }

    public void afficherListeFormations() {
        ArrayList<Object> listeFormationsObject = gestionnaireFormation.getAll();
        ArrayList<Formation> liste = (ArrayList<Formation>) (ArrayList<?>) (listeFormationsObject);
        this.fenetreListeFormations = new FenetreListeFormations(new ModelFormation(liste));
        fenetreListeFormations.setControleur(this);
        this.fenetreListeFormations.setVisible(true);
    }

    public void afficherListeEtudiants() {
        ArrayList<Object> listeEtudiantsObject = gestionnaireEtudiant.getAll();
        ArrayList<Etudiant> listeEtuds = (ArrayList<Etudiant>) (ArrayList<?>) (listeEtudiantsObject);
        this.fenetreListeEtudiants = new FenetreListeEtudiants(new ModelEtudiant(listeEtuds));
        fenetreListeEtudiants.setControleur(this);
        this.fenetreListeEtudiants.setVisible(true);
    }

    public void afficherListeEtudiantsParOrdre() {
        ArrayList<Object> listeEtudiantsObject = gestionnaireEtudiant.getAllOrderByName();
        ArrayList<Etudiant> listeEtuds = (ArrayList<Etudiant>) (ArrayList<?>) (listeEtudiantsObject);
        this.fenetreListeEtudiantsParOrdre = new FenetreListeEtudiantsParOrdre(new ModelEtudiant(listeEtuds));
        fenetreListeEtudiantsParOrdre.setControleur(this);
        this.fenetreListeEtudiantsParOrdre.setVisible(true);
    }

    public void afficherListeModules() {
        ArrayList<Object> listeModulesObject = gestionnaireModule.getAll();
        ArrayList<Module> liste = (ArrayList<Module>) (ArrayList<?>) (listeModulesObject);
        this.fenetreListeModules = new FenetreListeModules(new ModelModule(liste));
        fenetreListeModules.setControleur(this);
        this.fenetreListeModules.setVisible(true);
    }

    public void afficherListeNotes() {
        ArrayList<Object> listeNotesObject = gestionnaireNote.getAll();
        ArrayList<Note> liste = (ArrayList<Note>) (ArrayList<?>) (listeNotesObject);
        this.fenetreListeNotes = new FenetreListeNotes(new ModelNote(liste));
        fenetreListeNotes.setControleur(this);
        this.fenetreListeNotes.setVisible(true);
    }

    public void afficherFenetreAjoutNote() {
        fenetreAjouterNote = new FenetreAjouterNote();
        fenetreAjouterNote.setControleur(this);
        fenetreAjouterNote.setVisible(true);
    }

    public void afficherFenetreAjoutFormation() {
        fenetreAjoutFormation = new FenetreAjoutFormation();
        fenetreAjoutFormation.setControleur(this);
        fenetreAjoutFormation.setVisible(true);
    }

    public void afficherFenetreAjoutModule() {
        fenetreAjoutModule = new FenetreAjoutModule();
        fenetreAjoutModule.setControleur(this);
        fenetreAjoutModule.setVisible(true);
    }

    public void afficherFenetreAjoutEtudiant() {
        fenetreAjoutEtudiant = new FenetreAjoutEtudiant();
        fenetreAjoutEtudiant.setControleur(this);
        fenetreAjoutEtudiant.setVisible(true);
    }

    public void afficherFenetreSupprimEtudiant() {
        fenetreSupprimEtudiant = new FenetreSupprimEtudiant();
        fenetreSupprimEtudiant.setControleur(this);
        fenetreSupprimEtudiant.setVisible(true);
    }


    public void supprimerEtudiantByNom(String nom) {
        gestionnaireEtudiant.delete(nom);
        fenetreSupprimEtudiant.setVisible(false);
    }


    public void ajouterEtudiant(Etudiant etudiant) {
        gestionnaireEtudiant.add(etudiant);
        fenetreAjoutEtudiant.setVisible(false);
    }

    public void ajouterNote(Note note) {
        gestionnaireNote.add(note);
        fenetreAjouterNote.setVisible(false);
    }

    public void ajouterFormation(Formation formation) {
        gestionnaireFormation.add(formation);
        fenetreAjoutFormation.setVisible(false);
    }

    public void ajouterModule(Module module) {
        gestionnaireModule.add(module);
        fenetreAjoutModule.setVisible(false);
    }

    public void setVisibleListeEtudiants(boolean b) {
        this.fenetreListeEtudiants.setVisible(b);
    }

    public void setVisibleListeEtudiantsParOrdre(boolean b) {
        this.fenetreListeEtudiantsParOrdre.setVisible(b);
    }

    public void setVisibleListeModules(boolean b) {
        this.fenetreListeModules.setVisible(b);
    }

    public void setVisibleListeNotes(boolean b) {
        this.fenetreListeNotes.setVisible(b);
    }

    public void setVisibleListeFormations(boolean b) {
        this.fenetreListeFormations.setVisible(b);
    }

    public void setVisibleFenetreGestionFormations(boolean b) {
        this.fenetreGestionFormations.setVisible(b);
    }

    public void setVisibleFenetreGestionModules(boolean b) {
        this.fenetreGestionModules.setVisible(b);
    }

    public void setVisibleFenetreGestionEtudiants(boolean b) {
        this.fenetreGestionEtudiants.setVisible(b);
    }

}
