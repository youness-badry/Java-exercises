package Metier;

import DAO.DAONote;

import java.util.ArrayList;

public class GestionnaireNote {
    private DAONote daoNote;

    public GestionnaireNote() {
        daoNote = new DAONote();
    }

    public ArrayList<Object> getAll() {
        ArrayList<Object> liste =
                daoNote.getAll();
        return liste;
    }

    public boolean add(Object note) {
        return daoNote.add(note);
    }
}
