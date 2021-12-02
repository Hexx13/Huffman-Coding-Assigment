package huff;
//TODO CHANGE THIS TO EXTEND TreeNode
public class HuffNode {
    String letter;
    int frequency;


    public HuffNode(String letter, int frequency) {
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
