import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        int a=10;
        System.out.println("The first number is:"+a);
        int b=5;
        System.out.println("The second number is:"+b);

        addition(a, b);
        subtraction(a, b);
        division(a, b);
        multiplication(a, b);
        square(a);
        cube(a);
    }

    public static void addition(int a, int b) {
        System.out.println("Addition:"+(a+b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Substraction:"+(a-b));
    }

    public static void division(int a, int b) {
        System.out.println("Division:"+(a/b));
    }

    public static void multiplication(int a, int b) {
        System.out.println("Multiplication:"+(a*b));
    }

    public static void  square(int a){
            System.out.println("Square:"+(a*a));
    }
    public static void  cube(int a){
                System.out.println("Cube:"+(a*a*a));
    }
}