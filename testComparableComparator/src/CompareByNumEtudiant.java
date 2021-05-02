import java.util.Comparator;

public class CompareByNumEtudiant implements Comparator<Etudiant> {

    public int compare(Etudiant e1, Etudiant e2) {
        if(e1.getNumeroEtudiant().compareTo(e2.getNumeroEtudiant()) == 0) {
            return 0;
        }else if(e1.getNumeroEtudiant().compareTo(e2.getNumeroEtudiant()) < 0) {
            return -1;
        }else {
            return 1;
        }
    }
}
