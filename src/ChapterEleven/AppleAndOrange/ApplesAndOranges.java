package ChapterEleven.AppleAndOrange;

import java.util.ArrayList;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-22 09:53
 **/


class Apple{
    private static long counter;

    private final long id = counter++;

    public long id(){
        return id;
    }
}

class Orange{

}


public class ApplesAndOranges {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i ++){
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i ++){
            ((Apple)apples.get(i)).id();
        }
    }

}
