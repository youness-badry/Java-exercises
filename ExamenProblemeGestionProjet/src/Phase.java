import java.util.ArrayList;

public class Phase extends Etape {
    private String Livrable;
    private ArrayList<Etape> sousTachesPourPhase;

    public Phase() {
        super();
        this.sousTachesPourPhase = new ArrayList<Etape>();
    }

    public Phase(Integer Duree, String Libele, String Livrable) {
        super(Duree, Libele);
        this.Livrable = Livrable;
        this.sousTachesPourPhase = new ArrayList<Etape>();
    }

    public boolean addSousTaches(Etape etape) throws ExceptionAjoutPhase{ /* Chaque phase est compose de plusieurs phases et/ou taches */

        /*La somme des durées des sous taches d’une phase ne peut
                                                         dépasser la durée d’une phase*/
        if (getDureeTotaleSousTaches() + etape.getDuree() > this.getDuree()) {
            throw new ExceptionAjoutPhase("La duree des sous taches de la phase ne peut pas dépasser la durée de la phase");
        }
        return sousTachesPourPhase.add(etape);
    }

    public Integer getDureeTotaleSousTaches() {
        Integer dureeTotaleDesSousTaches = 0;
        for (Etape val : sousTachesPourPhase) {
            dureeTotaleDesSousTaches += val.getDuree();
        }
        return dureeTotaleDesSousTaches;
    }

}
