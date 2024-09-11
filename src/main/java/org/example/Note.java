package org.example;

import java.time.LocalDate;

public class Note {
    private String titre;
    private String contenu;
    private LocalDate date;

    public Note(String titre, String contenu, LocalDate date) {
        this.titre = titre;
        this.contenu = contenu;
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Note{" +
                "titre='" + titre + '\'' +
                ", contenu='" + contenu + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
