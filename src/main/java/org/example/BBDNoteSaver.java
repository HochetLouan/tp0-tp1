package org.example;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class BBDNoteSaver {
    public void addNote(Note note) throws SQLException {
        Connection connection = DBConnex.getConnection();
        String query = "INSERT INTO note (titre, contenu, date) VALUES (?, ?, ?)";
        PreparedStatement pstatement = connection.prepareStatement(query);
        try {
            pstatement.setString(1, note.getTitre());
            pstatement.setString(2, note.getContenu());
            pstatement.setDate(3, Date.valueOf(note.getDate()));
            pstatement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public List<Note> get
}
