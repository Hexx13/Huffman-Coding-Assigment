package huff;

public class HuffObject {
    String letter;
    int frequency;


    public HuffObject(String letter, int frequency) {
        this.letter = letter;
        this.frequency = frequency;
    }

    public String getLetter() {
        return letter;
    }

    public int getFrequency() {
        return frequency;
    }
}
