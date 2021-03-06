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
    public void afficherInfo() {
        System.out.println("Info Semestre : ");
        System.out.println("numero = " + numero);
        System.out.println("les modules de semestre = ");
        for(int i=0;i<modules.length;i++) {
            System.out.println("Module "+i);
            modules[i].afficherInfo();
        }
    }
    public double getChargeHoraireSemestre() {

        double chargeHoraireSemestre=0;
        for(Module item : modules) {
            chargeHoraireSemestre+=item.getChargeHoraireModule();
        }
        return chargeHoraireSemestre;
    }
    public boolean searchModule(Module module) {
        String libelle = module.getLibelle();
        for(Module item : modules) {
            if(item.getLibelle().equals(libelle)) {
                return true;
            }
        }
        return false;
    }

}










