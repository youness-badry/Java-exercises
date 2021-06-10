package DAO;

import Metier.Etudiant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAONoteEtudiantModule implements InterfaceDAOTable{
    Connection connection;

    public DAONoteEtudiantModule() {
        this.connection = ConnexionBD.getConnexion();
    }
    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public ArrayList<Object> getAll() {
        return null;
    }

    @Override
    public ArrayList<Object> getAll(Object critere) {
        String nomEtudiant = '"'+(String) critere+'"';
        Integer idEtudiant;
        ArrayList<Object> listeNotesEtudiant = new ArrayList<> ();
        ResultSet resultat1 = null;
        ResultSet resultat2 = null;

        try {
            resultat1 =  this.connection.
                    createStatement().
                    executeQuery("select idEtudiant from etudiant where nom="+nomEtudiant+";");
            idEtudiant=resultat1.getInt("idEtudiant");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String query ="SELECT note.note as note, module.libeleModule as libeleModule" +
                "FROM (note WHERE idEtudiant="+Integer.toString(idEtudiant)+" INNER JOIN note ON etudiant.idEtudiant=note.idEtudiantNote)"+
                "INNER JOIN module ON note.idModuleNote=module.idModule);";
        try {
            resultat2 =  this.connection.
                    createStatement().
                    executeQuery("select * from etudiant");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            Integer numero;
            String nom;
            String prenom;
            String email;
            String sexe;
            while(resultat2.next()){
                numero = resultat2.getInt("idEtudiant");
                nom = resultat2.getString("nom");
                prenom = resultat2.getString("prenom");
                email = resultat2.getString("email");
                sexe = resultat2.getString("sexe");
                listeEtudiants.add(new Etudiant(numero,nom,prenom,email,sexe));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeEtudiants;
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
    public Boolean update(Object object) {
        return null;
    }
}
