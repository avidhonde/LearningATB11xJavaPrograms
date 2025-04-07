package ex_13_functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
//        int result = pramod_f1();
        int result = return_int();
        System.out.println(result);

        boolean r = return_boolean();
        System.out.println(r);

    }
    static void pramod_f1(){
        System.out.println("No result");
    }
    static int return_int(){
        return 10;
    }
    static boolean return_boolean(){
        return true;
    }
    static float return_float(){
        return 3.14f;
    }
    static int return_byte(){
        return 100;
    }
    static int return_long(){
        return 101;
    }
    static String return_string(){
        return "pramod";
    }
}
