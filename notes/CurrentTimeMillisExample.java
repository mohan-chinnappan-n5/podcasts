import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeMillisExample {
    public static void main(String[] args) {
        // Get the current time in milliseconds
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current Time in Milliseconds: " + currentTimeMillis);

        // Format the current time as a readable date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(new Date(currentTimeMillis));
        System.out.println("Formatted Date: " + formattedDate);

        // Measure execution time of a task
        System.out.println("\nStarting task...");
        long startTime = System.currentTimeMillis();

        // Example task: Simulate work by sleeping for 2 seconds
        try {
            Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
        } catch (InterruptedException e) {
            System.err.println("Task interrupted: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Task completed in: " + elapsedTime + " milliseconds");

        // Calculate a future time (e.g., 1 hour from now)
        long oneHourLaterMillis = currentTimeMillis + (60 * 60 * 1000); // 1 hour in milliseconds
        String oneHourLaterDate = dateFormat.format(new Date(oneHourLaterMillis));
        System.out.println("One Hour Later: " + oneHourLaterDate);
    }
}