package CharpeterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-25 16:00
 **/

class TerminationCondition {
    boolean checkedOut = false;
    TerminationCondition(boolean checkOut){
        checkedOut = checkOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) System.out.println("error check out");
        else System.out.println("success");
    }
}



public class Book {

    public static void main(String[] args) {
        TerminationCondition terminationCondition = new TerminationCondition(true);

        terminationCondition.checkIn();
        new TerminationCondition(true);
        System.gc();

    }

}
