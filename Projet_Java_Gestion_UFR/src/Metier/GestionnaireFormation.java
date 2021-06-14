package Metier;

import DAO.DAOFormation;

import java.util.ArrayList;

public class GestionnaireFormation {
    private DAOFormation daoFormation;

    public GestionnaireFormation() {
        daoFormation = new DAOFormation();
    }

    public ArrayList<Object> getAll() {
        ArrayList<Object> liste =
                daoFormation.getAll();
        return liste;
    }

    public boolean add(Object formation) {
        return daoFormation.add(formation);
    }

}
