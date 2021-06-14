package Presentation;

import Metier.Etudiant;
import Metier.Formation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreAjoutFormation extends JFrame {
    private JLabel labelIdFormation;
    private TextField textFieldIdFormation;
    private JLabel labelIntitule;
    private TextField textFieldIntitule;
    private JButton ajouter;
    private Controleur controleur;

    public FenetreAjoutFormation(){
        super("Ajout Formation");
        labelIdFormation = new JLabel("Id Formation");
        textFieldIdFormation = new TextField();
        labelIntitule = new JLabel("Intitule Formation");
        textFieldIntitule = new TextField();
        ajouter = new JButton("Ajouter");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(350,300));
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(2,2));
        jPanel1.add(labelIdFormation);
        jPanel1.add(textFieldIdFormation);
        jPanel1.add(labelIntitule);
        jPanel1.add(textFieldIntitule);
        this.add(jPanel1,BorderLayout.NORTH);
        JPanel jPanelBouton = new JPanel();
        jPanelBouton.add(ajouter);
        this.add(jPanelBouton,BorderLayout.SOUTH);
    }
    public void action() {
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer idFormation = Integer.parseInt(textFieldIdFormation.getText());
                String intitule = textFieldIntitule.getText();
                controleur.ajouterFormation(new Formation(idFormation,intitule));
            }
        });

    }
}
