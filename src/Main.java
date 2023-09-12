import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    class NewClass{
        static void fun(){
            double check = 0;
            Scanner input = new Scanner(System.in);
            try {
                check = input.nextDouble();
            } catch (InputMismatchException e) {}
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello customer!");
        System.out.println("Program inputs check value and calculates check and tip");
        System.out.print("Please input check value (0 to quit): ");
        int tryTime = 0;
        int tryMi = 2;
        while (tryTime < tryMi) {
            Scanner input = new Scanner(System.in);
            double check = 0;
            double tip = 0;
            try {
                check = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Value cant be negative, try again: ");
                NewClass.fun();
            }
            if (check == 0) {
                System.out.println("Quit");
                break;
            }
            if (check < 0) {
                System.out.println("Value cant be negative, try again: ");
                tryTime++;
            }
            // invalid check value
             if (check > 0 && check < 50) {
                System.out.println("Value cant be lower than 50");
                System.out.print("Try again: ");
                tryTime++;
            }
            // Check calculations
            else if (check >= 50 && check < 301) {
                tip = check * 0.15;
                System.out.println("Total sum: " + (check + tip) + " kr");
                System.out.println("Tip: " + tip + " kr");
                System.out.println("Welcome back and have a nice day!");
                break;
            } else if (check >= 301 && check < 1001) {
                tip = check * 0.20;
                System.out.println("Total sum: " + (check + tip) + " kr");
                System.out.println("Tip: " + tip + " kr");
                System.out.println("Welcome back and have a nice day!");
                break;
            } else if (check >= 1001) {
                tip = check * 0.25;
                System.out.println("Total sum: " + (check + tip) + " kr");
                System.out.println("Tip: " + tip + " kr");
                System.out.println("Welcome back and have a nice day!");
                break;
                // End of code
            }
        }
    }
}

