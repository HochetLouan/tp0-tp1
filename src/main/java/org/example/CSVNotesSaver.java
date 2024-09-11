package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CSVNotesSaver {
    private String chemin = "F:\\DA4\\Notes\\Notes1.CSV";

    public void addNote(Note note) {
        String csv = note.getTitre() + ":" + note.getContenu() + ":" + note.getDate();
        try (FileWriter fw = new FileWriter(chemin, true)) {
            fw.write(csv + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Note> getNote() {
        List<Note> notes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
            String uneNote;
            while ((uneNote = br.readLine()) != null) {
                String[] attributs = uneNote.split(":");
                Note note = new Note(attributs[0], attributs[1], LocalDate.parse(attributs[2], DateTimeFormatter.ISO_LOCAL_DATE_TIME));
                notes.add(note);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return notes;
    }
}
