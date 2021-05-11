import java.util.ArrayList;

public abstract class Etape {
    private Integer Duree;
    private String Libele;
    private ArrayList<Etape> sousTaches;

    public Etape() {
        sousTaches = new ArrayList<>();
    }
    public Etape(Integer Duree,String Libele) {
        this.Duree = (Duree > 0) ? Duree : 0; //La duree d'une etape doit etre superieur ou egal a 0
        this.Libele = Libele;
    }
    public Integer getDuree() {
        return Duree;
    }

    public void setDuree(Integer duree) {
        Duree = (duree > 0) ? duree : 0;
    }

    public boolean addSousTache(Etape etape) { /* La somme des durees des sous taches d'une etape ne peut depasser
                                                la duree d'une etape */
        if(Duree < etape.getDuree()) {
            return false;
        }else {
            Integer dureeTotaleDesEtapes = 0;
            for(Etape val : sousTaches) {
                dureeTotaleDesEtapes += val.getDuree();
            }
            if(dureeTotaleDesEtapes+etape.getDuree() > Duree) {
                return false;
            }
            sousTaches.add(etape);
            return true;
        }
    }
}
