package ChapterNine.Factories;

import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-19 09:29
 **/


interface Toys {
    void play();
}

interface ToysFactory {
    Toys getToys();
}

class Coins implements Toys {


    Random rand = new Random();

    @Override
    public void play() {
        System.out.println("Toss Coin: ");
        switch (rand.nextInt(2)) {
            case 0:
                System.out.println("Heads");
                return;
            case 1:
                System.out.println("Tails");
                return;
            default:
                System.out.println("OnEdge");
                return;
        }
    }

}

class CoinsFactory implements ToysFactory {
    public Toys getToys() {
        return new Coins();
    }
}

class Dice implements Toys {

    Random rand = new Random();

    @Override
    public void play() {
        System.out.println("Throw Dice: " + (rand.nextInt(6) + 1));
    }
}

class DiceFactory implements ToysFactory {
    public Toys getToys() {
        return new Dice();
    }
}



public class Play {
    public static void playGame(ToysFactory factory) {
        Toys g = factory.getToys();
        g.play();
    }
    public static void main(String [] args) {
        playGame(new CoinsFactory());
        playGame(new DiceFactory());
    }

}
