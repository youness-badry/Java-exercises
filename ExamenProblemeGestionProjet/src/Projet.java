import java.util.ArrayList;
import java.util.Objects;

public class Projet {
    private String Libele;
    private Integer Duree;
    private Consultant chefProjet;
    private ArrayList<Etape> etapes;

    public Projet() {
        super();
        etapes = new ArrayList<>(); // Un projet est compose de plusieurs phases et/ou taches
    }

    public Projet(String Libele, Integer Duree, Consultant chefProjet) {
        this.Libele = Libele;
        setDuree(Duree); // La duree du projet doit etre superieur ou egal a 0
        setChefProjet(chefProjet);

    }

    public void setChefProjet(Consultant chefProjet) { /*Un projet ne peut être dirigé que par un chef du projet*/
        if (chefProjet.getRole().equals(Role.ChefDuProjet)) {
            this.chefProjet = chefProjet;
        }
    }

    public void setDuree(Integer duree) {
        Duree = (duree > 0) ? duree : 0; // La duree du projet doit etre superieur ou egal a 0
    }

    public boolean addEtape(Etape etape) { /* La somme des durees des phases d'un projet ne peut depasser
                                                la duree d'un projet */

        if (getDureeTotaleDesEtapes() + etape.getDuree() > Duree) {
            return false;
        }
        etapes.add(etape);
        return true;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projet projet = (Projet) o;
        return Objects.equals(Libele, projet.Libele) && Objects.equals(Duree, projet.Duree);
    }

    public Integer getDureeTotaleDesEtapes() {
        Integer dureeTotaleDesEtapes = 0;
        for (Etape val : etapes) {
            dureeTotaleDesEtapes += val.getDuree();
        }
        return dureeTotaleDesEtapes;
    }

    public Double sommeCoutEtapes() {
        Double coutTotaleEtapes = 0D;
        for (Etape val : etapes) {
            coutTotaleEtapes += ((Tache) val).getCout();
        }
        return coutTotaleEtapes;
    }

    public Double getCout() {
        return sommeCoutEtapes() + (Duree - getDureeTotaleDesEtapes()) * chefProjet.getRemunerationHoraire();
    }


}
