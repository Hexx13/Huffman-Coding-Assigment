package IO;

import huff.HuffNode;
import week1.ListArrayBased;
import week5.TreeNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HuffIO {

    //TODO create handler
    /**
     * A function that reads the the huffman data file and stores the symbols and frequencies of the file in a array based list
     * @param filePath the path of the text file
     * @return Array Based List storing HuffmanNode Objects which contain character and frequency
     * @throws IOException
     */
    public static ListArrayBased readList(String filePath) throws IOException {
        //Declaration of list where characters and frequencies are stored
        ListArrayBased list = new ListArrayBased();

        //declaration of file object which stores the file path
        File file = new File(filePath);
        //declaration of buffered reader
        BufferedReader buffReader = new BufferedReader(new FileReader(file));
        //String used to store line that is being read by buffered reader
        String currString;

        //variable for list index assigment
        int i =1;

        //While loop iterates through each line of the text file
        while((currString = buffReader.readLine())!= null){
            //Splitting the character and frequency
            String[] str = currString.split("\t", 2);
            //Adding them to the list
            list.add(i++,new TreeNode(new HuffNode(str[0], Integer.parseInt(str[1]))));
        }
        //Closing the reader
        buffReader.close();

        return list;
    }



}
