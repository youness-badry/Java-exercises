package Presentation;

import Metier.Etudiant;
import Metier.NoteEtudiantModule;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelNote extends AbstractTableModel {
    private ArrayList<NoteEtudiantModule> noteEtudiantModules;

    public ModelNote(ArrayList<NoteEtudiantModule> noteEtudiantModules) {
        super();
        this.noteEtudiantModules = noteEtudiantModules;
    }
    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return noteEtudiantModules.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        NoteEtudiantModule a = noteEtudiantModules.get(rowIndex);
        switch(columnIndex) {
            case 0 : return a.getNomEtudiant();
            case 1 : return a.getLibelleModule();
            case 2 : return a.getNote();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return "Nom Etudiant";
            case 1 : return "Libelle Module";
            case 2 : return "Note";
            default : return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return String.class;
            case 1 : return String.class;
            case 2 : return Float.class;
            default : return Object.class;
        }
    }
}
