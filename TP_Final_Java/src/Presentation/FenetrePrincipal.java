package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetrePrincipal extends JFrame {

    private JButton boutonAfficherListeEtuds;
    private JButton boutonAfficherNotes;
    private JButton boutonAjouterNote;
    private JButton boutonAjouterModule;
    private JButton boutonAfficherListeModules;
    private Controleur controleur;

    public FenetrePrincipal(){
        super("Fenetre Principal");
        boutonAfficherListeEtuds = new JButton("Afficher Liste Etudiants");
        boutonAfficherNotes = new JButton("Afficher Liste Notes");
        boutonAjouterNote = new JButton("Ajouter Note");
        boutonAjouterModule = new JButton("Ajouter Module");
        boutonAfficherListeModules = new JButton("Afficher Liste Modules");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(700,600));
        JPanel jPanel = new JPanel();
        jPanel.add(boutonAfficherListeEtuds);
        jPanel.add(boutonAfficherNotes);
        jPanel.add(boutonAjouterNote);
        jPanel.add(boutonAjouterModule);
        jPanel.add(boutonAfficherListeModules);
        this.add(jPanel);
    }
    public void action() {
        boutonAfficherListeEtuds.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeEtudiants();
            }
        });
        boutonAfficherNotes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeNotes();
            }
        });
        boutonAjouterNote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreAjoutNote();
            }
        });
        boutonAjouterModule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        boutonAfficherListeModules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeModules();
            }
        });

    }
}
