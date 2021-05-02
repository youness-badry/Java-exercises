public class UniteEnseignement {
    private Module module;
    private String annee;
    private double note;

    public UniteEnseignement() {
        this(new Module(),"",0);
    }
    public UniteEnseignement(Module module,String annee,double note) {
        this.module = module;
        this.annee = annee;
        this.note = note;

    }

    public Module getModule() {
        return module;
    }

    public String getAnnee() {
        return annee;
    }

    public double getNote() {
        return note;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setNote(double note) {
        this.note = note;
    }
    public boolean isValide() {
        if(annee.equals("1") || annee.equals("2")) {
            return (note >= 10);
        }else {
            return (note >= 12);
        }
    }



}

