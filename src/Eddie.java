import java.util.Scanner;

public class Eddie {
    public void command(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to my command line app!");

        do {
            System.out.print("\nEnter a command (type 'help' for a list of commands): ");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "help":
                    System.out.println("""

                            List of available commands:
                            help - display a list of available commands
                            greet - greet the user
                            calc - perform a simple calculation
                            exit - exit the application""");
                    break;
                case "greet":
                    System.out.print("\nEnter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Hello, " + name + "!");
                    break;
                case "calc":
                    System.out.print("\nEnter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the operator (+, -, *, /): ");
                    String operator = scanner.nextLine();
                    double result = 0;

                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                        default:
                            System.out.println("Invalid operator.");
                            break;
                    }

                    System.out.println("Result: " + result);
                    break;
                case "exit":
                    System.out.println("\nThanks for using my app!");
                    break;
                default:
                    System.out.println("\nInvalid command. Type 'help' for a list of commands.");
                    break;
            }
        } while (!command.equals("exit"));
    }
}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to my command line app!");
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello, " + name + "!");
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        System.out.println("You are " + age + " years old.");
//
//        System.out.println("Thanks for using my app!");
//    }
//}