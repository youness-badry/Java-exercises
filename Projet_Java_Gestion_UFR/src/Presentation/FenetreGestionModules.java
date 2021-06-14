package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreGestionModules extends JFrame {
    private JButton boutonAfficherListeModules;
    private JButton boutonAjouterModule;
    private JButton retournerMenuPrincipal;
    private Controleur controleur;

    public FenetreGestionModules(){
        super("Gestion Modules");
        boutonAfficherListeModules = new JButton("Afficher Liste Modules");
        boutonAjouterModule = new JButton("Ajouter Module");
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
        jPanel.add(boutonAfficherListeModules);
        jPanel.add(boutonAjouterModule);
        jPanel.add(retournerMenuPrincipal);
        this.add(jPanel);
    }
    public void action() {
        boutonAfficherListeModules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeModules();
            }
        });
        boutonAjouterModule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreAjoutModule();
            }
        });
        retournerMenuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.setVisibleFenetreGestionModules(false);
            }
        });


    }
}
