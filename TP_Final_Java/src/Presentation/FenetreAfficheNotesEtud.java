package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreAfficheNotesEtud extends JFrame {
    private ModelNote modelNote;
    private JTable jTable;
    private JButton retournerMenuPrincipal;
    private Controleur controleur;

    public FenetreAfficheNotesEtud(ModelNote modelNote){
        super("Notes de l'etudiant");
        this.modelNote = modelNote;
        jTable = new JTable(this.modelNote);
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
        jPanelBoutons.add(retournerMenuPrincipal);
        this.add(jPanelBoutons,BorderLayout.SOUTH);

    }
    public void action() {

        retournerMenuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.setVisibleListeEtudiants(false);
            }
        });

    }
}
