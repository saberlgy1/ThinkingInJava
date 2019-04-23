package ChapterTwelve;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-02 17:25
 **/
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends BaseballException {}
class ThrownFromGame extends UmpireArgument {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }
    public  void atBat() throws Strike, Foul, UmpireArgument{
        throw new Strike();
    };
    public void questionableCall() throws UmpireArgument {}
    public void walk() {} // Throws no checked exceptions
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}


interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning20 extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning20()
            throws UmpireArgument, RainedOut, BaseballException {}
    public StormyInning20(String s)
            throws Foul, BaseballException {}
    // Regular methods must comform to base class:
    //! void walk() throws PopFoul {} // Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    //! public void event() throws RainedOut {}
    // If method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {}
    // You can choose to not throw any exceptions,
    // even if the base class version does:
    public void event() {}
    // Overridden methods can throw inherited exceptions:
    public void atBat() {

    }
    public void questionableCall() throws UmpireArgument {
        throw new UmpireArgument();
    }
    public static void main(String[] args) {

        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new Inning() {
            };
            i.atBat();
            // You must catch the exceptions from
            // the base-class version of the method:
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(UmpireArgument e) {
            System.out.println("Thrown from game (Inning)");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}