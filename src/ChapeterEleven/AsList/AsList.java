package ChapeterEleven.AsList;

import java.util.Arrays;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-22 14:39
 **/

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}


public class AsList {
    public static void main(String[] args) {
        List<Powder> snowList = Arrays.asList(new Light(), new Heavy());
        List<Snow> snows = Arrays.<Snow>asList(new Light(),new Heavy());
    }
}
