package ChapeterTwelve.Ex3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-28 16:45
 **/

public class Ex3 {

    private static String[] s = {"sss"};
    private static Logger logger = Logger.getLogger("Ex3");
    static void logException(Exception e) { // Exception e argument
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        try {
            System.out.println(s[1]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(
                    "Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            // call logging method:
            logException(e);
        }
    }

}
