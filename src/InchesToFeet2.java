import java.util.Scanner;

/**
 * Created by jc345932 on 27/07/17.
 */

public class InchesToFeet2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your data:");
        int a = scanner.nextInt();
        int feet = a/12; int inch = a%12;
        System.out.println("Answer is " + feet + " Feets "  + inch + " inches.");
        scanner.close();
    }
}
