package Metier;

import DAO.DAOEtudiant;

import java.util.ArrayList;

public class GestionnaireEtudiant {
    private DAOEtudiant daoEtudiant;

    public GestionnaireEtudiant() {
        daoEtudiant = new DAOEtudiant();
    }

    public ArrayList<Object> getAll(){
        ArrayList<Object> liste =
                daoEtudiant.getAll();
        return liste;
    }
    public ArrayList<Object> getAllOrderByName(){
        ArrayList<Object> liste =
                daoEtudiant.getAllOrderByName();
        return liste;
    }
    public boolean add(Object etudiant) {
        return daoEtudiant.add(etudiant);
    }
    public boolean delete(Object nomEtudiant) {
        return daoEtudiant.delete(nomEtudiant);
    }


}
