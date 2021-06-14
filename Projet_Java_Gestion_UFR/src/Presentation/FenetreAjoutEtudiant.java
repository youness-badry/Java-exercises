package Presentation;

import Metier.Etudiant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreAjoutEtudiant extends JFrame {
    private JLabel labelNumero;
    private TextField textFieldNumero;
    private JLabel labelNom;
    private TextField textFieldNom;
    private JLabel labelPrenom;
    private TextField textFieldPrenom;
    private JLabel labelEmail;
    private TextField textFieldEmail;
    private JLabel labelSexe;
    private TextField textFieldSexe;
    private JButton ajouter;
    private Controleur controleur;

    public FenetreAjoutEtudiant(){
        super("Formulaire Ajout Etudiant");
        labelNumero = new JLabel("Numero de l'etudiant");
        textFieldNumero = new TextField();
        labelNom = new JLabel("Nom de l'etudiant");
        textFieldNom = new TextField();
        labelPrenom = new JLabel("Prenom de l'etudiant");
        textFieldPrenom = new TextField();
        labelEmail = new JLabel("Email de l'etudiant");
        textFieldEmail = new TextField();
        labelSexe = new JLabel("Sexe de l'etudiant");
        textFieldSexe = new TextField();
        ajouter = new JButton("Ajouter");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(470,600));
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(5,2));
        jPanel1.add(labelNumero);
        jPanel1.add(textFieldNumero);
        jPanel1.add(labelNom);
        jPanel1.add(textFieldNom);
        jPanel1.add(labelPrenom);
        jPanel1.add(textFieldPrenom);
        jPanel1.add(labelEmail);
        jPanel1.add(textFieldEmail);
        jPanel1.add(labelSexe);
        jPanel1.add(textFieldSexe);
        this.add(jPanel1,BorderLayout.NORTH);
        JPanel jPanelBouton = new JPanel();
        jPanelBouton.add(ajouter);
        this.add(jPanelBouton,BorderLayout.SOUTH);
    }
    public void action() {
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer numero = Integer.parseInt(textFieldNumero.getText());
                String nom = textFieldNom.getText();
                String prenom = textFieldPrenom.getText();
                String email = textFieldEmail.getText();
                String sexe = textFieldSexe.getText();
                controleur.ajouterEtudiant(new Etudiant(numero,nom,prenom,email,sexe));
            }
        });

    }
}
