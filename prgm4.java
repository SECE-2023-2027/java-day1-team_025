public class Prgm4 {
    public static void main(String[] args) {
        String a = "100010";
        String b = "110010";

        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int sum = x + y;
        String ans = Integer.toBinaryString(sum);

        System.out.println("Input first binary number: " + a);
        System.out.println("Input second binary number: " + b);
        System.out.println("Sum of two binary numbers: " + ans);
    }
}