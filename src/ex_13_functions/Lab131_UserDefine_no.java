package ex_13_functions;

public class Lab131_UserDefine_no {
    public static void main(String[] args) {
        int r1 = sum_of_two_number(3,4);
        int r2 = sum_of_two_number(12, 14);
        System.out.println(r1);
        System.out.println(r2);
    }

static int sum_of_two_number(int a, int b) {
    return a + b;
}
}