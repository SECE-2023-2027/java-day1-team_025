import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        String hex = Integer.toHexString(n).toUpperCase();
        System.out.println("Hexadecimal number is : " + hex);
    }
}