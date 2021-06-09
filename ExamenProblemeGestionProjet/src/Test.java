public class Test {
    public static void main(String[] args) {
        Phase phase1 = new Phase(20,"Developpement","Liv2");
        Phase phase2 = new Phase(15,"Analyse","Liv7");
        Consultant consultant1 = new Consultant("samir",20000,"gamko@gmail.com",Role.ChefDuProjet);
        Consultant consultant2 = new Consultant("anassi",15000,"anassi@gmail.com",Role.Developpeur);
        Tache tache1 = new Tache(10,"Conception",TypeTache.Conception,3000D,consultant1);
        Tache tache2 = new Tache(5,"Test",TypeTache.Developpement,15000D,consultant2);
        try {
            tache1.addSousTaches(tache2);
            phase1.addSousTaches(phase2);
        }catch (ExceptionAjoutTache e) {
            System.out.println(e.getMessage());
        }catch (ExceptionAjoutPhase p) {
            System.out.println(p.getMessage());
        }


    }
}
