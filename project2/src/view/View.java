package view;

import model.Text;
import model.entity.Word;

import java.util.Iterator;

public class View {

    public static final String CHOOSE_ACTION = "Choose action";
    public static final String EXIT = "   0 - EXIT";
    public static final String SHOW_WORDS = "   1 - Show all words in text";
    public static final String SHOW_WORDS_BY_ALPHABET = "   2 - Show words by alphabet";
    public static final String LOAD_FILE = "   3 - Load file to analize";

    public static final String ERROR = "Error! Try again.";

    public static final String ENTER_FILE = "Enter file name: ";

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printTextByAlphabet(Text text) {
        Iterator iterator =  text.getFirstLetter().iterator();
        Word.FirstLetter temp = (Word.FirstLetter) iterator.next();
        for (int i = 0; i < text.getText().size() && iterator.hasNext();  i++) {
            if (text.getText().get(i).getWord().charAt(0) == temp.getFirstLetter()) {
                temp = (Word.FirstLetter)iterator.next();
                System.out.print("\t");
                System.out.println(text.getText().get(i).getWord());
            }
            else {
                System.out.println(text.getText().get(i).getWord());            }
        }
    }

    public static void printWordsInText(Text text) {
        System.out.println(text);
    }
}
