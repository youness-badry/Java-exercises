import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant(1,"dahbi","soufiane","dahbi@gmail.com","masculin");
        Etudiant e2 = new Etudiant(2,"janane","youssef","janane@gmail.com","masculin");
        Etudiant e3 = new Etudiant(3,"elmafade","jamila","elmafade@gmail.com","feminin");
        Etudiant e4 = new Etudiant(4,"saji","meryem","saji@gmail.com","feminin");
        Etudiant e5 = new Etudiant(5,"azizi","mokhtar","azizi@gmail.com","masculin");
        ArrayList<Etudiant> liste = new ArrayList<>();
        liste.add(e1);
        liste.add(e2);
        liste.add(e3);
        liste.add(e4);
        liste.add(e5);
        Controleur controleur = new Controleur(liste);
    }
}
