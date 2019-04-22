package ChapterEleven.PrintCollection;

import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-22 15:08
 **/

public class PringCollection {

    static Collection fill(Collection<String> collection){
        collection.add("cat");
        collection.add("bat");
        collection.add("aog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map){
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog","Bosco");
        map.put("dog","spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
    }

}
