package ChapterEleven.Ex20;

import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 14:39
 **/

public class Ex20 {
    static void vowelCounter20(Set<String> st) {
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels,
                'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int allVowels = 0;
        Map<Character,Integer> vowelMap =
                new TreeMap<Character,Integer>();
        for (String s:st
             ) {
            for (Character v: s.toCharArray()
                 ) {
                        if (vowels.contains(v)){
                            Integer count = vowelMap.get(v);
                            vowelMap.put(v,
                                    count == null ? 1 : count + 1);
                            allVowels++;
                        }
            }
        }
        System.out.println("Vowels: " + vowelMap);
        System.out.println("Total vowels: " + allVowels);
    }
}
