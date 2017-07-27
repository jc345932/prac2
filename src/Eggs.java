import java.util.Scanner;

/**
 * Created by jc345932 on 27/07/17.
 */
public class Eggs {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many eggs do you want?");
        int num = scanner.nextInt();
        int dozen = num / 12;
        int remains = num %12;
        double doPrice = 3.25* dozen;
        double eachPrice = 0.45* remains;
        double Total = doPrice + eachPrice;
        System.out.println("That's " + dozen + " dozen at $3.25 per dozen and " + remains +" loose eggs at 45 cents each for a total of $" + Total);
        scanner.close();
    }
}
