import java.util.Comparator;

public class CompareByNumEtudiant implements Comparator<Etudiant> {

    public int compare(Etudiant e1,Etudiant e2) {
        return e1.getNumeroEtudiant().compareTo(e2.getNumeroEtudiant());
    }
}
