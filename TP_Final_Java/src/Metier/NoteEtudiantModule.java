package Metier;

public class NoteEtudiantModule {
    private String nomEtudiant;
    private String libelleModule;
    private Float note;

    public NoteEtudiantModule(String nomEtudiant, String libelleModule, Float note) {
        this.nomEtudiant = nomEtudiant;
        this.libelleModule = libelleModule;
        this.note = note;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getLibelleModule() {
        return libelleModule;
    }

    public void setLibelleModule(String libelleModule) {
        this.libelleModule = libelleModule;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }
}
