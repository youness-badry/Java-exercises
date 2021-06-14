package DAO;


import Metier.Module;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOModule implements InterfaceDAOTable{
    Connection connection;

    public DAOModule() {
        this.connection = ConnexionBD.getConnexion();
    }

    @Override
    public boolean add(Object object) {
        try {
            Integer idModule = ((Module) object).getIdModule();
            String libele = '"'+((Module) object).getLibeleModule()+'"';
            String formation = '"'+((Module) object).getFormation()+'"';
            String semestre = '"'+((Module) object).getSemestreModule()+'"';
            String queryInsert = "insert into module values("+Integer.toString(idModule)+","+libele+","+formation+","+semestre+");";
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
        try {
            String libele = '"'+((String) object)+'"';
            String queryUpdate = "delete from module where libele="+libele+";";
            int n =  this.connection.
                    createStatement().
                    executeUpdate(queryUpdate);
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
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
        ArrayList<Object> listeModules = new ArrayList<> ();
        ResultSet resultat = null;
        try {
            resultat =  this.connection.
                    createStatement().
                    executeQuery("select * from module");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            Integer idModule;
            String libele;
            String formation;
            String semestre;
            while(resultat.next()){
                idModule = resultat.getInt("idModule");
                libele = resultat.getString("libele");
                formation = resultat.getString("formation");
                semestre = resultat.getString("semestre");
                listeModules.add(new Module(idModule,libele,formation,semestre));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeModules;
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
