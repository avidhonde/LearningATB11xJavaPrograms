package ex_14_string;

import java.util.Locale;

public class Lab138_String_Function {
    public static void main(String[] args) {
        char c = '4';
        System.out.println(c);

        String s1 = "ABCDE";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("F"));
    }
}
