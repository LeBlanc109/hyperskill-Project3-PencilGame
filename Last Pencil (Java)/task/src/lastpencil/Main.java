package lastpencil;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Scanner always needed
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        /*Part 1: Emptying the pencil case
        System.out.println("||||||");
        System.out.println("Your turn!");
         */

        /*Part 2: New Rules


        System.out.println("How many pencils would you like to use:");
        int usingHowManyPencils = scanner.nextInt();
        scanner.nextLine(); //Consume the leftover newline character???

        System.out.println("Who will be the first (Zack, Jack):");
        String name1 = scanner.nextLine();

        for(int i = 1; i <= usingHowManyPencils; i++){
            System.out.print("|");
        }
        System.out.println();
        System.out.println(name1 + " is going first!");
         */

        /*Part 3: Changing the rules
        System.out.println("How many pencils would you like to use:");
        int totalPencils = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Who will be the first (Zack, Jack):");
        String name1 = scanner.nextLine();
        String name2 = (name1.equals("Zack")) ? "Jack" : "Zack";

        for(int i = 1; i <= totalPencils; i++){
            System.out.print("|");
        }
        System.out.println();


        //Here we can put this into a while loop to simulate gameplay
        while(totalPencils > 0){

            System.out.println(name1 + "'s turn:");
            int pencilsToTake = scanner.nextInt();
            totalPencils -= pencilsToTake;
            for(int i = 1; i <= totalPencils; i++){
                System.out.print("|");
            }
            System.out.println();

            //Swap players after
            String temp = name1;
            name1 = name2;
            name2 = temp;

        }
        */

        /*
        //Part 4: Fair Play
        System.out.println("How many pencils would you like to use:");

        //Rules for Loop
        int requiredPencils = 1;
        int totalPencils = 0;
        boolean validInput = false;

        while(!validInput) {
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if(input.isEmpty()){
                    System.out.println("Please enter a numeric value.");
                    continue; // prompt for input again
                }try {
                    totalPencils = Integer.parseInt(input);
                    if (totalPencils < requiredPencils) {
                        System.out.println("The number of pencils should be positive");
                    } else {
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The number of pencils should be numeric");
                }
            }
        }

        //Select Player
        System.out.println("Who will be the first (Zack, Jack):");
        String name1;

        while (true) {
            name1 = scanner.nextLine();
            if (name1.equals("Zack") || name1.equals("Jack")) {
                break;
            } else {
                System.out.println("Invalid input. Choose between 'Zack' and 'Jack'.");
            }
        }
        String name2 = (name1.equals("Zack")) ? "Jack" : "Zack";

        for(int i = 1; i <= totalPencils; i++){
            System.out.print("|");
        }
        System.out.println();
        System.out.println(name1 + "'s turn!");




        //Here we can put this into a while loop to simulate gameplay
        while(totalPencils > 0){
            int pencilsToTake;
            //Here we make sure pencilsToTake is above requiredPencils
            while (true) {
                if (scanner.hasNextInt()) {
                    pencilsToTake = scanner.nextInt();
                    if (pencilsToTake >= 1 && pencilsToTake <= 3) {
                        if(pencilsToTake > totalPencils){
                            System.out.println("Too many pencils were taken");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Possible values: '1', '2', '3'");
                    }
                } else {
                    System.out.println("Possible values: '1', '2', '3'");
                    scanner.next(); // Consume invalid input
                }
            }

            //Update the remaining pencils visualization
            totalPencils -= pencilsToTake;
            for(int i = 1; i <= totalPencils; i++){
                System.out.print("|");
            }
            System.out.println();
            if(totalPencils > 0){
                System.out.println(name2 + "'s turn!");
            }
            //Swap players after
            String temp = name1;
            name1 = name2;
            name2 = temp;

        }
        System.out.print(name1 + " won!"); 
        scanner.close();

         */


        //Part 5: The RIGHT Strategy
        System.out.println("How many pencils would you like to use:");

        //Rules for Loop
        int requiredPencils = 1;
        int totalPencils = 0;
        boolean validInput = false;

        while (!validInput) {
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Please enter a numeric value.");
                    continue; // prompt for input again
                }
                try {
                    totalPencils = Integer.parseInt(input);
                    if (totalPencils < requiredPencils) {
                        System.out.println("The number of pencils should be positive");
                    } else {
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The number of pencils should be numeric");
                }
            }
        }

        //Select Player
        System.out.println("Who will be the first (John, Jack):");
        String name1;

        while (true) {
            name1 = scanner.nextLine();
            if (name1.equals("John") || name1.equals("Jack")) {
                break;
            } else {
                System.out.println("Invalid input. Choose between 'John' and 'Jack'.");
            }
        }
        String name2 = (name1.equals("John")) ? "Jack" : "John";

        for (int i = 1; i <= totalPencils; i++) {
            System.out.print("|");
        }
        System.out.println();

        //The player does NOT always go first


        // If Jack is the first player, it's not playable

        //Here we can put this into a while loop to simulate gameplay
        while (totalPencils > 0) {

            int pencilsToTake = 0;
            System.out.println((name1.equals("John") ? "John" : "Jack") + "'s turn:");

            if (name1.equals("John")) {
                //This is what happens if it's a playable turn
                while (true) {
                    if (scanner.hasNextInt()) {
                        pencilsToTake = scanner.nextInt();
                        if (pencilsToTake >= 1 && pencilsToTake <= 3) {
                            if (pencilsToTake > totalPencils) {
                                System.out.println("Too many pencils were taken");
                                continue;
                            }
                            break;
                        } else {
                            System.out.println("Possible values: '1', '2', '3'");
                        }
                    } else {
                        System.out.println("Possible values: '1', '2', '3'");
                        scanner.next(); // Consume invalid input
                    }
                }
            } else {
                if(totalPencils == 1){
                    pencilsToTake = 1;
                } else if(totalPencils % 4 == 1){
                    pencilsToTake = (rand.nextInt(3) + 1);
                } else {
                    // Bot is in a winning position, calculate optimal move
                    pencilsToTake = switch (totalPencils % 4) {
                        case 0 -> 3;
                        case 2 -> 1;
                        case 3 -> 2;
                        default -> 1; // Default case, shouldn't be reached
                    };
                }
                System.out.println(pencilsToTake);

            }



            //Update the remaining pencils
            totalPencils -= pencilsToTake;

            if (totalPencils == 0) {
                System.out.print((name1.equals("Jack") ? "John" : "Jack") + " won!\n");
                break;
            }

            for (int i = 1; i <= totalPencils; i++) {
                System.out.print("|");
            }
            System.out.println();




            String temp = name1;
            name1 = name2;
            name2 = temp;
        }

        scanner.close();
    }
}
