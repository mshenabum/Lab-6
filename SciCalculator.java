import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {

        //variable declarations to be used in the program

        double totalResult = 0;
        int calculation = 0;
        double average = 0;
        double currentResult = 0;
        Scanner input = new Scanner(System.in);


        //Outer while loop that will print the menu

        while (true) {

            System.out.println("Current Result: " + currentResult);
            System.out.println();
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println();

            //Inner while loop

            while (true) {
                System.out.print("Enter Menu Selection: ");   //menu selection
                int menu = input.nextInt();
                System.out.println();

                //if statements for if user picks display average too early or just wants to exit program

                if (menu < 0 || menu > 7) {
                    System.out.println("Error: Invalid selection!");
                    continue;
                } else if (menu == 0) {
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(0);
                } else if (menu == 7 && calculation == 0) {
                    System.out.println("Error: No calculations yet to average!");
                    continue;
                } else if (menu == 7) {  //Display average output
                    System.out.printf("Sum of calculations: %.2f", totalResult);
                    System.out.println();
                    System.out.println("Number of calculations: " + calculation);
                    System.out.printf("Average of calculations: %.2f", average);
                    System.out.println();
                    continue;
                }

                //Operand input using scanner

                System.out.print("Enter first operand: ");
                double operand1 = input.nextDouble();

                System.out.print("Enter second operand: ");
                double operand2 = input.nextDouble();

                System.out.println();

                //Calculations to be used for each selection

                double addition = operand1 + operand2;
                double subtraction = operand1 - operand2;
                double multiplication = operand1 * operand2;
                double division = operand1 / operand2;
                double exponentiation = Math.pow(operand1, operand2);
                double logarithm = Math.log(operand2) / Math.log(operand1);

                if (menu == 1)          //If statements for each selected menu option
                {
                    currentResult += addition;
                    totalResult += addition;
                    break;

                } else if (menu == 2) {
                    currentResult = subtraction;
                    totalResult += subtraction;
                    break;
                } else if (menu == 3) {
                    currentResult = multiplication;
                    totalResult += multiplication;
                    break;
                } else if (menu == 4) {
                    currentResult = division;
                    totalResult += division;
                    break;
                } else if (menu == 5) {
                    currentResult = exponentiation;
                    totalResult += exponentiation;
                    break;
                } else if (menu == 6) {
                    currentResult = logarithm;
                    totalResult += logarithm;
                    break;
                }

            }
            calculation++;  //calculation incrementation outside inner while loop
            average = totalResult / (double) calculation;  //average formula

        }


    }

}




