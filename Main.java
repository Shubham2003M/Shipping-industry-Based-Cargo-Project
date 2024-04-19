import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the city");
        String city = sc.nextLine();
        System.out.println("Enter the number of Ships per day");
        Integer noOfShips = sc.nextInt();
        System.out.println("Enter the number of passengers travelling in each Ship");
        Integer noOfPassengers = sc.nextInt();
        System.out.println("Enter the number of cargo units shipped in each Ship");
        Integer noOfCargoUnitsPerFlight = sc.nextInt();

        CommercialServiceShipping commercialServiceShipping = new CommercialServiceShipping(name, city, noOfShips, noOfPassengers);
        CargoServiceTransport cargoServiceTransport = new CargoServiceTransport(name, city, noOfShips, 1, noOfCargoUnitsPerFlight);

        System.out.println("shipping Details");
        System.out.println("Number of passengers travelled/day:" + commercialServiceShipping.calculatenoOfPassengers());
        System.out.println("Number of cargo units shipped/day:" + cargoServiceTransport.calculatenoOfCargounits());
        
        sc.close();
    }
}
