import java.util.Date;

public class SimpleClock {
  public static void main(String[] args) {
    while (true) {
      System.out.print("\033[H\033[2J"); // Clear console
      System.out.flush();
      
      // Get current time
      Date date = new Date();
      String str = String.format("%tT", date);
      
      // Display time
      System.out.println(str);
      
      // Wait for 1 second
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
