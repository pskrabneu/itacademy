package by.htp.itacademy.agregationdecomposition.task01;

public class Sentence {

    private Word word;
    private StringBuilder sb = new StringBuilder();

    public Sentence(Word word) {
        sb.append(word);
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        sb.append(word);
    }
}
