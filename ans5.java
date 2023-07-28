import java.util.Scanner;

public class ans5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a =sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        int c=b;
        b=a;
        a=c;
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
    }
}
