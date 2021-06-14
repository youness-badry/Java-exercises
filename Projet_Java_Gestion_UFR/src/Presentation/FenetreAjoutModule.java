package Presentation;

import Metier.Formation;
import Metier.Module;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreAjoutModule extends JFrame {
    private JLabel labelIdModule;
    private TextField textFieldIdModule;
    private JLabel labelLibeleModule;
    private TextField textFieldLibeleModule;
    private JLabel labelFormationModule;
    private TextField textFieldFormationModule;
    private JLabel labelSemestre;
    private TextField textFieldSemestre;
    private JButton ajouter;
    private Controleur controleur;

    public FenetreAjoutModule(){
        super("Ajout Module");
        labelIdModule = new JLabel("Id Module");
        textFieldIdModule = new TextField();
        labelLibeleModule = new JLabel("Libele Module");
        textFieldLibeleModule = new TextField();
        labelFormationModule = new JLabel("Formation");
        textFieldFormationModule = new TextField();
        labelSemestre = new JLabel("Semestre");
        textFieldSemestre = new TextField();
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
        jPanel1.add(labelIdModule);
        jPanel1.add(textFieldIdModule);
        jPanel1.add(labelLibeleModule);
        jPanel1.add(textFieldLibeleModule);
        jPanel1.add(labelFormationModule);
        jPanel1.add(textFieldFormationModule);
        jPanel1.add(labelSemestre);
        jPanel1.add(textFieldSemestre);
        this.add(jPanel1,BorderLayout.NORTH);
        JPanel jPanelBouton = new JPanel();
        jPanelBouton.add(ajouter);
        this.add(jPanelBouton,BorderLayout.SOUTH);
    }
    public void action() {
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer idModule = Integer.parseInt(textFieldIdModule.getText());
                String libeleModule = textFieldLibeleModule.getText();
                String formation = textFieldFormationModule.getText();
                String semestre = textFieldSemestre.getText();
                controleur.ajouterModule(new Module(idModule,libeleModule,formation,semestre));
            }
        });

    }
}
