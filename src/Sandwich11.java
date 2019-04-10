/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-14 17:03
 **/

class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Pickle {
    Pickle() { System.out.println("Pickle()"); }
}

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()"); }
}

public class Sandwich11 extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();

    private Lunch l = new Lunch();
    public Sandwich11() { System.out.println("Sandwich()"); }
    private Pickle p = new Pickle();
    public static void main(String[] args) {
        new Sandwich11();
    }
}
