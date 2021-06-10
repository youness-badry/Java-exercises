package Presentation;

import Presentation.Controleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreOptionTri extends JFrame {
    private JButton trierParNom;
    private Controleur controleur;

    public FenetreOptionTri(){
        super("Options de tri");
        trierParNom = new JButton("Trier par Nom");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(200,200));
        JPanel jPanelBouton = new JPanel();
        jPanelBouton.add(trierParNom);
        this.add(jPanelBouton);
    }
    public void action() {
        trierParNom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeEtudiantsTriee();
            }
        });

    }
}
