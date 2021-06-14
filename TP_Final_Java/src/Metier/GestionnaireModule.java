package Metier;

import DAO.DAOEtudiant;
import DAO.DAOModule;

import java.util.ArrayList;

public class GestionnaireModule {
    private DAOModule daoModule;

    public GestionnaireModule() {
        daoModule = new DAOModule();
    }

    public ArrayList<Object> getAll(){
        ArrayList<Object> liste =
                daoModule.getAll();
        return liste;
    }
    public boolean add(Object module) {
        return daoModule.add(module);
    }
    public boolean delete(Object libeleModule) {
        return daoModule.delete(libeleModule);
    }
}
