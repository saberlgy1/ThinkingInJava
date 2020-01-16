package containers;

import util.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-10 15:10
 **/

public class Ex1 {


    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();
        for (int i = 0; i < Countries.DATA.length; i++) {
            al.add(Countries.DATA[i][0]);
            ll.add(Countries.DATA[i][1]);
        }
        Collections.sort(al);
        Collections.sort(ll);
        System.out.println("countries: " + al);
        System.out.println("capitals: " + al);
        for(int i = 0; i < 2; i++) {
            Collections.shuffle(al);
            Collections.shuffle(ll);
            System.out.println("Countries " + i + ": " + al);
            System.out.println("Capitals " + i + ": " + ll);
        }
        List<String> al2 = new ArrayList<String>();
        List<String> ll2 = new LinkedList<String>();
        for(int i = 0; i < 10; i++) {
            al2.add(Countries.DATA[i][0]);
            ll2.add(Countries.DATA[i][1]);
        }
        for(int i = 0; i < 5; i++) {
            Collections.shuffle(al2);
            Collections.shuffle(ll2);
            System.out.println("Countries " + i + ": " + al2);
            System.out.println("Capitals " + i + ": " + ll2);
            Collections.sort(al2);
            Collections.sort(ll2);
        }
    }

}
