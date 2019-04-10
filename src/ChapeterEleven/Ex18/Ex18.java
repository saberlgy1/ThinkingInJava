package ChapeterEleven.Ex18;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 14:23
 **/

import java.util.*;

class Gerbil {
    private int gerbilNumber;
    public Gerbil(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("gerbil " + gerbilNumber + " hops");
    }
}


public class Ex18 {

    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Fuzzy", new Gerbil(0));
        gerbils.put("Spot", new Gerbil(1));
        gerbils.put("Speedy", new Gerbil(2));
        gerbils.put("Dopey", new Gerbil(3));
        gerbils.put("Sleepy", new Gerbil(4));
        gerbils.put("Happy", new Gerbil(5));
        gerbils.put("Funny", new Gerbil(6));
        gerbils.put("Silly", new Gerbil(7));
        gerbils.put("Goofy", new Gerbil(8));
        gerbils.put("Wowee", new Gerbil(9));
        System.out.println(gerbils);
        Set<String> sort = new TreeSet<String>(gerbils.keySet());
        System.out.println(sort);
        Map<String, Gerbil> map = new LinkedHashMap<String, Gerbil>();
        for(String s : sort) {
            System.out.println("Adding " + s + ", ");
            map.put(s, gerbils.get(s));
        }
        System.out.println(map);

    }

}
