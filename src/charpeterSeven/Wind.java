package charpeterSeven;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-12 09:39
 **/



class Instruments{

    public void play(){}

    static void tune(Instruments i ){
        i.play();
    }

}



public class Wind extends Instruments {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Instruments.tune(wind);
    }
}
