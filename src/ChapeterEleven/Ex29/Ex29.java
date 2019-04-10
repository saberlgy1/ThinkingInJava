package ChapeterEleven.Ex29;

import java.util.PriorityQueue;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-27 10:43
 **/

class Inherit extends Object{

}

public class Ex29 {

    public static void main(String[] args) {
        PriorityQueue<Inherit> priorityQueue = new PriorityQueue<Inherit>();
        Inherit inherit = new Inherit();
        Inherit inherit1 = new Inherit();
        priorityQueue.offer(inherit);
        priorityQueue.offer(inherit1);
    }
}
