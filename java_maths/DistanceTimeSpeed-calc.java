import java.util.Scanner;

public class DistanceTimeSpeed {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double distance, time, speed;
        
        // Prompt the user to enter the values of any two variables
        System.out.println("Enter distance (in km):");
        distance = scanner.nextDouble();
        
        System.out.println("Enter time (in hours):");
        time = scanner.nextDouble();
        
        System.out.println("Enter speed (in km/h):");
        speed = scanner.nextDouble();
        
        // Calculate the missing variable
        if (distance > 0 && time > 0 && speed == 0) {
            speed = distance / time;
            System.out.println("Speed is " + speed + " km/h.");
        } else if (distance > 0 && speed > 0 && time == 0) {
            time = distance / speed;
            System.out.println("Time is " + time + " hours.");
        } else if (time > 0 && speed > 0 && distance == 0) {
            distance = time * speed;
            System.out.println("Distance is " + distance + " km.");
        } else {
            System.out.println("Invalid input. Please enter the values of any two variables.");
        }
        
        scanner.close();
        
    }

}
