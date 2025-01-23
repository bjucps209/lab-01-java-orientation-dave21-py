import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Enter num1: ");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter num2: ");
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter num3: ");
        int num3 = Integer.parseInt(scan.nextLine());
        System.out.println("The value of sum is: " + (num1 + num2 + num3));
    }
}


