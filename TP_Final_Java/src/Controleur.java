import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;

public class Controleur {
    private ListeEtudiants listeEtudiants;
    private Formulaire formulaire;
    FenetreOptionTri fenetreOptionTri;
    FenetreSupprimEtudiant fenetreSupprimEtudiant;
    private ArrayList<Etudiant> etudiants;

    public Controleur(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
        this.afficherListeEtudiants(etudiants);
    }
    public void afficherListeEtudiants(ArrayList<Etudiant> etudiants) {
        this.listeEtudiants = new ListeEtudiants(new ModelEtudiant(etudiants));
        listeEtudiants.setControleur(this);
        this.listeEtudiants.setVisible(true);
    }
    public void afficherFenetreOptionTri() {
        fenetreOptionTri = new FenetreOptionTri();
        fenetreOptionTri.setControleur(this);
        fenetreOptionTri.setVisible(true);
    }
    public ArrayList<Etudiant> getEtudiantsTrieParNom() {
        ArrayList<Etudiant> ListeEtud = new ArrayList<>(etudiants);
        Collections.sort(ListeEtud);
        return ListeEtud;
    }
    public void afficherListeEtudiantsTriee() {
        fenetreOptionTri.setVisible(false);
        this.listeEtudiants.setVisible(false);
        this.listeEtudiants = new ListeEtudiants(new ModelEtudiant(this.getEtudiantsTrieParNom()));
        listeEtudiants.setControleur(this);
        this.listeEtudiants.setVisible(true);
    }
    public void afficherFenetreSupprim() {
        fenetreSupprimEtudiant = new FenetreSupprimEtudiant();
        fenetreSupprimEtudiant.setControleur(this);
        fenetreSupprimEtudiant.setVisible(true);
    }
    public void supprimerEtudiantByNom(String nom) {
        etudiants.removeIf(etudiant -> etudiant.getNom().equals(nom));
        fenetreSupprimEtudiant.setVisible(false);
        this.listeEtudiants.setVisible(false);
        this.listeEtudiants = new ListeEtudiants(new ModelEtudiant(this.etudiants));
        listeEtudiants.setControleur(this);
        this.listeEtudiants.setVisible(true);
    }
}
