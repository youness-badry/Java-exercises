package Metier;

public class Formation {
    private Integer idFormation;
    private String intitule;

    public Formation(Integer idFormation, String intitule) {
        this.idFormation = idFormation;
        this.intitule = intitule;
    }

    public Integer getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(Integer idFormation) {
        this.idFormation = idFormation;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
