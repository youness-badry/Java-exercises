package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetrePrincipalApplication extends JFrame {
    private JButton boutonGestionFormations;
    private JButton boutonGestionModules;
    private JButton boutonGestionEtudiants;
    private JButton boutonGestionPersonnel;
    private Controleur controleur;

    public FenetrePrincipalApplication(){
        super("Fenetre Principal Application");
        boutonGestionFormations = new JButton("GESTION FORMATIONS");
        boutonGestionModules = new JButton("GESTION MODULES");
        boutonGestionEtudiants = new JButton("GESTION ETUDIANTS");
        boutonGestionPersonnel = new JButton("GESTION PERSONNEL");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(700,600));
        JPanel jPanel = new JPanel();
        jPanel.add(boutonGestionFormations);
        jPanel.add(boutonGestionModules);
        jPanel.add(boutonGestionEtudiants);
        jPanel.add(boutonGestionPersonnel);
        this.add(jPanel);
    }
    public void action() {
        boutonGestionFormations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreGestionFormations();
            }
        });
        boutonGestionModules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreGestionModules();
            }
        });
        boutonGestionEtudiants.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreGestionEtudiants();
            }
        });
        boutonGestionPersonnel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }

}
