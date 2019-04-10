package ChapeterTen.Parcel4;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-19 15:24
 **/



class Outer7 {
    private int oi = 1;
    private void hi() { System.out.println("Outer hi"); }
    class Inner {
        void modifyOuter() {
            oi *= 2;
            hi();
        }
    }
    public void showOi() { System.out.println(oi); }
    void testInner() {
        Inner in = new Inner();
        in.modifyOuter();
    }
    public static void main(String[] args) {
        Outer7 out = new Outer7();
        out.showOi();
        out.testInner();
        out.showOi();
    }
}

class Outer8 {
    class Inner {
        private int ii1 = 1;
        private int ii2 = 2;
        private void showIi2() { System.out.println(ii2); }
        private void hi() { System.out.println("Inner hi"); }
    }
    // Need to create objects to access private elements of Inner:
    int oi = new Inner().ii1;
    void showOi() { System.out.println(oi); }
    void showIi2() { new Inner().showIi2(); }
    void outerHi() { new Inner().hi(); }
    public static void main(String[] args) {
        Outer8 out = new Outer8();
        out.showOi();
        out.showIi2();
        out.outerHi();
    }
}


interface Destination{
    String readLabel();
}

interface Content{
    int value();
}

class Parcel4{
    private class PContents implements Content{
        private int i;
        public int value(){
            return i;
        }
    }

    public Content content(){
        return new PContents();
    }

    public Content getContent(){
        Parcel4 parcel4 = new Parcel4();
        PContents pc = parcel4.new PContents();
        return pc;
    }
    private int i = 0;


}



public class TestParcel {

    public static void main(String[] args) {

        Parcel4 parcel4 = new Parcel4();
        //Content c = parcel4.content();
        //error


    }

}
