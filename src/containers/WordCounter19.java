package containers;

import util.TextFile;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import static util.Print.print;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-03-05 09:50
 **/

public class WordCounter19 {

    public static void main(String[] args) {
        // File whose words are to be counted:
        String fileName = "src/containers/WordCounter19.java";
        // Set of unique words in file:
        Set<String> words = new TreeSet<String>(new TextFile(fileName, "\\W+"));
        // Create initialize array of correct length:
        SimleHashMap<String,Integer> wordCount =
                new SimleHashMap<String,Integer>();
        // Word list of all words in file:
        ArrayList<String> fileList = new TextFile(fileName, "\\W+");
        // Count appearances of each unique word and add to array:
        for(String s : words) {
            int count = 0;
            for(String t : fileList) {
                if(t.equals(s)) count++;
            }
            wordCount.put(s, count);
        }
        print(wordCount);

    }

}
