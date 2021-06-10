package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreNomEtudPourAfficherNotes extends JFrame {
    private TextField textField;
    private JLabel jLabel;
    private JButton afficherNotes;
    private Controleur controleur;

    public FenetreNomEtudPourAfficherNotes(){
        super("Choix nom etudiant");
        jLabel = new JLabel("Entrez le nom de l'etudiant pour afficher ses notes");
        textField = new TextField();
        afficherNotes = new JButton("Afficher");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(470,300));
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(1,2));
        jPanel1.add(jLabel);
        jPanel1.add(textField);
        this.add(jPanel1,BorderLayout.NORTH);
        JPanel jPanelBouton = new JPanel();
        jPanelBouton.add(afficherNotes);
        this.add(jPanelBouton,BorderLayout.SOUTH);
    }
    public void action() {
        afficherNotes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textField.getText();
                controleur.supprimerEtudiantByNom(nom);
            }
        });

    }
}
