package Metier;

public class Note {
    private Integer idNote;
    private Integer idModuleNote;
    private Integer idEtudiantNote;
    private Float note;

    public Note(Integer idNote, Integer idModuleNote, Integer idEtudiantNote, Float note) {
        this.idNote = idNote;
        this.idModuleNote = idModuleNote;
        this.idEtudiantNote = idEtudiantNote;
        this.note = note;
    }
}
