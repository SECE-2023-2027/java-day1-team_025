import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        String y = Integer.toOctalString(n);
        System.out.println("Octal number is: " + y);
        sc.close();
    }
}