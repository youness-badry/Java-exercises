public class Semestre {

    private int numero;
    private Module[] modules = new Module[6];

    public Semestre(int numero) {
        this.numero = numero;
    }
    public Semestre() {
        this.numero = 0;
    }
    public int getNumero() {
        return numero;
    }
    public Module getModules(int i) {
        return modules[i];
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setModules(Module module, int i) {
        this.modules[i] = module;
    }
    public void afficheInfoSemestre() {
        System.out.println("Info Semestre : ");
        System.out.println("numero = " + numero);
        System.out.println("les modules de semestre = ");
        for(int i=0;i<modules.length;i++) {
            System.out.println("Module "+i);
            modules[i].afficheInfoModule();
        }
    }
    public double getChargeHoraireSemestre() {

        double chargeHoraireSemestre=0;
        for(int i=0;i<modules.length;i++) {
            chargeHoraireSemestre+=modules[i].getChargeHoraireModule();
        }
        return chargeHoraireSemestre;
    }
}










