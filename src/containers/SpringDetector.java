package containers;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import static util.Print.print;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-03-04 15:00
 **/

public class SpringDetector {


    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {


        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.put(ghog.newInstance(i), new Prediction());
        }
        print(map);
        Groundhog gh = ghog.newInstance(3);
        print(gh);
        if (map.containsKey(gh)){
            print("true");
        }else {
            print("false");
        }
        System.out.println(map.get(3).hashCode());
        System.out.println(gh.hashCode());

        System.out.println(map.containsKey(gh));
    }


    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);
    }

}
