package ChapterEleven.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 13:35
 **/

public class Statistics {


    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10000; i ++){
            int r = random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }

}
