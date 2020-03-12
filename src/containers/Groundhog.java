package containers;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-03-04 14:51
 **/

public class Groundhog {

    protected int number;

    public Groundhog(int i){
        this.number = i;
    }

    @Override
    public String toString() {
        return "Groundhog{" +
                "number=" + number +
                '}';
    }
}



