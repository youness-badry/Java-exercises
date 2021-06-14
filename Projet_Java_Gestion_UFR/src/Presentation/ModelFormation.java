package Presentation;

import Metier.Formation;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelFormation extends AbstractTableModel {
    private ArrayList<Formation> listeFormations;

    public ModelFormation(ArrayList<Formation> listeFormations) {
        super();
        this.listeFormations = listeFormations;
    }
    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return listeFormations.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        Formation a = listeFormations.get(rowIndex);
        switch(columnIndex) {
            case 0 : return a.getIdFormation();
            case 1 : return a.getIntitule();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return "Id";
            case 1 : return "Formation";
            default : return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return Integer.class;
            case 1 : return String.class;
            default : return Object.class;
        }
    }
}
