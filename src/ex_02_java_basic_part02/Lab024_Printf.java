package ex_02_java_basic_part02;

public class Lab024_Printf {
    public static void main(String[] args) {

        int a = 10;
        System.out.printf("You variable is %d",a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b = 20;
        System.out.println( " --- ");
        System.out.printf("%d + %d",a,b);
        System.out.println("=");
        System.out.println(a+b);
    }
}
