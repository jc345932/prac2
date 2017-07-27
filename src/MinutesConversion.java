import java.util.Scanner;

/**
 * Created by jc345932 on 27/07/17.
 */
public class MinutesConversion {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many minutes do you want to convert?");
        int mins = scanner.nextInt();
        int hour = mins/60;
        double days = mins/1440.0;
        System.out.println(mins+ " minutes equals " + hour + " hours and equals " + String.format("%.3f",days) + " days.");
        scanner.close();
    }
}
