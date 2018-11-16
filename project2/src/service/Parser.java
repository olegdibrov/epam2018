package service;

import model.entity.Word;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private String textToParse;

    public static List<Word> parse(String textToParse) {
        String[] split = textToParse.split("[\\d,;:.!?\\s\"]+");
        List<Word> words = new ArrayList<>();
        for (int i = 0; i < split.length ; i++) {
            if (split[i].matches("([A-Za-zА-Яа-я]){1}")) {

            }
            else {
                words.add(new Word(split[i].toLowerCase()));
            }
        }
        return words;
    }
}
