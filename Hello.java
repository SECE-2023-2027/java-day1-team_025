import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello\n"+name);
        sc.close();
    }
}