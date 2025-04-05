package ex_10_For_Loop;

public class Lab112_ForLoop_continue {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if (i==5) {
                continue; //skip below code,move to top
            }
            System.out.println("true" +i);

        }
    }
}
