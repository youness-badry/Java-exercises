import java.util.ArrayList;

public class Consultant {
    private String Nom;
    private Integer remunerationHoraire;
    private String email;
    private ArrayList<Tache> taches;
    private Role role;

    public Consultant(String nom, Integer remunerationHoraire, String email, Role role) {
        Nom = nom;
        this.remunerationHoraire = remunerationHoraire;
        this.email = email;
        this.role = role;
        taches = new ArrayList<Tache>();
    }

    public Integer getRemunerationHoraire() {
        return remunerationHoraire;
    }

    public Role getRole() {
        return role;
    }
}
