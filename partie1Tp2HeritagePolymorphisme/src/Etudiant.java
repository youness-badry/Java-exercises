import java.util.ArrayList;

public class Etudiant extends Personne{

    private Integer numeroEtudiant;
    private ArrayList<Module> modules;

    public Etudiant() {
        super("","");
        this.numeroEtudiant=0;
    }
    public Etudiant(String nom,Integer numeroEtudiant,String email) {
        super(nom,email);
        this.numeroEtudiant = numeroEtudiant;
    }

    public Integer getNumeroEtudiant() {
        return numeroEtudiant;
    }
    public void setNumeroEtudiant(Integer numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public void afficherInfo() {
        System.out.println("Info Etudiant : ");
        System.out.println("nom = "+getNom());
        System.out.println("numero Etudiant = "+numeroEtudiant);
        System.out.println("email = "+getEmail());
        System.out.println("---------------");
    }
    public boolean addModule(Module module) {
        return modules.add(module);
    }




}
