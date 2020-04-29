package by.htp.itacademy.agregationdecomposition.task01;

public class TextLogic implements IText {

    private Text text;

    @Override
    public String toString(Text tx) {

        StringBuilder sb = new StringBuilder ();
        return sb.append (tx).toString ();
    }

    @Override
    public void addText(String text) {



    }

    @Override
    public void printToConsole(String text) {

    }

    @Override
    public void printHeader(String text) {

    }
}
