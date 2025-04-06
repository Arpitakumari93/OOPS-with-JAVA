import java.util.Scanner;

public class CrospondingDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the day (e.g., Monday, Tuesday:");
        String dayName = scanner.nextLine();
        // toLowerCase(); 

        switch (dayName) {
            case "monday":
                System.out.println("Corresponding day number: 1");
                break;
            case "tuesday":
                System.out.println("Corresponding day number: 2");
                break;
            case "wednesday":
                System.out.println("Corresponding day number: 3");
                break;
            case "thursday":
                System.out.println("Corresponding day number: 4");
                break;
            case "friday":
                System.out.println("Corresponding day number: 5");
                break;
            case "saturday":
                System.out.println("Corresponding day number: 6");
                break;
            case "sunday":
                System.out.println("Corresponding day number: 7");
                break;
            default:
                System.out.println("Invalid day name entered!");
        }

        scanner.close();
    }
}
