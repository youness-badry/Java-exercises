package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreListeFormations extends JFrame {
    private ModelFormation modelFormation;
    private JTable jTable;
    private JButton retourner;
    private Controleur controleur;

    public FenetreListeFormations(ModelFormation modelFormation){
        super("Liste des formations");
        this.modelFormation = modelFormation;
        jTable = new JTable(this.modelFormation);
        retourner= new JButton("Retourner");
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
        jPanelBoutons.add(retourner);
        this.add(jPanelBoutons,BorderLayout.SOUTH);

    }
    public void action() {
        retourner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.setVisibleListeFormations(false);
            }
        });

    }
}
