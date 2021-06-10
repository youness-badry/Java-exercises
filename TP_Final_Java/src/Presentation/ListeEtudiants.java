package Presentation;

import Presentation.Controleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListeEtudiants extends JFrame {
    private ModelEtudiant modelEtudiant;
    private JTable jTable;
    private JButton trier;
    private JButton supprimer;
    private JButton ajouter;
    private JButton retournerMenuPrincipal;
    private Controleur controleur;

    public ListeEtudiants(ModelEtudiant modelEtudiant){
        super("Liste des etudiants");
        this.modelEtudiant = modelEtudiant;
        jTable = new JTable(this.modelEtudiant);
        trier = new JButton("Trier");
        supprimer = new JButton("Supprimer");
        ajouter = new JButton("Ajouter etudiant");
        retournerMenuPrincipal= new JButton("Retourner Menu Principal");
        this.dessiner();
        this.action();
    }

    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }

    public void dessiner() {
        this.setSize(new Dimension(700,600));
        this.setLayout(new BorderLayout());
        jTable.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(jTable);
        this.add(sp,BorderLayout.NORTH);
        JPanel jPanelBoutons = new JPanel();
        jPanelBoutons.add(trier);
        jPanelBoutons.add(supprimer);
        jPanelBoutons.add(ajouter);
        jPanelBoutons.add(retournerMenuPrincipal);
        this.add(jPanelBoutons,BorderLayout.SOUTH);

    }
    public void action() {
        trier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreOptionTri();
            }
        });
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFormulaireAjoutEtudiant();
            }
        });
        supprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreSupprim();
            }
        });
        retournerMenuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.setVisibleListeEtudiants(false);
            }
        });

    }
}
