package ChapterTwelve;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-03 17:21
 **/

class Disposable {
    private static int counter = 0;
    private int id = counter++;
    private boolean disposed;
    Disposable() throws Exception{
        disposed = false;
        throw new Exception();
    }
    void dispose() {
        disposed = true;
    }
    String checkStatus() {
        return (id + " " + (disposed ? "disposed" : "not disposed"));
    }
}

public class FailingConstructor23 {
    private Integer[] ia = new Integer[2];
    private static Disposable d0;
    private static Disposable d1;
    FailingConstructor23() throws Exception {
        try {
            d0 = new Disposable();
            try {
                ia[2] = 2; 	// causes exception thrown and 
                // caught in middle try loop
                try {
                    d1 = new Disposable();
                } catch(Exception e) {
                    System.out.println("Caught e in inner try loop");
                    e.printStackTrace(System.err);
                    System.out.println("Failed to create d1");
                }
            } catch(Exception e) {
                System.out.println("Caught e in middle try loop");
                e.printStackTrace(System.err);
                System.out.println("Disposing d0");
                d0.dispose(); // d0 would have been created
            }
        } catch(Exception e) {
            System.out.println("Caught e in outer try loop");
            e.printStackTrace(System.err);
            System.out.println("Failed to create d0");
        }

    }
    public static void main(String[] args) {
        try {
            // the constructor catches its own exceptions:
            FailingConstructor23 fc = new FailingConstructor23();
        } catch(Exception e) {
            System.err.println("Caught Exception in main()");
            e.printStackTrace(System.err);
        }
    }
}

