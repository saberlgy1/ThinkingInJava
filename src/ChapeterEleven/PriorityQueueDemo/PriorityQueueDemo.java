package ChapeterEleven.PriorityQueueDemo;

import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-27 09:57
 **/

class QueueDemo{
    public static void printQ(Queue queue){
        while (queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}


public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i ++){
            priorityQueue.offer(random.nextInt(i+10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> list = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<Integer>(list);
        QueueDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<Integer>(
                list.size(), Collections.<Integer>reverseOrder()
        );
        priorityQueue.addAll(list);
        QueueDemo.printQ(priorityQueue);
        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> strings1 = new PriorityQueue<String>(strings);
        QueueDemo.printQ(strings1);
        strings1 = new PriorityQueue<String>(strings.size(), Collections.<String>reverseOrder());
        strings1.addAll(strings);
        QueueDemo.printQ(strings1);
        Set<Character> set = new HashSet<Character>();
        for (char c: fact.toCharArray()
             ) {
            set.add(c);
        }
        PriorityQueue<Character> characters = new PriorityQueue<Character>(set);
        QueueDemo.printQ(characters);


    }
}
