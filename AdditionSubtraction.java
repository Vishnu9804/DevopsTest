import java.util.Scanner;

public class AdditionSubtraction{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Addition :- "+(a+b));
            System.out.println("Subtraction :- "+(a-b));
        }

    }
}