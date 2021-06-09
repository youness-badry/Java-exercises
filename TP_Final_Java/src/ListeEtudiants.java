import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListeEtudiants extends JFrame {
    private ModelEtudiant modelEtudiant;
    private JTable jTable;
    private JButton trier;
    private JButton supprimer;
    private Controleur controleur;

    public ListeEtudiants(ModelEtudiant modelEtudiant){
        super("Liste des etudiants");
        this.modelEtudiant = modelEtudiant;
        jTable = new JTable(this.modelEtudiant);
        trier = new JButton("Trier");
        supprimer = new JButton("Supprimer");
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
        this.add(jPanelBoutons,BorderLayout.SOUTH);

    }
    public void action() {
        trier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreOptionTri();
            }
        });
        supprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controleur.afficherFenetreSupprim();
            }
        });
    }
}
