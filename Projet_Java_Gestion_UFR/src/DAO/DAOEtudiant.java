package DAO;

import Metier.Etudiant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOEtudiant implements InterfaceDAOTable {
    Connection connection;

    public DAOEtudiant() {
        this.connection = ConnexionBD.getConnexion();
    }

    @Override
    public boolean add(Object object) {

        try {
            Integer numero = ((Etudiant) object).getNumero();
            String nom = '"' + ((Etudiant) object).getNom() + '"';
            String prenom = '"' + ((Etudiant) object).getPrenom() + '"';
            String email = '"' + ((Etudiant) object).getEmail() + '"';
            String sexe = '"' + ((Etudiant) object).getSexe() + '"';
            String queryInsert = "insert into etudiant values(" + Integer.toString(numero) + "," + nom + "," + prenom + "," + email + "," + sexe + ");";
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
    public boolean delete(Object object) {
        try {
            String nom = '"' + ((String) object) + '"';
            String queryUpdate = "delete from etudiant where nom=" + nom + ";";
            int n = this.connection.
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
        ArrayList<Object> listeEtudiants = new ArrayList<>();
        ResultSet resultat = null;
        try {
            resultat = this.connection.
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
            while (resultat.next()) {
                numero = resultat.getInt("numero");
                nom = resultat.getString("nom");
                prenom = resultat.getString("prenom");
                email = resultat.getString("email");
                sexe = resultat.getString("sexe");
                listeEtudiants.add(new Etudiant(numero, nom, prenom, email, sexe));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeEtudiants;
    }

    @Override
    public ArrayList<Object> getAll(Object critere) {
        return null;
    }

    public ArrayList<Object> getAllOrderByName() {
        ArrayList<Object> listeEtudiants = new ArrayList<>();
        ResultSet resultat = null;
        try {
            resultat = this.connection.
                    createStatement().
                    executeQuery("select * from etudiant order by nom asc");
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
            while (resultat.next()) {
                numero = resultat.getInt("numero");
                nom = resultat.getString("nom");
                prenom = resultat.getString("prenom");
                email = resultat.getString("email");
                sexe = resultat.getString("sexe");
                listeEtudiants.add(new Etudiant(numero, nom, prenom, email, sexe));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listeEtudiants;
    }

    @Override
    public Boolean update(Object object) {
        return null;
    }
}
