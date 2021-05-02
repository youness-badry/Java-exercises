import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        Etudiant e1 = new Etudiant(100,"Kamil anas","kamil@gmail.com");
        Etudiant e2 = new Etudiant(107,"Dahbi Yassine","dahbi@gmail.com");
        Etudiant e3 = new Etudiant(50,"Raki Imane","raki@gmail.com");
        Etudiant e4 = new Etudiant(27,"Adab Youssef","adab@gmail.com");
        etudiants.add(e1);
        etudiants.add(e2);
        etudiants.add(e3);
        etudiants.add(e4);
        for(Etudiant item : etudiants) {
            item.afficheInfo();
        }

        CompareByNumEtudiant compareByNumEtudiant = new CompareByNumEtudiant();
        Collections.sort(etudiants,compareByNumEtudiant);

        System.out.println("Apres le tri par numero : ");
        for(Etudiant item : etudiants) {
            item.afficheInfo();
        }

        CompareByNomEtudiant compareByNomEtudiant = new CompareByNomEtudiant();
        Collections.sort(etudiants,compareByNomEtudiant);
        System.out.println("Apres le tri par nom : ");
        for(Etudiant item : etudiants) {
            item.afficheInfo();
        }
    }
}
