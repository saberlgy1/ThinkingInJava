package charpterEight;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-15 11:00
 **/

class Grain {
    public String toString(){
        return "Grain";
    }
}

class Wheat extends Grain{
    public String toString(){
        return "Wheat";
    }
}

class Mill {
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}

public class CovariantReturn{
    public static void main(String[] args){
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}