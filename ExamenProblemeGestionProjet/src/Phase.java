import java.util.ArrayList;

public class Phase extends Etape{
    private String Livrable;
    private ArrayList<Etape> etapes;

    public Phase() {
        etapes = new ArrayList<>(); // chaque phase est compose de plusieurs phases et/ou taches
    }
    public Phase(Integer Duree,String Libele,String Livrable) {
        super(Duree,Libele);
        this.Livrable = Livrable;
    }

}
