package Presentation;


import Metier.Module;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelModule extends AbstractTableModel {
    private ArrayList<Module> listeModules;

    public ModelModule(ArrayList<Module> listeModules) {
        super();
        this.listeModules = listeModules;
    }
    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return listeModules.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        Module a = listeModules.get(rowIndex);
        switch(columnIndex) {
            case 0 : return a.getIdModule();
            case 1 : return a.getLibeleModule();
            case 2 : return a.getFormation();
            case 3 : return a.getSemestreModule();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return "Id";
            case 1 : return "Module";
            case 2 : return "Formation";
            case 3 : return "Semestre";
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
            default : return Object.class;
        }
    }
}
