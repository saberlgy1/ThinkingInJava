package containers;

import util.TextFile;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-10 16:47
 **/

public class Ex4 {

    static Collection<String> CollectFromText(String filename) {
        String[] sa = TextFile.read(filename).split(" ");
        return Arrays.asList(sa);
    }

    static Collection<String> CollectFromText2(String fileName) {
        String[] sa = TextFile.read(fileName).split(" ");
        return new TreeSet<String>(new TextFile(fileName, "\\W+"));
    }
    public static void main(String[] args) {
        System.out.println(CollectFromText("src/containers/Ex4.java"));
        System.out.println(CollectFromText2("src/containers/Ex4.java"));
    }

}
