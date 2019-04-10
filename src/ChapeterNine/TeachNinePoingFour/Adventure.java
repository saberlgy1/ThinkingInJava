package ChapeterNine.TeachNinePoingFour;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 15:02
 **/

public class Adventure extends Action implements Fight {


    @Override
    public void fight() {
        System.out.println("adventure fight");
    }
}
