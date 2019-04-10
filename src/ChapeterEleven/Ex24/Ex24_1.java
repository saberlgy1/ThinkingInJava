package ChapeterEleven.Ex24;

import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 16:09
 **/


public class Ex24_1 {

    public static void main(String[] args) {
        Map<String,Integer> m =
                new LinkedHashMap<String,Integer>();
        m.put("ten", 10);
        m.put("nine", 9);
        m.put("eight", 8);
        m.put("seven", 7);
        m.put("six", 6);
        m.put("five", 5);
        m.put("four", 4);
        m.put("three", 3);
        m.put("two", 2);
        m.put("one", 1);
        m.put("zero", 0);
        System.out.println("Map to sort: " + m);
        Map<String, Integer> temp = new LinkedHashMap<String,Integer>();
        Set<String> tempss = new TreeSet<String>(m.keySet());
        Map<String, Integer> stringIntegerMap = new LinkedHashMap<String, Integer>();
        Iterator<String> it = tempss.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            Integer i = m.get(s);
            m.remove(s);
            temp.put(s, i);
        }
        Set<String> stringSet = new TreeSet<String>(temp.keySet());
        Iterator<String> itss = stringSet.iterator();
            while (itss.hasNext()){
                String s = (String)itss.next();
                Integer i = temp.get(s);
                temp.remove(s);
            m.put(s, i);
        }
        temp.clear();
        System.out.println("Sorted map: " + m);
    }

}
