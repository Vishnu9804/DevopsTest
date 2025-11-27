import java.util.Scanner;

public class MultiplicationDivision{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Multiplication :- "+a*b);
            System.out.println("Division :- "+a/b);
        }

    }
}