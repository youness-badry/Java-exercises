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
    @Override
    public String toString() {
        return "Semestre [ numero = "+numero+" ]";
    }
    public void afficher() {
        System.out.println(this.toString());
        System.out.println("les modules de semestre = ");
        for(int i=0;i<modules.length;i++) {
            System.out.println("Module "+i);
            modules[i].afficher();
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
        String libelle = module.getLibellé();
        for(Module item : modules) {
            if(item.getLibellé().equals(libelle)) {
                return true;
            }
        }
        return false;
    }

}










