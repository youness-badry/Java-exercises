import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelArticle extends AbstractTableModel {
    private ArrayList<Article> mesArticles;

    public ModelArticle(ArrayList<Article> mesArticles) {
        super();
        this.mesArticles = mesArticles;
    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return mesArticles.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        Article a = mesArticles.
                get(rowIndex);
        switch(columnIndex) {
            case 0 : return a.getLibele();
            case 1 : return a.getPrix();
            case 2 : return a.getDisponible();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return "Libele";
            case 1 : return "Prix";
            case 2 : return "Disponibilité";
            default : return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return String.class;
            case 1 : return Double.class;
            case 2 : return Boolean.class;
            default : return Object.class;
        }
    }
}
