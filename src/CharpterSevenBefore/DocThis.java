package CharpterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-22 16:27
 **/

class Doc {
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}

public class DocThis {

    public static void main(String[] args) {
        new Doc().intubate();
    }
}


