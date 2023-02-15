import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String username, password;
        
        // Prompt the user to enter a username and password
        System.out.println("Enter your username:");
        username = scanner.nextLine();
        
        System.out.println("Enter your password:");
        password = scanner.nextLine();
        
        // Check whether the username and password match the correct credentials
        if (username.equals("myusername") && password.equals("mypassword")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect username or password.");
        }
        
        scanner.close();
        
    }

}
