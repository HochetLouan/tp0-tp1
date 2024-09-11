package org.example;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Note une = new Note("cedric", "12", LocalDate.now());
        Note deux = new Note("pres", "16", LocalDate.now());
        CSVNotesSaver cns = new CSVNotesSaver();

        BBDNoteSaver bns = new BBDNoteSaver();
        bns.addNote(deux);
    }
}