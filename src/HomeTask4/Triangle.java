package HomeTask4;

public class Triangle {
    public static void main(String[] args) {
        triangleDefinition(1, 1,1);
    }

    public static void triangleDefinition(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is not isosceles");
        }
    }
}
