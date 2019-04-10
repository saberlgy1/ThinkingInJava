package ChapeterNine.Factories;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-19 09:21
 **/

interface Cycle {
    public void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void ride(){
        System.out.println("ride an Unicycle");
    }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    public void ride(){
        System.out.println("ride an Bicycle");
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    public void ride(){
        System.out.println("ride a Tricycle");
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}


public class RideCycle {

    public static void main(String[] args) {
        BicycleFactory bicycleFactory = new BicycleFactory();
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();
        bicycleFactory.getCycle().ride();
        unicycleFactory.getCycle().ride();
        tricycleFactory.getCycle().ride();
    }

}
