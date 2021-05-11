import java.util.ArrayList;

public class Projet {
    private String Libele;
    private Integer Duree;
    private Consultant chefProjet;
    private ArrayList<Etape> etapes;

    public Projet() {
        super();
        etapes = new ArrayList<>(); // Un projet est compose de plusieurs phases et/ou taches
    }
    public Projet(String Libele,Integer Duree,Consultant chefProjet) {
        this.Libele = Libele;
        setDuree(Duree); // La duree du projet doit etre superieur ou egal a 0
        setChefProjet(chefProjet);

    }

    public void setChefProjet(Consultant chefProjet) {
        if(chefProjet.getRole().equals(Role.ChefDuProjet)) {
            this.chefProjet = chefProjet;
        }
    }

    public void setDuree(Integer duree) {
        Duree = (duree > 0) ? duree : 0; // La duree du projet doit etre superieur ou egal a 0
    }

    public boolean addEtape(Etape etape) { /* La somme des durees des phases d'un projet ne peut depasser
                                                la duree d'un projet */
        if(Duree < etape.getDuree()) {
            return false;
        }else {
            Integer dureeTotaleDesEtapes = 0;
            for(Etape val : etapes) {
                dureeTotaleDesEtapes += val.getDuree();
            }
            if(dureeTotaleDesEtapes+etape.getDuree() > Duree) {
                return false;
            }
            etapes.add(etape);
            return true;
        }
    }

}
