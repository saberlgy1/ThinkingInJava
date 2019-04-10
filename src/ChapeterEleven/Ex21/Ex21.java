package ChapeterEleven.Ex21;

import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 15:37
 **/

class Text{
    public List<String> strings= new ArrayList<String>();
    public List<String> getStrings(){
        strings.add("i");
        strings.add("am");
        strings.add("liu");
        strings.add("guang");
        strings.add("am");
        strings.add("liu");
        strings.add("guang");
        strings.add("am");
        strings.add("liu");
        strings.add("guang");
        strings.add("am");
        strings.add("liu");
        strings.add("guang");
        strings.add("am");
        strings.add("liu");
        strings.add("guang");
        strings.add("yuan");
        strings.add("22");
        strings.add("years");
        strings.add("liu");
        strings.add("guang");
        strings.add("yuan");
        strings.add("liu");
        strings.add("guang");
        strings.add("yuan");
        strings.add("liu");
        strings.add("guang");
        strings.add("yuan");
        strings.add("liu");
        strings.add("guang");
        strings.add("yuan");
        strings.add("old");
        return strings;
    }
}

public class Ex21 {
    public static void main(String[] args) {
        List<String> strings = new Text().getStrings();
        System.out.println("strings to count: " + strings);
        Collections.sort(strings,String.CASE_INSENSITIVE_ORDER);
        Map<String,Integer> wordCount =
                new LinkedHashMap<String,Integer>();
        Iterator<String> it = strings.iterator();
        int totalWords = 0;
        while (it.hasNext()){
            String s = (String)it.next();
            if(strings.contains(s)) {
                Integer count = wordCount.get(s);
                wordCount.put(s,
                        count == null ? 1 : count + 1);
                totalWords++;
            }
        }
        System.out.println(wordCount);
    }
}
