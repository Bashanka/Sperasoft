package regularexpressions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
        // 1
        String str1 = "Word cAT DATA A site Java tExt";
        System.out.println(str1);
        System.out.println(p1(str1)); // [Word, DATA, A, Java]
        System.out.println();

        // 2
        System.out.println(p2("2020")); // true
        System.out.println(p2("532")); //false
        System.out.println();

        // 3
        // "Removing Extra Spaces Between Words in the text"
        System.out.println(p3("  Removing        Extra Spaces       Between Words in  the             text  "));
        System.out.println();

        // 4

        System.out.println(p4("2018/10/09")); // false
        System.out.println(p4("12/10/2019")); // true
        System.out.println(p4("45/15/2019")); //false
        System.out.println(p4("aa\\0\\9")); //false
        System.out.println();

        // 5
        System.out.println(p5("Regular regular popular expressions entered popular use from 1968 1968 1968"));
        System.out.println();

        // 6
        System.out.println(p6("1223"));
        System.out.println(p6("11223344"));
        System.out.println(p6("1122333"));
        System.out.println(p6("111111"));
        System.out.println(p6("12e23"));
        System.out.println();

        // 7
        System.out.println(p7("password wword word Heeeeeeello"));
        System.out.println();
    }

    public static ArrayList p1(String text) {
        Pattern pattern = Pattern.compile("\\b[A-Z]\\S*\\b");
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> res = new ArrayList<>();
        while (matcher.find()) {
            res.add(text.substring(matcher.start(), matcher.end()));
        }
        return res;
    }

    public static boolean p2(String s) {
        Pattern pattern = Pattern.compile("^(2(0(1[3-9]|\\d\\d)|[1-9]\\d\\d)|[3-4]\\d\\d\\d|50([0-3]\\d|4[0-3]))$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public static String p3(String s) {
        Pattern pattern = Pattern.compile("^\\s+|\\s+$");
        Matcher matcher = pattern.matcher(s);
        s = matcher.replaceAll("");
        pattern = Pattern.compile("\\s+");
        matcher = pattern.matcher(s);
        s = matcher.replaceAll(" ");
        return s;
    }

    public static boolean p4(String s) {
        Pattern pattern = Pattern.compile("^((0[1-9]|1\\d|2[0-8])/02|(0[1-9]|[12]\\d|3[01])/(0[13578]|1[02])|(0[1-9]|[12]\\d|30)/(0[469]|11))/\\d\\d\\d\\d$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public static String p5(String s) {
        Pattern pattern = Pattern.compile("(?i)\\b(\\w+)(?:\\s+\\1\\b)+");
        Matcher matcher = pattern.matcher(s);
        return matcher.replaceAll("$1");
    }

    public static String p6(String s) {
        Pattern pattern = Pattern.compile("(\\d)\\1");
        Matcher matcher = pattern.matcher(s);
        return matcher.replaceAll("*");
    }

    public static String p7(String s) {
        Pattern pattern = Pattern.compile("(?i)\\b\\w*(\\w)\\1\\w*\\b\\s*");
        Matcher matcher = pattern.matcher(s);
        return matcher.replaceAll("");
    }

}
