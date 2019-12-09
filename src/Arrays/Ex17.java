package Arrays;

import Generics.Generator;
import util.Generated;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-11-19 13:48
 **/

class BigDecimalGenerator implements Generator<BigDecimal> {

    private BigDecimal bd = new BigDecimal(0.0);

    @Override
    public BigDecimal next() {
        return bd = bd.add(new BigDecimal(1.0));
    }
}

public class Ex17 {


    public static void main(String[] args) {
        BigDecimal[] bd = new BigDecimal[4];
        Generated.array(bd, new BigDecimalGenerator());
        System.out.println(Arrays.toString(bd));
        BigDecimal[] bd2 = Generated.array(BigDecimal.class, new BigDecimalGenerator(), 5);
        System.out.println(Arrays.toString(bd2));
    }
}
