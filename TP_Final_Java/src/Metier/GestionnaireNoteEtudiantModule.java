package Metier;

import DAO.DAONoteEtudiantModule;

import java.util.ArrayList;

public class GestionnaireNoteEtudiantModule {
    private DAONoteEtudiantModule daoNoteEtudiantModule;

    public GestionnaireNoteEtudiantModule() {
        this.daoNoteEtudiantModule = new DAONoteEtudiantModule();
    }
    public ArrayList<Object> getAll(String nomEtudiant){
        ArrayList<Object> liste =
                daoNoteEtudiantModule.getAll(nomEtudiant);
        return liste;
    }
}
