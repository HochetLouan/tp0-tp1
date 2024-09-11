package org.example;

import java.util.List;

public class NotesManager {
    private List<Note> notes;
    private CSVNotesSaver saver;

    public NotesManager(List<Note> notes, CSVNotesSaver saver) {
        this.notes = notes;
        this.saver = saver;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
    public void addNote(Note n){

    }
    public Note getNote(int index){
        return this.notes.get(index);
    }
}
