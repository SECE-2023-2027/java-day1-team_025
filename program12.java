import java.util.Scanner;
public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("The ASCII value of " + ch + " is :" + (int) ch);
        sc.close();
    }
}