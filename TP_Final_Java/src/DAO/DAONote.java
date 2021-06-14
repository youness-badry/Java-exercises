package DAO;

import Metier.Etudiant;
import Metier.Note;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAONote implements InterfaceDAOTable{
    Connection connection;

    public DAONote() {
        this.connection = ConnexionBD.getConnexion();
    }

    @Override
    public boolean add(Object object) {
        try {
            // nom | prenom | libeleModule | semestre | note
            String nom = '"'+((Note) object).getNomEtudiant()+'"';
            String prenom = '"'+((Note) object).getPrenomEtudiant()+'"';
            String libeleModule = '"'+((Note) object).getLibeleModule()+'"';
            String semestre = '"'+((Note) object).getSemestre()+'"';
            Float note = ((Note) object).getNote();

            String queryInsert = "insert into note values("+nom+","+prenom+","+libeleModule+","+semestre+","+Float.toString(note)+");";
            int n =  this.connection.
                    createStatement().
                    executeUpdate(queryInsert);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }

    @Override
    public boolean isExiste(Object object) {
        return false;
    }

    @Override
    public Object searchById(Object object) {
        return null;
    }

    @Override
    public ArrayList<Object> getAll() {
        ArrayList<Object> listeNotes = new ArrayList<> ();
        ResultSet resultat = null;
        try {
            resultat =  this.connection.
                    createStatement().
                    executeQuery("select * from note");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            String nom;
            String prenom;
            String libeleModule;
            String semestre;
            Float note;
            while(resultat.next()){
                nom = resultat.getString("nom");
                prenom = resultat.getString("prenom");
                libeleModule = resultat.getString("libeleModule");
                semestre = resultat.getString("semestre");
                note = resultat.getFloat("note");
                listeNotes.add(new Note(nom,prenom,libeleModule,semestre,note));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeNotes;
    }

    @Override
    public ArrayList<Object> getAll(Object critere) {
        return null;
    }

    @Override
    public Boolean update(Object object) {
        return null;
    }
}
