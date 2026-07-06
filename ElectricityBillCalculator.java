import java.util.ArrayList;
import java.util.Scanner;

class Calc {

    public static void calculator(ArrayList<String> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("====Customer Details ====");
        System.out.print("Enter youre name : ");
        String name = sc.next();

        System.out.print("Enter user consumed units: ");
        int consume = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter your state: ");
        String state = sc.nextLine();


        for (String s : list) {
            boolean found = false;
            double bill = 0.0;

            if (state.equalsIgnoreCase("Andhra Pradesh")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 1.90;
                } else if (consume <= 200) {
                    bill = (100 * 1.90) + ((consume - 100) * 3.60);
                } else {
                    bill = (100 * 1.90) + (100 * 3.60) + ((consume - 200) * 6.00);
                }

            } else if (state.equalsIgnoreCase("Arunachal Pradesh")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 4.00;
                } else {
                    bill = (100 * 4.00) + ((consume - 100) * 5.00);
                }
            } else if (state.equalsIgnoreCase("Assam")) {
                found = true;
                if (consume >= 0 && consume <= 120) {
                    bill = consume * 5.35;
                } else if (consume <= 240) {
                    bill = (120 * 5.35) + ((consume - 120) * 6.60);
                } else {
                    bill = (120 * 5.35) + (120 * 6.60) + ((consume - 240) * 7.60);
                }
            } else if (state.equalsIgnoreCase("Bihar")) {
                found = true;
                if (consume >= 0 && consume <= 50) {
                    bill = consume * 3.40;
                } else if (consume <= 100) {
                    bill = (50 * 3.40) + ((consume - 50) * 4.35);
                } else {
                    bill = (50 * 3.40) + (50 * 4.35) + ((consume - 100) * 6.30);
                }
            } else if (state.equalsIgnoreCase("Chhattisgarh")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 3.70;
                } else if (consume <= 200) {
                    bill = (100 * 3.70) + ((consume - 100) * 3.90);
                } else if (consume <= 400) {
                    bill = (100 * 3.70) + (100 * 3.90) + ((consume - 200) * 5.30);
                } else {
                    bill = (100 * 3.70) + (100 * 3.90) + (200 * 5.30) + ((consume - 400) * 6.80);
                }
            } else if (state.equalsIgnoreCase("Goa")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 1.75;
                } else if (consume <= 200) {
                    bill = (100 * 1.75) + ((consume - 100) * 2.60);
                } else if (consume <= 300) {
                    bill = (100 * 1.75) + (100 * 2.60) + ((consume - 200) * 3.60);
                } else {
                    bill = (100 * 1.75) + (100 * 2.60) + (100 * 3.60) + ((consume - 300) * 4.50);
                }
            } else if (state.equalsIgnoreCase("Gujarat")) {
                found = true;
                if (consume >= 0 && consume <= 50) {
                    bill = consume * 3.05;
                } else if (consume <= 100) {
                    bill = (50 * 3.05) + ((consume - 50) * 3.50);
                } else if (consume <= 250) {
                    bill = (50 * 3.05) + (50 * 3.50) + ((consume - 100) * 4.15);
                } else {
                    bill = (50 * 3.05) + (50 * 3.50) + (150 * 4.15) + ((consume - 250) * 5.20);
                }
            } else if (state.equalsIgnoreCase("Haryana")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 2.00;
                } else if (consume <= 150) {
                    bill = (100 * 2.00) + ((consume - 100) * 2.50);
                } else if (consume <= 500) {
                    bill = (100 * 2.00) + (50 * 2.50) + ((consume - 150) * 5.25);
                } else {
                    bill = (100 * 2.00) + (50 * 2.50) + (350 * 5.25) + ((consume - 500) * 7.10);
                }
            } else if (state.equalsIgnoreCase("Himachal Pradesh")) {
                found = true;
                if (consume >= 0 && consume <= 125) {
                    bill = consume * 0.00;
                } else if (consume <= 300) {
                    bill = (125 * 0.00) + ((consume - 125) * 3.95);
                } else {
                    bill = (125 * 0.00) + (175 * 3.95) + ((consume - 300) * 5.45);
                }
            } else if (state.equalsIgnoreCase("Jharkhand")) {
                found = true;
                if (consume >= 0 && consume <= 125) {
                    bill = consume * 0.00;
                } else {
                    bill = (125 * 0.00) + ((consume - 125) * 6.25);
                }
            } else if (state.equalsIgnoreCase("Karnataka")) {
                found = true;
                if (consume >= 0 && consume <= 200) {
                    bill = consume * 0.00;
                } else {
                    bill = (200 * 0.00) + ((consume - 200) * 7.00); // Using 7.00 flat over limit
                }
            } else if (state.equalsIgnoreCase("Kerala")) {
                found = true;
                if (consume >= 0 && consume <= 50) {
                    bill = consume * 3.25;
                } else if (consume <= 100) {
                    bill = (50 * 3.25) + ((consume - 50) * 4.05);
                } else if (consume <= 150) {
                    bill = (50 * 3.25) + (50 * 4.05) + ((consume - 100) * 5.10);
                } else if (consume <= 200) {
                    bill = (50 * 3.25) + (50 * 4.05) + (50 * 5.10) + ((consume - 150) * 6.70);
                } else if (consume <= 250) {
                    bill = (50 * 3.25) + (50 * 4.05) + (50 * 5.10) + (50 * 6.70) + ((consume - 200) * 7.90);
                } else {
                    bill = (50 * 3.25) + (50 * 4.05) + (50 * 5.10) + (50 * 6.70) + (50 * 7.90) + ((consume - 250) * 8.50);
                }
            } else if (state.equalsIgnoreCase("Madhya Pradesh")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 4.95;
                } else if (consume <= 300) {
                    bill = (100 * 4.95) + ((consume - 100) * 6.45);
                } else {
                    bill = (100 * 4.95) + (200 * 6.45) + ((consume - 300) * 6.65);
                }
            } else if (state.equalsIgnoreCase("Maharashtra")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 4.43;
                } else if (consume <= 300) {
                    bill = (100 * 4.43) + ((consume - 100) * 9.64);
                } else if (consume <= 500) {
                    bill = (100 * 4.43) + (200 * 9.64) + ((consume - 300) * 12.83);
                } else {
                    bill = (100 * 4.43) + (200 * 9.64) + (200 * 12.83) + ((consume - 500) * 14.33);

                }
            } else if (state.equalsIgnoreCase("Manipur")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 5.90;
                } else if (consume <= 200) {
                    bill = (100 * 5.90) + ((consume - 100) * 6.90);
                } else {
                    bill = (100 * 5.90) + (100 * 6.90) + ((consume - 200) * 8.00);
                }
            } else if (state.equalsIgnoreCase("Meghalaya")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 3.85;
                } else if (consume <= 200) {
                    bill = (100 * 3.85) + ((consume - 100) * 4.40);
                } else {
                    bill = (100 * 3.85) + (100 * 4.40) + ((consume - 200) * 5.50);
                }
            } else if (state.equalsIgnoreCase("Mizoram")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 4.20;
                } else if (consume <= 200) {
                    bill = (100 * 4.20) + ((consume - 100) * 5.40);
                } else {
                    bill = (100 * 4.20) + (100 * 5.40) + ((consume - 200) * 6.80);
                }
            } else if (state.equalsIgnoreCase("Nagaland")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 4.60;
                } else if (consume <= 200) {
                    bill = (100 * 4.60) + ((consume - 100) * 5.50);
                } else {
                    bill = (100 * 4.60) + (100 * 5.50) + ((consume - 200) * 7.00);
                }
            } else if (state.equalsIgnoreCase("Odisha")) {
                found = true;
                if (consume >= 0 && consume <= 50) {
                    bill = consume * 3.00;
                } else if (consume <= 200) {
                    bill = (50 * 3.00) + ((consume - 50) * 4.80);
                } else if (consume <= 400) {
                    bill = (50 * 3.00) + (150 * 4.80) + ((consume - 200) * 5.80);
                } else {
                    bill = (50 * 3.00) + (150 * 4.80) + (200 * 5.80) + ((consume - 400) * 6.20);
                }
            } else if (state.equalsIgnoreCase("Punjab")) {
                found = true;
                if (consume >= 0 && consume <= 300) {
                    bill = consume * 0.00;
                } else if (consume <= 500) {
                    bill = (300 * 0.00) + ((consume - 300) * 6.75);
                } else {
                    bill = (300 * 0.00) + (200 * 6.75) + ((consume - 500) * 7.75);
                }
            } else if (state.equalsIgnoreCase("Rajasthan")) {
                found = true;
                if (consume >= 0 && consume <= 50) {
                    bill = consume * 4.75;
                } else if (consume <= 150) {
                    bill = (50 * 4.75) + ((consume - 50) * 6.50);
                } else if (consume <= 300) {
                    bill = (50 * 4.75) + (100 * 6.50) + ((consume - 150) * 7.35);
                } else if (consume <= 500) {
                    bill = (50 * 4.75) + (100 * 6.50) + (150 * 7.35) + ((consume - 300) * 7.65);
                } else {
                    bill = (50 * 4.75) + (100 * 6.50) + (150 * 7.35) + (200 * 7.65) + ((consume - 500) * 7.95);
                }
            } else if (state.equalsIgnoreCase("Sikkim")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 2.25;
                } else if (consume <= 200) {
                    bill = (100 * 2.25) + ((consume - 100) * 3.50);
                } else {
                    bill = (100 * 2.25) + (100 * 3.50) + ((consume - 200) * 4.50);
                }
            } else if (state.equalsIgnoreCase("Tamil Nadu")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 0.00;
                } else if (consume <= 200) {
                    bill = (100 * 0.00) + ((consume - 100) * 2.25);
                } else if (consume <= 400) {
                    bill = (100 * 0.00) + (100 * 2.25) + ((consume - 200) * 4.50);
                } else if (consume <= 500) {
                    bill = (100 * 0.00) + (100 * 2.25) + (200 * 4.50) + ((consume - 400) * 6.00);
                } else {
                    bill = (100 * 0.00) + (100 * 2.25) + (200 * 4.50) + (100 * 6.00) + ((consume - 500) * 8.00);
                }
            } else if (state.equalsIgnoreCase("Telangana")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 1.95;
                } else if (consume <= 200) {
                    bill = (100 * 1.95) + ((consume - 100) * 3.60);
                } else {
                    bill = (100 * 1.95) + (100 * 3.60) + ((consume - 200) * 8.00);
                }
            } else if (state.equalsIgnoreCase("Tripura")) {
                found = true;
                if (consume >= 0 && consume <= 50) {
                    bill = consume * 3.90;
                } else if (consume <= 150) {
                    bill = (50 * 3.90) + ((consume - 50) * 5.10);
                } else {
                    bill = (50 * 3.90) + (100 * 5.10) + ((consume - 150) * 6.30);
                }
            } else if (state.equalsIgnoreCase("Uttar Pradesh")) {
                found = true;
                if (consume >= 0 && consume <= 150) {
                    bill = consume * 5.50;
                } else if (consume <= 300) {
                    bill = (150 * 5.50) + ((consume - 150) * 6.00);
                } else {
                    bill = (150 * 5.50) + (150 * 6.00) + ((consume - 300) * 6.50);
                }
            } else if (state.equalsIgnoreCase("Uttarakhand")) {
                found = true;
                if (consume >= 0 && consume <= 100) {
                    bill = consume * 3.25;
                } else if (consume <= 200) {
                    bill = (100 * 3.25) + ((consume - 100) * 4.60);
                } else if (consume <= 400) {
                    bill = (100 * 3.25) + (100 * 4.60) + ((consume - 200) * 6.10);
                } else {
                    bill = (100 * 3.25) + (100 * 4.60) + (200 * 6.10) + ((consume - 400) * 6.85);
                }
            } else if (state.equalsIgnoreCase("West Bengal")) {
                found = true;
                if (consume >= 0 && consume <= 102) {
                    bill = consume * 5.30;
                } else if (consume <= 180) {
                    bill = (102 * 5.30) + ((consume - 102) * 5.97);
                } else if (consume <= 300) {
                    bill = (102 * 5.30) + (78 * 5.97) + ((consume - 180) * 6.97);
                } else {
                    bill = (102 * 5.30) + (78 * 5.97) + (120 * 6.97) + ((consume - 300) * 8.80);
                }
            }

            if (found) {
                System.out.println("======================");
                System.out.println("====Customer Recipt====");
                System.out.println("Youre name : " +name);
                System.out.println("Electricity Bill = " + bill);
                break;
            } else {
                System.out.println("State not found.");
            }


        }

    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Andhra Pradesh");
        list.add("Arunachal Pradesh");
        list.add("Assam");
        list.add("Bihar");
        list.add("Chhattisgarh");
        list.add("Goa");
        list.add("Gujarat");
        list.add("Haryana");
        list.add("Himachal Pradesh");
        list.add("Jharkhand");
        list.add("Karnataka");
        list.add("Kerala");
        list.add("Madhya Pradesh");
        list.add("Maharashtra");
        list.add("Manipur");
        list.add("Meghalaya");
        list.add("Mizoram");
        list.add("Nagaland");
        list.add("Odisha");
        list.add("Punjab");
        list.add("Rajasthan");
        list.add("Sikkim");
        list.add("Tamil Nadu");
        list.add("Telangana");
        list.add("Tripura");
        list.add("Uttar Pradesh");
        list.add("Uttarakhand");
        list.add("West Bengal");

        calculator(list);
    }
}
