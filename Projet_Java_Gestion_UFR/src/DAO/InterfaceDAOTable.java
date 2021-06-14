package DAO;

import java.util.ArrayList;

public interface InterfaceDAOTable {
    public boolean add(Object object);

    public boolean delete(Object object);

    public boolean isExiste(Object object);

    public Object searchById(Object object);

    public ArrayList<Object> getAll();

    public ArrayList<Object> getAll(Object critere);

    public Boolean update(Object object);
}
