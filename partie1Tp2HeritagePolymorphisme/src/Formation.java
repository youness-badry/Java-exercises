public class Formation {

    private String intitule;
    private Professeur professeurResponsable;
    private Semestre[] semestres = new Semestre[9];

    public Formation(String intitule,Professeur professeurResponsable) {
        this.intitule = intitule;
        this.professeurResponsable = professeurResponsable;
    }
    public Formation() {
        this.intitule = "";
        this.professeurResponsable = new Professeur();
    }
    public String getIntitule() {
        return intitule;
    }
    public Professeur getProfesseurResponsable() {
        return professeurResponsable;
    }
    public Semestre getSemestre(int i) {
        return semestres[i];
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public void setProfesseurResponsable(Professeur professeurResponsable) {
        this.professeurResponsable = professeurResponsable;
    }
    public void setSemestres(Semestre semestre,int i) {
        this.semestres[i] = semestre;
    }

    public void afficheInfoFormation() {

        System.out.println("Info Formation : ");
        System.out.println("intitule = " + intitule);
        System.out.println("professeur responsable = ");
        professeurResponsable.afficheInfoProfesseur();
        System.out.println("les semestres de la formation = ");
        for(int i=0;i<semestres.length;i++) {
            System.out.println("Semestre "+i);
            semestres[i].afficheInfoSemestre();
        }

    }

    public double getChargeHoraireFormation() {
        double chargeHoraireFormation=0;
        for(int i=0;i<semestres.length;i++) {
            chargeHoraireFormation+=semestres[i].getChargeHoraireSemestre();
        }
        return chargeHoraireFormation;
    }
}
















