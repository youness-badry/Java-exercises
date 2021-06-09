import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*libele;
            private Double prix;
            private Boolean disponible;*/
        Article a1 = new Article("Stylo",2D,true);
        Article a2 = new Article("Cahier",14D,true);
        Article a3 = new Article("Chemise",100D,false);
        Article a4 = new Article("Pantalon",200D,true);
        Article a5 = new Article("Cartable",350D,false);
        ArrayList<Article> list = new ArrayList<Article>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        JFrame jFrame = new JFrame();
        ModelArticle model = new ModelArticle(list);
        JTable table = new JTable(model);
        table.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(table);
        jFrame.add(sp);
        jFrame.setSize(300,400);
        jFrame.setVisible(true);

    }
}
