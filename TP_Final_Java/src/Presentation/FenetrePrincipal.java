package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetrePrincipal extends JFrame {

    private JButton boutonAfficherListeEtuds;
    private JButton boutonAfficherNotesEtud;
    private JButton boutonAjouterNote;
    private JButton boutonAjouterModule;
    private Controleur controleur;

    public FenetrePrincipal(){
        super("Fenetre Principal");
        boutonAfficherListeEtuds = new JButton("Afficher Liste Etudiants");
        boutonAfficherNotesEtud = new JButton("Afficher Notes Etudiant");
        boutonAjouterNote = new JButton("Ajouter Note");
        boutonAjouterModule = new JButton("Ajouter Module");
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
        jPanel.add(boutonAfficherNotesEtud);
        jPanel.add(boutonAjouterNote);
        jPanel.add(boutonAjouterModule);
        this.add(jPanel);
    }
    public void action() {
        boutonAfficherListeEtuds.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeEtudiants();
            }
        });
        boutonAfficherNotesEtud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        boutonAjouterNote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        boutonAjouterModule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
