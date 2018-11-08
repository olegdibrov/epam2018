package model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    public void addWords(String english, String russian) {
        dictionary.put(english, russian);
    }

    private String translate(String english) {
        return dictionary.get(english);
    }

    public String translateEnglishToRussian(String phrase) {
        phrase.toLowerCase();
        String russian = "";
        String[] words = phrase.split("[,;:.!?\\s]+");
        for (String word : words) {
            if (translate(word) == null) {
                russian += word;
            } else {
                russian += translate(word);
            }
            russian += " ";
        }
        return russian;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                dictionary +
                '}';
    }
}
