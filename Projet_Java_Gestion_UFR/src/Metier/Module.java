package Metier;

public class Module {
    private Integer idModule;
    private String libeleModule;
    private String formation;
    private String semestreModule;

    public Module(Integer idModule, String libeleModule, String formation, String semestreModule) {
        this.idModule = idModule;
        this.libeleModule = libeleModule;
        this.formation = formation;
        this.semestreModule = semestreModule;
    }

    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
    }

    public String getLibeleModule() {
        return libeleModule;
    }

    public void setLibeleModule(String libeleModule) {
        this.libeleModule = libeleModule;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getSemestreModule() {
        return semestreModule;
    }

    public void setSemestreModule(String semestreModule) {
        this.semestreModule = semestreModule;
    }
}
