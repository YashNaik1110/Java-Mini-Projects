import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// -------------------- Car Class --------------------
class Car {
    private String carId;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double pricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public double calculatePrice(int days) {
        return pricePerDay * days;
    }
}

// -------------------- Customer Class --------------------
class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

// -------------------- Rental Class --------------------
class Rental {
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}

// -------------------- Car Rental System --------------------
class CarRentalSystem {

    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer, int days) {
        car.rent();
        rentals.add(new Rental(car, customer, days));
    }

    public void returnCar(Car car) {

        Rental rentalToRemove = null;

        for (Rental rental : rentals) {
            if (rental.getCar().equals(car)) {
                rentalToRemove = rental;
                break;
            }
        }

        if (rentalToRemove != null) {
            rentals.remove(rentalToRemove);
            car.returnCar();
            System.out.println("\nCar returned successfully!");
        } else {
            System.out.println("This car was not rented.");
        }
    }

    public void menu() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===============================");
            System.out.println("     CAR RENTAL SYSTEM");
            System.out.println("===============================");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("\nEnter Your Name: ");
                    String customerName = sc.nextLine();

                    System.out.println("\nAvailable Cars:");

                    for (Car car : cars) {
                        if (car.isAvailable()) {
                            System.out.println(car.getCarId() + " - " +
                                    car.getBrand() + " " + car.getModel());
                        }
                    }

                    System.out.print("\nEnter Car ID: ");
                    String carId = sc.nextLine();

                    Car selectedCar = null;

                    for (Car car : cars) {
                        if (car.getCarId().equalsIgnoreCase(carId)
                                && car.isAvailable()) {
                            selectedCar = car;
                            break;
                        }
                    }

                    if (selectedCar == null) {
                        System.out.println("Car not available.");
                        break;
                    }

                    System.out.print("Enter Number of Rental Days: ");
                    int days = sc.nextInt();
                    sc.nextLine();

                    Customer customer = new Customer("CUS" + (customers.size() + 1),
                            customerName);

                    addCustomer(customer);

                    double totalPrice = selectedCar.calculatePrice(days);

                    System.out.println("\n========== Rental Summary ==========");
                    System.out.println("Customer ID : " + customer.getCustomerId());
                    System.out.println("Customer Name : " + customer.getName());
                    System.out.println("Car : " + selectedCar.getBrand() + " " + selectedCar.getModel());
                    System.out.println("Rental Days : " + days);
                    System.out.println("Total Price : ₹" + totalPrice);

                    System.out.print("\nConfirm Rental (Y/N): ");
                    String confirm = sc.nextLine();

                    if (confirm.equalsIgnoreCase("Y")) {
                        rentCar(selectedCar, customer, days);
                        System.out.println("Car Rented Successfully!");
                    } else {
                        System.out.println("Rental Cancelled.");
                    }

                    break;

                case 2:

                    System.out.print("\nEnter Car ID to Return: ");
                    String returnId = sc.nextLine();

                    Car returnCar = null;

                    for (Car car : cars) {
                        if (car.getCarId().equalsIgnoreCase(returnId)
                                && !car.isAvailable()) {
                            returnCar = car;
                            break;
                        }
                    }

                    if (returnCar != null) {
                        returnCar(returnCar);
                    } else {
                        System.out.println("Invalid Car ID or Car is already available.");
                    }

                    break;

                case 3:

                    System.out.println("\nThank You for using Car Rental System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}

// -------------------- Main Class --------------------
public class Main {

    public static void main(String[] args) {

        CarRentalSystem rentalSystem = new CarRentalSystem();

        rentalSystem.addCar(new Car("C001", "Toyota", "Camry", 3000));
        rentalSystem.addCar(new Car("C002", "Honda", "City", 2500));
        rentalSystem.addCar(new Car("C003", "Mahindra", "Thar", 5000));
        rentalSystem.addCar(new Car("C004", "Hyundai", "Creta", 3500));
        rentalSystem.addCar(new Car("C005", "Tata", "Harrier", 4000));

        rentalSystem.menu();
    }
}