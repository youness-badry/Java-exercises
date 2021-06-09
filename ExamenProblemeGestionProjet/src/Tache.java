import java.util.ArrayList;
import java.util.List;

public class Tache extends Etape {
    private TypeTache type; /*Une tache est de type développement, spécification, conception ou test*/
    private Double cout;
    private Consultant responsable;
    private ArrayList<Tache> sousTachesTypeTache;

    public Tache() {
        super();
        sousTachesTypeTache = new ArrayList<>();
    }

    public Tache(Integer Duree, String Libele, TypeTache type,Double cout,Consultant responsable) {
        super(Duree, Libele);
        this.type = type;
        this.cout = cout;
        this.responsable = responsable;
        sousTachesTypeTache = new ArrayList<>();
    }

    public boolean addSousTaches(Tache tache)  throws ExceptionAjoutTache{
        /* Une tache ne peut avoir que des sous Taches (pas de phase comme sous tache)*/

             /*La somme des durées des sous taches d’une tache ne peut
                                                         dépasser la durée d’une tache*/

        if (getDureeTotaleSousTaches() + tache.getDuree() > this.getDuree()) {
            throw new ExceptionAjoutTache("La duree des sous taches ne peut pas dépasser la durée de la tache");
        }
        return sousTachesTypeTache.add(tache);

    }

    public Integer getDureeTotaleSousTaches() {
        Integer dureeTotaleDesSousTaches = 0;
        for (Tache val : sousTachesTypeTache) {
            dureeTotaleDesSousTaches += val.getDuree();
        }
        return dureeTotaleDesSousTaches;
    }

    public Double getCout() {
        Double coutTotale = 0D;
        for (Tache val : sousTachesTypeTache) {
            coutTotale += val.cout * val.responsable.getRemunerationHoraire();
        }
        return coutTotale;
    }
}
