package by.htp.itacademy.agregationdecomposition.task01;

public interface IText {

    String toString(Text tx);

    public Text addText(String text);

    public String toString();

    public void printToConsole(Text tx);

    public void printHeader(Text tx);
}
