package ChapeterEleven.Ex28;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-27 10:39
 **/

public class Ex28 {

    public static void main(String[] args) {
        Random random = new Random(41);
        PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
        for (int i = 0; i < 10; i ++){
            priorityQueue.offer(random.nextDouble() * i);
        }
        while(priorityQueue.peek() != null)
            System.out.print(priorityQueue.poll() + " ");
    }


}
