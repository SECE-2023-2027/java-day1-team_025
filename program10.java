import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String S = sc.nextLine();
        String reverse = "";

        for (int i=S.length() - 1;i>=0;i--) {
            reverse += S.charAt(i);
        }

        System.out.println("Reverse string: " + reverse);
        sc.close();
    }
}