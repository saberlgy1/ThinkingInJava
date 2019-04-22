package ChapterEleven.Ex22;

import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 15:53
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
        strings.add("years");
        strings.add("liu");
        strings.add("guang");
        strings.add("yuan");
        strings.add("liu");
        strings.add("guang");
        strings.add("yuan");
        strings.add("liu");
        strings.add("guang");
        strings.add("liu");
        strings.add("guang");
        strings.add("yuan");
        strings.add("old");
        return strings;
    }
}

class Word {
    static int totalWords = 0;
    String s;
    int count;
    Word(String s, int count) {
        this.s = s;
        this.count = count;
        totalWords++;
    }
    public String toString() { return s + ": " + count; }
}

public class Ex22 {

    public static void main(String[] args) {
        List<String> strings = new Text().getStrings();
        Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Words to count, sorted: " + strings);
        Set<Word> wordObjects = new HashSet<Word>();
        Iterator st= strings.iterator();
        while (st.hasNext()){
            String s = (String)st.next();
            int count = 0;
            for(int i = 0; i < strings.size(); i++) {
                if(s.equals(strings.get(i))) count++;
            }
            Word w = new Word(s,count);
            wordObjects.add(w);
        }
        System.out.println("Word count: " + wordObjects);
        System.out.println("Total words: " + Word.totalWords);
    }


}
