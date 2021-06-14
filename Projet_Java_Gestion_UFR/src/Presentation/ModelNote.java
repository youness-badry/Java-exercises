package Presentation;

import Metier.Note;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelNote extends AbstractTableModel {
    private ArrayList<Note> listeNotes;

    public ModelNote(ArrayList<Note> listeNotes) {
        super();
        this.listeNotes = listeNotes;
    }
    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return listeNotes.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        Note a = listeNotes.get(rowIndex);
        switch(columnIndex) {
            case 0 : return a.getNomEtudiant();
            case 1 : return a.getPrenomEtudiant();
            case 2 : return a.getLibeleModule();
            case 3 : return a.getSemestre();
            case 4 : return a.getNote();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return "Nom";
            case 1 : return "Prenom";
            case 2 : return "Module";
            case 3 : return "Semestre";
            case 4 : return "Note";
            default : return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return String.class;
            case 1 : return String.class;
            case 2 : return String.class;
            case 3 : return String.class;
            case 4 : return Float.class;
            default : return Object.class;
        }
    }
}
