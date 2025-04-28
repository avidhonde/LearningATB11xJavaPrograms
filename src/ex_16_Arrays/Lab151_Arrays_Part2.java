package ex_16_Arrays;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String[] name ={"Avi","akash","lucky"};
        System.out.println(name.length);
        System.out.println(name[0]);
        System.out.println(name[2]);

        String[] ATB11x = new String[3];
        ATB11x[0] = "avinash";
        ATB11x[1] = "kisan";
        ATB11x[2] = "dhonde";
//        ATB11x[3] = "prashant";
//        ATB11x[4] = "paswan";
        System.out.println(ATB11x.length);
        System.out.println(ATB11x[1]);
//        System.out.println(ATB11x[4]);

        boolean[] is_male = new boolean[2];
        is_male[0] = true;
        is_male[1] = false;
//        is_male[2] = false;
        System.out.println(is_male[1]);
    }
}
