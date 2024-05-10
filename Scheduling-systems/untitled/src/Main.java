import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the hour (0-24): ");
        int hour = scanner.nextInt();
        int minute = 0; // Assuming minute is always 0 for simplicity

        if (hour < 0 || hour > 24) {
            System.out.println("Invalid hour. Please enter an hour between 0 and 24.");
        } else {
            LocalTime inputTime = LocalTime.of(hour, minute);
            String feedingInfo = FeedingTime.getFeedingInfo(inputTime);
            System.out.println(feedingInfo);
        }
    }
}
