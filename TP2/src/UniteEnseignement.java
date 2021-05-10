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
        boolean valide =false;
       switch (module.getNumSemestre()) {
           case sem1:
           case sem2:
           case sem3:
           case sem4:
               valide = note >= 10;
               break;
           case sem5:
           case sem6:
           case sem7:
           case sem8:
           case sem9:
               valide = note >= 12;
               break;

       }
       return valide;
    }



}

