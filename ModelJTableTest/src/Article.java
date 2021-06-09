public class Article {
    private String libele;
    private Double prix;
    private Boolean disponible;

    public Article() {
        super();
    }
    public Article(String libele, Double prix, Boolean disponible) {
        super();
        this.libele = libele;
        this.prix = prix;
        this.disponible = disponible;
    }
    public String getLibele() {
        return libele;
    }
    public void setLibele(String libele) {
        this.libele = libele;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public Boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

}
