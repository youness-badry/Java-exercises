package DAO;

import java.util.ArrayList;

public class DAOModule implements InterfaceDAOTable{
    @Override
    public boolean add(Object object) {
        return false;
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
