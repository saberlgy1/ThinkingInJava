package containers;
import java.util.*;

import static util.Print.print;


public class CountedString26 {
    private static List<String> created =
            new ArrayList<String>();
    private String s;
    private int id = 0;
    private char c;
    public CountedString26(String str, char ch) {
        s = str;
        c = ch;
        created.add(s);
        for(String s2 : created)
            if(s2.equals(s)) id++;
    }
    public String toString() {
        return "String: " + s + " id: " + id + ", c: " + c  +
                ", hashCode(): " + hashCode();
    }
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        result = 37 * result + c;
        return result;
    }
    public boolean equals(Object o) {
        return o instanceof CountedString26 &&
                s.equals(((CountedString26)o).s) &&
                id == ((CountedString26)o).id &&
                c == ((CountedString26)o).c;
    }
    public static void main(String[] args) {
        Map<CountedString26,Integer> map =
                new HashMap<CountedString26,Integer>();
        CountedString26[] cs = new CountedString26[5];
        for(int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString26("hi", 'x');
            map.put(cs[i], i); // Autobox int -> Integer
        }
        print(map);
        for(CountedString26 cstring : cs) {
            print("Looking up " + cstring);
            print(map.get(cstring));
        }

    }
}