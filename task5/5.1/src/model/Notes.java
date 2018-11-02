package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Notes {
    List<Note> notes = new ArrayList<>();

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
