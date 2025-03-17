package ex_04_Operators;

public class Task12March {
    public static void main(String[] args) {
        double x= 10;
        double y= 10;
        double z= 10;
        double result;
        result = Math.cbrt((x * x) + (y * y) - Math.abs(z));
        System.out.println(" Result " +result);

//        output = Result 5.748897078944831
    }
}
