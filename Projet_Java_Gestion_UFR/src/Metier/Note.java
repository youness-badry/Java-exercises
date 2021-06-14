package Metier;

public class Note {
    private String nomEtudiant;
    private String prenomEtudiant;
    private String libeleModule;
    private String semestre;
    private Float note;

    public Note(String nomEtudiant, String prenomEtudiant, String libeleModule, String semestre, Float note) {
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.libeleModule = libeleModule;
        this.semestre = semestre;
        this.note = note;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public String getLibeleModule() {
        return libeleModule;
    }

    public void setLibeleModule(String libeleModule) {
        this.libeleModule = libeleModule;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }
}
