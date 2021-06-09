import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AfficheInfos extends JFrame{
    private JLabel titre;
    private JLabel nom;
    private JLabel prenom;
    private JLabel email;
    private JButton modifier;
    private Controleur controleur;

    public AfficheInfos(String Nom,String Prenom,String Email) {
        this.setTitle("Profil");
        titre = new JLabel("Votre profil est le suivant :");
        nom = new JLabel("Nom : "+Nom);
        prenom = new JLabel("Prenom : "+Prenom);
        email = new JLabel("Email : "+Email);
        modifier = new JButton("Modifier");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setPreferredSize(new Dimension(400,200));
        this.setLayout(new BorderLayout());
        JPanel jPanel1 = new JPanel();
        jPanel1.add(titre);
        this.add(jPanel1,BorderLayout.NORTH);
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(3,1));
        jPanel2.add(nom);
        jPanel2.add(prenom);
        jPanel2.add(email);
        this.add(jPanel2,BorderLayout.CENTER);
        JPanel jPanel3 = new JPanel();
        jPanel3.add(modifier);
        this.add(jPanel3,BorderLayout.SOUTH);
    }
    public void action() {
        modifier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreFormulaire();
            }
        });
    }
}




















