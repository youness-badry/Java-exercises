import java.util.ArrayList;
import java.util.List;

public class Tache extends Etape{
    private TypeTache type;
    private ArrayList<Consultant> responsables;
    private ArrayList<Tache> sousTaches;

    public Tache() {
        sousTaches = new ArrayList<>(); /* une tache ne peut avoir que des sous taches pas de
                                            phase comme sous taches */
        responsables = new ArrayList<>();
    }
    public Tache(Integer Duree,String Libele,TypeTache type) {
        super(Duree,Libele);
        this.type = type;
    }
}
