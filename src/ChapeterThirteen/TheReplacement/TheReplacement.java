package ChapeterThirteen.TheReplacement;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-18 20:22
 **/
import java.util.regex.*;
public class TheReplacement {
    public static void main(String[] args) throws Exception {
        String s = "//: strings/TheReplacements.java\n" +
                "package strings; /* Added by Eclipse.py */\n" +
                "import java.util.regex.*;\n" +
                "import net.mindview.util.*;\n" +
                "import static net.mindview.util.Print.*;\n" +
                "\n" +
                "/*! Here's a block of text to use as input to\n" +
                "    the regular expression matcher. Note that we'll\n" +
                "    first extract the block of text by looking for\n" +
                "    the special delimiters, then process the\n" +
                "    extracted block. !*/\n" +
                "\n" +
                "public class TheReplacements {\n" +
                "  public static void main(String[] args) throws Exception {\n" +
                "    String s = TextFile.read(\"TheReplacements.java\");\n" +
                "    // Match the specially commented block of text above:\n" +
                "    Matcher mInput =\n" +
                "      Pattern.compile(\"/\\\\*!(.*)!\\\\*/\", Pattern.DOTALL)\n" +
                "        .matcher(s);\n" +
                "    if(mInput.find())\n" +
                "      s = mInput.group(1); // Captured by parentheses\n" +
                "    // Replace two or more spaces with a single space:\n" +
                "    s = s.replaceAll(\" {2,}\", \" \");\n" +
                "    // Replace one or more spaces at the beginning of each\n" +
                "    // line with no spaces. Must enable MULTILINE mode:\n" +
                "    s = s.replaceAll(\"(?m)^ +\", \"\");\n" +
                "    print(s);\n" +
                "    s = s.replaceFirst(\"[aeiou]\", \"(VOWEL1)\");\n" +
                "    StringBuffer sbuf = new StringBuffer();\n" +
                "    Pattern p = Pattern.compile(\"[aeiou]\");\n" +
                "    Matcher m = p.matcher(s);\n" +
                "    // Process the find information as you\n" +
                "    // perform the replacements:\n" +
                "    while(m.find())\n" +
                "      m.appendReplacement(sbuf, m.group().toUpperCase());\n" +
                "    // Put in the remainder of the text:\n" +
                "    m.appendTail(sbuf);\n" +
                "    print(sbuf);\n" +
                "  }\n" +
                "} /* Output:\n" +
                "Here's a block of text to use as input to\n" +
                "the regular expression matcher. Note that we'll\n" +
                "first extract the block of text by looking for\n" +
                "the special delimiters, then process the\n" +
                "extracted block.\n" +
                "H(VOWEL1)rE's A blOck Of tExt tO UsE As InpUt tO\n" +
                "thE rEgUlAr ExprEssIOn mAtchEr. NOtE thAt wE'll\n" +
                "fIrst ExtrAct thE blOck Of tExt by lOOkIng fOr\n" +
                "thE spEcIAl dElImItErs, thEn prOcEss thE\n" +
                "ExtrActEd blOck.\n" +
                "*///:~\n";
        // Match the specially commented block of text above:
        Matcher mInput =
                Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
                        .matcher(s);
        if(mInput.find())
            s = mInput.group(1); // Captured by parentheses
        // Replace two or more spaces with a single space:
        s = s.replaceAll(" {2,}", " ");
        // Replace one or more spaces at the beginning of each
        // line with no spaces. Must enable MULTILINE mode:
        s = s.replaceAll("(?m)^ +", "");
        System.out.println(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        // Process the find information as you
        // perform the replacements:
        while(m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
        // Put in the remainder of the text:
        m.appendTail(sbuf);
        System.out.println(sbuf);
    }
} 
