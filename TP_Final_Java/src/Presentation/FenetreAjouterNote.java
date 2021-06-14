package Presentation;

import Metier.Etudiant;
import Metier.Note;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreAjouterNote extends JFrame {

    private JLabel labelNom;
    private TextField textFieldNom;
    private JLabel labelPrenom;
    private TextField textFieldPrenom;
    private JLabel labelLibeleModule;
    private TextField textFieldLibeleModule;
    private JLabel labelSemestre;
    private TextField textFieldSemestre;
    private JLabel labelNote;
    private TextField textFieldNote;
    private JButton ajouter;
    private Controleur controleur;

    public FenetreAjouterNote(){
        super("Ajouter Note Etudiant");
        labelNom = new JLabel("Nom etudiant");
        textFieldNom = new TextField();
        labelPrenom = new JLabel("Prenom etudiant");
        textFieldPrenom = new TextField();
        labelLibeleModule = new JLabel("Libele Module");
        textFieldLibeleModule = new TextField();
        labelSemestre = new JLabel("Semestre");
        textFieldSemestre = new TextField();
        labelNote = new JLabel("Note");
        textFieldNote = new TextField();
        ajouter = new JButton("Ajouter");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(520,600));
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(5,2));
        jPanel1.add(labelNom);
        jPanel1.add(textFieldNom);
        jPanel1.add(labelPrenom);
        jPanel1.add(textFieldPrenom);
        jPanel1.add(labelLibeleModule);
        jPanel1.add(textFieldLibeleModule);
        jPanel1.add(labelSemestre);
        jPanel1.add(textFieldSemestre);
        jPanel1.add(labelNote);
        jPanel1.add(textFieldNote);
        this.add(jPanel1,BorderLayout.NORTH);
        JPanel jPanelBouton = new JPanel();
        jPanelBouton.add(ajouter);
        this.add(jPanelBouton,BorderLayout.SOUTH);
    }
    public void action() {
        ajouter.addActionListener(new ActionListener() {
            // nom | prenom | libeleModule | semestre | note
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textFieldNom.getText();
                String prenom = textFieldPrenom.getText();
                String libeleModule = textFieldLibeleModule.getText();
                String semestre = textFieldSemestre.getText();
                Float note = Float.parseFloat(textFieldNote.getText());
                controleur.ajouterNote(new Note(nom,prenom,libeleModule,semestre,note));
            }
        });

    }
}
