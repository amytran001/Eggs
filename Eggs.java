// Step 1: Set up the main class and import the necessary package.
import java.util.Scanner;
class Eggs{
    public static void main(String[] args){
        //Step 2: Define Constants for the prices
        final double DOZEN_PRICE = 3.25;
        final double INDIVIDUAL_PRICE = 0.45;
        // Step 3: Prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of eggs: ");
        int numberOfEggs = scanner.nextInt();
        // Step 4: Calculate the number of dozens and individual eggs
        int dozens = numberOfEggs/12;
        int looseEggs = numberOfEggs % 12;
        // Step 5: Calculate the total cost
        double totalCost = (dozens * DOZEN_PRICE) + (looseEggs * INDIVIDUAL_PRICE);
        // Step 6: Display the results
        System.out.printf("You ordered %d eggs. That's %d dozen at $%.2f per dozen and %d loose eggs at %.2f cents each for a total of $%.2f.%n. ", +
                numberOfEggs, dozens, DOZEN_PRICE, looseEggs, INDIVIDUAL_PRICE * 100, totalCost);
        //Close the scanner
        scanner.close();
    }
}
