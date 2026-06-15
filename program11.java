import java.util.Scanner;
public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String S = sc.nextLine();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            }
        }

        System.out.println("The string is : " + S);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        sc.close();
    }
}