package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreGestionFormations extends JFrame {
    private JButton boutonAfficherListeFormations;
    private JButton boutonAjouterFormation;
    private JButton retournerMenuPrincipal;
    private Controleur controleur;

    public FenetreGestionFormations(){
        super("Gestion Formations");
        boutonAfficherListeFormations = new JButton("Afficher Liste Formations");
        boutonAjouterFormation = new JButton("Ajouter Formation");
        retournerMenuPrincipal = new JButton("Retourner Menu Principal");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(700,600));
        JPanel jPanel = new JPanel();
        jPanel.add(boutonAfficherListeFormations);
        jPanel.add(boutonAjouterFormation);
        jPanel.add(retournerMenuPrincipal);
        this.add(jPanel);
    }
    public void action() {
        boutonAfficherListeFormations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeFormations();
            }
        });
        boutonAjouterFormation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreAjoutFormation();
            }
        });
        retournerMenuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.setVisibleFenetreGestionFormations(false);
            }
        });


    }
}
