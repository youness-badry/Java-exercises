public class Test {
    public static void main(String[] args) {
        //String nom, Integer nummerSomme, String email, String grade
        try {
            Professeur p1 = new Professeur("TABADI ABDELKRIM",30124,"tabadi@gmail.com","PA");
            Professeur p2 = new Professeur("KASI DOUMA",50124,"kasi@gmail.com","PES");
            p1.afficher();
            p2.afficher();
            System.out.println(System.lineSeparator());
            Professeur[] encadrants = new Professeur[2];
            encadrants[0] = p1;
            encadrants[1] = p2;
            Doctorant d1 =new Doctorant("saide soufiane",202,"saide@gmail.com","Machine Learning","2017");
            d1.setEncadrant(encadrants);
            d1.afficher();

        }catch (ErrGradeProf errGradeProf) {
            System.out.println(errGradeProf.getMessage());
        }catch(ErrGradeEncadrant errGradeEncadrant) {
            System.out.println(errGradeEncadrant.getMessage());
        }

    }

}
