package DAO;

import Metier.Etudiant;
import Metier.Formation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOFormation implements InterfaceDAOTable {
    Connection connection;

    public DAOFormation() {
        this.connection = ConnexionBD.getConnexion();
    }

    @Override
    public boolean add(Object object) {
        try {
//            idFormation | intitule
            Integer idFormation = ((Formation) object).getIdFormation();
            String intitule = '"' + ((Formation) object).getIntitule() + '"';

            String queryInsert = "insert into formation values(" + Integer.toString(idFormation) + "," + intitule + ");";
            int n = this.connection.
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
    public ArrayList<Object> getAll() {
        ArrayList<Object> listeFormations = new ArrayList<>();
        ResultSet resultat = null;
        try {
            resultat = this.connection.
                    createStatement().
                    executeQuery("select * from formation");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            Integer idFormation;
            String intitule;

            while (resultat.next()) {
                idFormation = resultat.getInt("idFormation");
                intitule = resultat.getString("intitule");
                listeFormations.add(new Formation(idFormation, intitule));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeFormations;
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
    public ArrayList<Object> getAll(Object critere) {
        return null;
    }

    @Override
    public Boolean update(Object object) {
        return null;
    }
}
