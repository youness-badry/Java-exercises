import java.util.ArrayList;

public abstract class Etape {
    private Integer Duree;
    private String Libele;
    private ArrayList<Etape> sousTaches;

    public Etape() {
        this(0,"");
        sousTaches = new ArrayList<Etape>();
    }
    public Etape(Integer Duree,String Libele) {
        setDuree(Duree); //La duree d'une etape doit etre superieur ou egal a 0
        this.Libele = Libele;
        sousTaches = new ArrayList<Etape>();
    }
    public Integer getDuree() {
        return Duree;
    }

    public void setDuree(Integer duree) {
        Duree = (duree > 0) ? duree : 0;
    }


}
