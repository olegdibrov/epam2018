package model;

import model.entity.Word;
import service.Parser;

import java.util.*;

public class Text {
    private List<Word> text;
    private TreeSet<Word.FirstLetter> firstLetter;

    public Text() {
        text = new ArrayList<>();
    }

    public Text(List<Word> text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "text=" + text;
    }

    public List<Word> getText() {
        return text;
    }

    public TreeSet<Word.FirstLetter> getFirstLetter() {
        return firstLetter;
    }

    public void setText(String dataText) {
        text = Parser.parse(dataText);
        firstLetter = new TreeSet<>();
        for (Word word: text) {
            firstLetter.add(word.getFirstLetter());
        }

    }

}
