package huff;

import java.io.*;
import week1.*;


public class HuffmanTree {

    String currString;
    //TODO Make seperate class for this
    public void readFreq() throws IOException {
        File file = new File("Textfiles/LetterCountAscending.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader buffReader = new BufferedReader(fileReader);

        while((currString = buffReader.readLine())!= null){

            String[] str = currString.split("\t", 2);


        }

    }

}
