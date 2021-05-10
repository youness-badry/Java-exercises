public class ExceptionHeure extends Exception{
    private int heure;
    public ExceptionHeure() {
        super();
    }
    public ExceptionHeure(int heure) {
        this.heure = heure;
    }
    public void alert() {
        if(heure > 80) {
            System.out.println("Depassement Taux horaire reglementaire");
        }else if(heure < 10) {
            System.out.println("Heures de travail insuffisante");
        }
    }
}
