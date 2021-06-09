import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulaire extends JFrame{
    private JLabel labelNom;
    private JLabel labelPrenom;
    private JLabel labelEmail;
    private JTextField textFieldNom;
    private JTextField textFieldPrenom;
    private JTextField textFieldEmail;
    private JButton valider;
    private Controleur controleur;

    public Formulaire() {
        this.setTitle("Formulaire");
        this.labelNom = new JLabel("Nom");
        this.labelPrenom = new JLabel("Prenom");
        this.labelEmail = new JLabel("Email");
        this.textFieldNom = new JTextField();
        this.textFieldPrenom = new JTextField();
        this.textFieldEmail = new JTextField();
        this.valider = new JButton("Valider");
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
        jPanel1.setLayout(new GridLayout(3,2));
        jPanel1.add(labelNom);
        jPanel1.add(textFieldNom);
        jPanel1.add(labelPrenom);
        jPanel1.add(textFieldPrenom);
        jPanel1.add(labelEmail);
        jPanel1.add(textFieldEmail);
        this.add(jPanel1,BorderLayout.NORTH);
        JPanel jPanel2 = new JPanel();
        jPanel2.add(valider);
        this.add(jPanel2,BorderLayout.SOUTH);

    }
    public void action() {
        valider.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreInfos(textFieldNom.getText(),textFieldPrenom.getText(),textFieldEmail.getText());
            }
        });
    }
}

















