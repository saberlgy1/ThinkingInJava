package ChapeterEleven.Ex17;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 14:08
 **/

class Gerbil {
    private int gerbilNumber;
    public Gerbil(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("gerbil " + gerbilNumber + " hops");
    }
}

public class Ex17 {
    public static void main(String[] args) {
        HashMap<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Fuzzy", new Gerbil(1));
        gerbils.put("Spot", new Gerbil(2));
        gerbils.put("Speedy", new Gerbil(4));
        gerbils.put("Dopey", new Gerbil(5));
        gerbils.put("Sleepy", new Gerbil(8));
        gerbils.put("Happy", new Gerbil(9));
        Iterator<String> it = gerbils.keySet().iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.print(s + ": ");
            gerbils.get(s).hop();
        }
    }
}
