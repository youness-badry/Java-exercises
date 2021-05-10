import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Formation {

    private String intitule;
    private Professeur professeurResponsable;
    private Semestre[] semestres = new Semestre[9];
    private Set<Etudiant> etudiants = new HashSet<>();

    public Formation(String intitule, Professeur professeurResponsable) {
        this.intitule = intitule;
        this.professeurResponsable = professeurResponsable;
    }
    public Formation() {
        this.intitule = "";
        this.professeurResponsable = new Professeur();
    }
    public String getIntitule() {
        return intitule;
    }
    public Professeur getProfesseurResponsable() {
        return professeurResponsable;
    }
    public Semestre getSemestre(int i) {
        return semestres[i];
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public void setProfesseurResponsable(Professeur professeurResponsable) {
        this.professeurResponsable = professeurResponsable;
    }
    public void setSemestres(Semestre semestre,int i) {
        this.semestres[i] = semestre;
    }
    @Override
    public String toString() {
        return "Formation [ intitule = "+intitule+" Professeur responsable : "+professeurResponsable.toString()+" ]";
    }

    public void afficher() {

        System.out.println(this.toString());
    }

    public double getChargeHoraireFormation() {
        double chargeHoraireFormation=0;
        for(Semestre item : semestres) {
            chargeHoraireFormation+=item.getChargeHoraireSemestre();
        }
        return chargeHoraireFormation;
    }
    public boolean addEtudiant(Etudiant etudiant) {
        return etudiants.add(etudiant);
    }
    public boolean removeEtudiant(Etudiant etudiant) {
        return etudiants.remove(etudiant);
    }
    public Etudiant getEtudiant(String numeroEtudiant) {
        Integer numEtudiant = Integer.parseInt(numeroEtudiant);
        for(Etudiant item : etudiants) {
            if(numEtudiant.equals(item.getNumeroEtudiant())) {
                return item;
            }
        }
        return null;
    }
    public void afficherEtudiantParOrdre() {

        ArrayList<Etudiant> listeEtudiants = new ArrayList<>(etudiants);
        CompareByNumEtudiant compareByNumEtudiant = new CompareByNumEtudiant();
        Collections.sort(listeEtudiants,compareByNumEtudiant);
        System.out.println(System.lineSeparator()+"Affichage de la liste des etudiants par ordre : "+System.lineSeparator());
        for(Etudiant item : listeEtudiants) {
            item.afficher();
        }

    }
    public void afficherEtudiantParOrdreAlpha() {

        ArrayList<Etudiant> listeEtudiants = new ArrayList<>(etudiants);
        CompareByNomEtudiant compareByNomEtudiant = new CompareByNomEtudiant();
        Collections.sort(listeEtudiants,compareByNomEtudiant);
        System.out.println(System.lineSeparator()+"Affichage de la liste des etudiants par ordre alphabetique : "+System.lineSeparator());
        for(Etudiant item : listeEtudiants) {
            item.afficher();
        }

    }
    public void afficheEtudiant(String numeroEtudiant) {
        for(Etudiant item : etudiants) {
            if(item.getNumeroEtudiant().equals(Integer.parseInt(numeroEtudiant))) {
                System.out.println(System.lineSeparator()+"Affichage des informations de l'etudiant avec le numero etudiant = "+numeroEtudiant+System.lineSeparator());
                item.afficher();
            }
        }
    }

}
















