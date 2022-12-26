package HomeTask4;

public class Magnitude {
    public static void main(String[] args) {
        triangleDefinition(-3, -9);
    }

        public static void triangleDefinition(int firstNumber, int secondNumber){
            int a = Math.abs(firstNumber);
            int b = Math.abs(secondNumber);
        if (a > b) {
            System.out.println(firstNumber + " більше чим " + secondNumber);
        }
           else if (a < b) {
                System.out.println(secondNumber + " більше чим " + firstNumber);
            }
            else  {
                System.out.println(secondNumber + " дорівнює " + firstNumber);
            }
        }

}
