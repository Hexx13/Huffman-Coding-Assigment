package huff;

import java.io.*;
import week1.*;
import week5.TreeNode;


public class HuffmanTree {

    ListArrayBased list = new ListArrayBased();
    String currString;
    //TODO Make seperate class for this
    public void readFreq() throws IOException {
        File file = new File("Textfiles/LetterCountAscending.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader buffReader = new BufferedReader(fileReader);

        int i =1;

        while((currString = buffReader.readLine())!= null){
            String[] str = currString.split("\t", 2);
            list.add(i,new TreeNode(new HuffObject(str[0], Integer.parseInt(str[1]))));
            i++;
        }
        buffReader.close();
    }

    

}
