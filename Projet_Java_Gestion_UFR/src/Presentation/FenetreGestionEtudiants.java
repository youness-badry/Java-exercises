package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreGestionEtudiants extends JFrame {
    private JButton boutonAfficherListeEtudiants;
    private JButton boutonAfficherListeEtudiantsParOrdre;
    private JButton boutonAfficherListesNotes;
    private JButton boutonAjouterEtudiant;
    private JButton boutonSupprimerEtudiant;
    private JButton boutonAjouterNote;
    private JButton retournerMenuPrincipal;
    private Controleur controleur;

    public FenetreGestionEtudiants(){
        super("Gestion Etudiants");
        boutonAfficherListeEtudiants = new JButton("Afficher Liste Etudiants");
        boutonAfficherListeEtudiantsParOrdre = new JButton("Afficher Liste Etudiants Par Ordre");
        boutonAfficherListesNotes = new JButton("Afficher Liste Notes");
        boutonAjouterEtudiant = new JButton("Ajouter Etudiant");
        boutonSupprimerEtudiant = new JButton("Supprimer Etudiant");
        boutonAjouterNote = new JButton("Ajouter Note");
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
        jPanel.add(boutonAfficherListeEtudiants);
        jPanel.add(boutonAfficherListeEtudiantsParOrdre);
        jPanel.add(boutonAfficherListesNotes);
        jPanel.add(boutonAjouterEtudiant);
        jPanel.add(boutonSupprimerEtudiant);
        jPanel.add(boutonAjouterNote);
        jPanel.add(retournerMenuPrincipal);
        this.add(jPanel);
    }
    public void action() {
        boutonAfficherListeEtudiants.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeEtudiants();
            }
        });
        boutonAfficherListeEtudiantsParOrdre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeEtudiantsParOrdre();
            }
        });
        boutonAfficherListesNotes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherListeNotes();
            }
        });
        boutonAjouterEtudiant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreAjoutEtudiant();
            }
        });
        boutonSupprimerEtudiant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreSupprimEtudiant();
            }
        });
        boutonAjouterNote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreAjoutNote();
            }
        });
        retournerMenuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.setVisibleFenetreGestionEtudiants(false);
            }
        });


    }
}
