package huff;

import IO.HuffIO;
import week1.*;
import week5.TreeNode;

import java.io.IOException;

public class HuffmanTree {
    TreeNode root;



    String enResult;
    ListArrayBased list;

    //TODO decode
    // - make this able to handle multiple codes separated by spaces
    // - research enhanced loops
    public char decode(String message){
        TreeNode nodeX = root;

        for (int i = 0; i < message.length(); i++) {
            //Giving if statement shorthands a go
            nodeX = (message.charAt(i)==0) ? nodeX.getLeft() : nodeX.getRight();
        }
        return ((HuffNode) nodeX.getItem()).getLetter().charAt(0);
    }

    /**
     *
     * @param node assign node to iterrate through each subtree
     * @param message assign the letter to be encoded
     * @param code where the code is calculated through recursion
     */
    //TODO Encode
    // - add Display Compression ratio
    public void encode(TreeNode node, String message, String code){
        System.out.println(root);
        System.out.println(((HuffNode)node.getItem()).getLetter());
        if(((HuffNode)node.getItem()).getLetter().equals(message)){
            enResult = code;
        }

        if(root!=null){
            encode(root.getLeft(), code + "0", message);
            encode(root.getRight(), code + "1", message);
        }
    }


    public void genTree() throws IOException {
        //TODO Import text files
        HuffIO.readList("LetterCountAscending.txt");
        while (list.size() > 1) {
            list.sort();
            //creating a parent node with a frequency that is the sum of the two lower element's frequencies
            TreeNode parentNode = new TreeNode(
                    new HuffNode("*",sumFrequency()),
                    (TreeNode) list.get(1),
                    (TreeNode) list.get(2)
            );
            //two elements are removed from list
           popTopTwo();

            //insert new parent node into list
           list.add(list.size() + 1, parentNode);

        }
        //This element becomes the root of the binary huffman tree
        root = (TreeNode) list.get(1);
    }





    /**
     * Removes the duplicate child nodes
     */
    private void popTopTwo(){
        list.remove(1);
        list.remove(1);
    }

    /**
     * Sums the frequencies of the two nodes used for building the tree
     * @return the sum of the two frequencies
     */
    private int sumFrequency(){
        int left = ((HuffNode) ((TreeNode) list.get(1)).getItem()).getFrequency();
        int right = ((HuffNode) ((TreeNode) list.get(2)).getItem()).getFrequency();
        return  left +  right;
    }
    /**
     * Method used to fetch the root node
     * @return  The root node
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * @return the encoded result
     */
    public String getEnResult() {
        return enResult;
    }

}
