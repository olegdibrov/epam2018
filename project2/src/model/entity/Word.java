package model.entity;

public class Word {
    private String word;
    private FirstLetter firstLetter = new FirstLetter();

    public Word() {
    }

    public Word(String word) {
        this.word = word;
        firstLetter.setFirstLetter(word.charAt(0));
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public FirstLetter getFirstLetter() {
        return firstLetter;
    }

    @Override
    public String toString() {
        return " " + word ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return firstLetter.equals(word.getFirstLetter());
    }

    @Override
    public int hashCode() {
        return firstLetter.hashCode();
    }

    public class FirstLetter implements Comparable{
        private char firstLetter;

        public FirstLetter() {
        }

        public FirstLetter(char firstLetter) {
            this.firstLetter = firstLetter;
        }

        public char getFirstLetter() {
            return firstLetter;
        }

        public void setFirstLetter(char firstLetter) {
            this.firstLetter = firstLetter;
        }

        @Override
        public int compareTo(Object o) {
            if (this.getFirstLetter() > ((FirstLetter)o).getFirstLetter()) return 1;
            if (this.getFirstLetter() < ((FirstLetter)o).getFirstLetter()) return -1;
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FirstLetter that = (FirstLetter) o;
            return firstLetter == that.firstLetter;
        }

        @Override
        public int hashCode() {
            return firstLetter;
        }

        @Override
        public String toString() {
            return "FirstLetter{" +
                    "firstLetter=" + firstLetter +
                    '}';
        }
    }
}
