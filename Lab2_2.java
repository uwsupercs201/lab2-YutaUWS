import java.util.Scanner;
public class Lab2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//initialize Scanner
        System.out.print("Enter a number of seconds: ");
        int enteredSeconds = input.nextInt();
        secondsAnalyzer(enteredSeconds);//call secondAnalyzer method
    }
    public static void secondsAnalyzer(int x){
        int weeks = x / 604800;//initialize weeks
        int days = (x % 604800) / 86400;//initialize days
        int hours = (x % 86400) / 3600;//initialize hours
        int minutes = (x % 3600) / 60;//initialize minutes
        int seconds = (x % 60);//initialize seconds
        System.out.print(x + " seconds is " + weeks + " weeks, " + days + " days, " + hours + "hours, "
                                + minutes + (" minutes, and " + seconds + (" seconds")));
    }
}