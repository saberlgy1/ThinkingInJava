package charpterEight;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-12 16:34
 **/

public class Ride {

    public static void get(Cycle cycle){
        cycle.ride(Note.B_FLAT);
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Tricycle tricycle = new Tricycle();
        get(cycle);
        get(bicycle);
        get(unicycle);
        get(tricycle);
    }

}

class Cycle{
    public void ride(Note n){
        System.out.println("cycle + " + n);
    }
}

class Unicycle extends Cycle{

    public void ride(Note n){
        System.out.println("Unicycle + " + n);
    }

}

class Bicycle extends Cycle{

    public void ride(Note n){
        System.out.println("Bicycle + " + n);
    }

}

class Tricycle extends Cycle{

    public void ride(Note n){
        System.out.println("Tricycle + " + n);
    }

}
