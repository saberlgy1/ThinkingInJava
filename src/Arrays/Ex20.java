package Arrays;
import java.util.*;
/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-11-20 12:22
 **/
public class Ex20 {
    public static void main(String[] args) {
        int[][][] a1 = new int[4][3][2];
        int[][][] a2 = new int[4][3][2];
        System.out.println(Arrays.deepToString(a1));
        System.out.println(Arrays.deepEquals(a1, a2));
        A[][][] aa1 = new A[4][3][2];
        A[][][] aa2 = new A[4][3][2];
        System.out.println(Arrays.deepToString(aa1));
        System.out.println(Arrays.deepEquals(aa1, aa2));
        System.out.println(Arrays.deepEquals(a1, aa1));
    }
}
