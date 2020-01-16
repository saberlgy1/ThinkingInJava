package containers;

import util.Countries;

import java.util.*;
import java.util.regex.Pattern;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-10 16:13
 **/

public class Ex3 {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        Set<String> lhs = new LinkedHashSet<String>();
        Set<String> ts = new TreeSet<String>();
        println("HashSet hs = " + hs);
        println("LinkedHashSet lhs = " + lhs);
        println("TreeSet ts = " + ts);
        Map<String,String> hm = new HashMap<String,String>(0);
        Pattern p = Pattern.compile("Z[a-zA-Z]*");
        for(int i = 0; i < Countries.DATA.length; i++) {
            if(p.matcher(Countries.DATA[i][0]).matches())
                hm.put(Countries.DATA[i][0], Countries.DATA[i][0]);
        }
        println("hm.keySet() = " + hm.keySet());
        println("Adding hm.keySet()");
        hs.addAll(hm.keySet());
        lhs.addAll(hm.keySet());
        ts.addAll(hm.keySet());
        println("hs: " + hs);
        println("lhs: " + lhs);
        println("ts: " + ts);
        println("Adding 10 more times");
        for(int i = 0; i < 10; i++) {
            hs.addAll(hm.keySet());
            lhs.addAll(hm.keySet());
            ts.addAll(hm.keySet());
        }
        println("hs: " + hs);
        println("lhs: " + lhs);
        println("ts: " + ts);
    }
}
