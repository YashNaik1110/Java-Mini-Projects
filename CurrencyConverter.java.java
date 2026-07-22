import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double amount;
        double result;

        System.out.println("=================================");
        System.out.println("       CURRENCY CONVERTER");
        System.out.println("=================================");

        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. USD to EUR");
        System.out.println("4. EUR to USD");
        System.out.println("5. USD to GBP");
        System.out.println("6. GBP to USD");
        System.out.println("7. INR to EUR");
        System.out.println("8. EUR to INR");

        System.out.println("=================================");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextDouble();

        switch (choice) {

            case 1:
                // USD to INR
                result = amount * 96.52;
                System.out.println(
                        amount + " USD = " + result + " INR"
                );
                break;

            case 2:
                // INR to USD
                result = amount / 96.52;
                System.out.println(
                        amount + " INR = " + result + " USD"
                );
                break;

            case 3:
                // USD to EUR
                result = amount * 0.86;
                System.out.println(
                        amount + " USD = " + result + " EUR"
                );
                break;

            case 4:
                // EUR to USD
                result = amount / 0.86;
                System.out.println(
                        amount + " EUR = " + result + " USD"
                );
                break;

            case 5:
                // USD to GBP
                result = amount * 0.74;
                System.out.println(
                        amount + " USD = " + result + " GBP"
                );
                break;

            case 6:
                // GBP to USD
                result = amount / 0.74;
                System.out.println(
                        amount + " GBP = " + result + " USD"
                );
                break;

            case 7:
                // INR to EUR
                result = amount / 112.23;
                System.out.println(
                        amount + " INR = " + result + " EUR"
                );
                break;

            case 8:
                // EUR to INR
                result = amount * 112.23;
                System.out.println(
                        amount + " EUR = " + result + " INR"
                );
                break;

            default:
                System.out.println("Invalid choice!");

        }

        System.out.println("=================================");
        System.out.println("Thank you for using Currency Converter!");

        sc.close();
    }
}