import java.awt.*;

public class Controleur {
    private Formulaire formulaire;
    private AfficheInfos afficheInfos;

    public Controleur() {
        this.formulaire = new Formulaire();
        this.formulaire.setControleur(this);
        this.formulaire.pack();
        this.formulaire.setVisible(true);

    }
//    String nom,String prenom,String email
    public void afficherFenetreInfos(String nom,String prenom,String email) {
        this.afficheInfos = new AfficheInfos(nom,prenom,email);
        this.afficheInfos.setControleur(this);
        this.formulaire.setVisible(false);
        this.afficheInfos.pack();
        this.afficheInfos.setVisible(true);
    }
    public void afficherFenetreFormulaire() {
        this.afficheInfos.setVisible(false);
        this.formulaire.pack();
        this.formulaire.setVisible(true);
    }

}
