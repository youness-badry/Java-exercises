import java.util.Comparator;

public class CompareByNomEtudiant implements Comparator<Etudiant> {

    public int compare(Etudiant e1,Etudiant e2) {
        return e1.getNom().compareTo(e2.getNom());
    }
}
