package HomeTask4;
public class CheckOddEven {
    public static void main(String[] args) {
        if(isEven(3)){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
    }

    public static boolean isEven (int num){
        return num % 2 == 0;
    }
}
