package Presentation;

import Metier.Etudiant;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelEtudiant extends AbstractTableModel {
    private ArrayList<Etudiant> etudiants;

    public ModelEtudiant(ArrayList<Etudiant> etudiants) {
        super();
        this.etudiants = etudiants;
    }
    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return etudiants.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        Etudiant a = etudiants.get(rowIndex);
        switch(columnIndex) {
            case 0 : return a.getNumero();
            case 1 : return a.getNom();
            case 2 : return a.getPrenom();
            case 3 : return a.getEmail();
            case 4 : return a.getSexe();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return "Numero";
            case 1 : return "Nom";
            case 2 : return "Prenom";
            case 3 : return "Email";
            case 4 : return "Sexe";
            default : return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return Integer.class;
            case 1 : return String.class;
            case 2 : return String.class;
            case 3 : return String.class;
            case 4 : return String.class;
            default : return Object.class;
        }
    }
}
