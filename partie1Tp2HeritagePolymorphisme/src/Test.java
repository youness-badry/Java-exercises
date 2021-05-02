public class Test {

    public static void main(String[] args) {
            Professeur prof1 =new Professeur("LAJKI",100,"lajki@gmail.com","PA");
            Formation f = new Formation("Genie Informatique",prof1);
            Etudiant e1 = new Etudiant("Kamil anas",100,"kamil@gmail.com");
            Etudiant e2 = new Etudiant("Dahbi Yassine",107,"dahbi@gmail.com");
            Etudiant e3 = new Etudiant("Raki Imane",50,"raki@gmail.com");
            Etudiant e4 = new Etudiant("Adab Youssef",27,"adab@gmail.com");
            f.addEtudiant(e1);
            f.addEtudiant(e2);
            f.addEtudiant(e3);
            f.addEtudiant(e4);
            f.afficherEtudiantParOrdre();
            f.afficherEtudiantParOrdreAlpha();
            f.afficheEtudiant("107");
            //String nom, Integer numeroSomme, String email, String grade(PA, PH , PES)
            //String nom,Integer numeroEtudiant,String email,String sujetThese,Professeur[] encadrant,Module[] cours
            //Module(String libelle, Integer coefficient, Integer nbrHeuresCours, Integer nbrHeuresTD, Integer nbrHeuresTP, Professeur professeurEnseignant)

           /* Module[] modulesProf = new Module[4];
            Professeur prof1 =new Professeur("LAJKI",100,"lajki@gmail.com","PA",modulesProf);
            Professeur prof2 =new Professeur("SADIQ",104,"sadiq@gmail.com","PES",modulesProf);
            Module module1 = new Module("Programmation Java",7,20,10,9,prof1);
            Module module2 = new Module("Developpement Android",4,30,12,12,prof2);
            Module module3 = new Module("Gestion de production Industrielle",2,15,7,7,prof1);
            Module module4 = new Module("Programmation Python",9,40,20,15,prof2);
            modulesProf[0] = module1;
            modulesProf[1] = module2;
            modulesProf[2] = module3;
            modulesProf[3] = module4;
            Module[] modulesDoct = {module2,module4};
            Professeur[] encadrant = {prof1,prof2};

            Doctorant doct1 =new Doctorant("KARIM",14200,
                    "karim@gmail.com",
                    "Conception d’un système informatique - learning analytics.",
                    encadrant,modulesDoct);
            Doctorant doct2 =new Doctorant("SOUFIANE",11937,
                    "soufiane@gmail.com",
                    "Machine learning",
                    encadrant,modulesDoct);

            Enseignant[] enseignants = {prof1,prof2,doct1,doct2};
            ufr.setEnseignants(enseignants);
            ufr.setModules(modulesProf);

            ufr.afficher();
            double ch = ufr.getVacations();
            System.out.println("la charge financiere totale de l'UFR = "+ch+" DH");*/


    }
}
