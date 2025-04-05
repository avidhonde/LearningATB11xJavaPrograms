package ex_10_For_Loop;

public class Lab113_ForLoop_Continue_EvenNumber {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if (i%2 ==0){
                System.out.println("even" +i);
            }
            else {
                System.out.println("odd");
            }
        }
    }
}
