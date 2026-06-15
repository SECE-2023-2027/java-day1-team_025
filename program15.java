import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int first = sc.nextInt();

        System.out.print("Input the second number: ");
        int second = sc.nextInt();

        System.out.print("Input the third number : ");
        int third = sc.nextInt();

        boolean result = first % 10 == second % 10
                || first % 10 == third % 10
                || second % 10 == third % 10;

        System.out.println("The result is: " + result);
        sc.close();
    }
}