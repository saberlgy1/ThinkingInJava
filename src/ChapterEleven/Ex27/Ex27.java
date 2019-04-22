package ChapterEleven.Ex27;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 16:50
 **/


class Command{
    private String s;
    Command(String s) { this.s = s; }
    public void operation(){
        System.out.println(this.s);
    }
}

class CommandQueue {
    Queue<Command> makeQ() {
        Queue<Command> q = new LinkedList<Command>();
        for(int i = 0; i < 10; i++)
            q.offer(new Command(i + " "));
        return q;
    }
}

public class Ex27 {
    public static void commandEater(Queue<Command> qc) {
        while(qc.peek() != null)
            qc.poll().operation();
    }
    public static void main(String[] args) {
        CommandQueue b = new CommandQueue();
        commandEater(b.makeQ());
    }
}

