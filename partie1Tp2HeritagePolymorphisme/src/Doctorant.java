public class Doctorant extends Etudiant implements Enseignant{

    private String sujetThese;
    private Professeur[] encadrant = new Professeur[2];
    private Module[] cours = new Module[2];

    public Doctorant(String nom,Integer numeroEtudiant,String email,String sujetThese,Professeur[] encadrant,Module[] cours) {
        super(nom,numeroEtudiant,email);
        this.sujetThese =sujetThese;
        this.encadrant = encadrant;
        this.cours = cours;
    }
    public Doctorant() {
        super();
        this.sujetThese = "";
    }
    public String getSujetThese() {
        return sujetThese;
    }
    public Professeur[] getEncadrant() {
        return encadrant;
    }
    public Module[] getCours() {
        return cours;
    }

    public void setSujetThese(String sujetThese) {
        this.sujetThese = sujetThese;
    }

    public void setEncadrant(Professeur[] encadrant) {
        this.encadrant = encadrant;
    }

    public void setCours(Module[] cours) {
        this.cours = cours;
    }
    public double getChargeHoraire() {
        double chargeHoraire=0;
        for(Module item : cours) {
            chargeHoraire += item.getChargeHoraireModule();
        }
        return chargeHoraire;
    }


    public double getVacations() {
        double vacation;
        if(getChargeHoraire() <=32) {
            vacation= (400*getChargeHoraire())*(1-0.34);
        }
        else{
            double heuresSup = getChargeHoraire() - 32;
            vacation= (400*getChargeHoraire())*(1-0.34)+(600*heuresSup)*(1-0.17);
        }
        return vacation;
    }
    public void afficherInfo() {
        System.out.println("Info Doctorant : ");
        super.afficherInfo();
    }



}
