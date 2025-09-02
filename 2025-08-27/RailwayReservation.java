import java.util.Scanner;

public class RailwayReservation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int seats = 5;   
        int waiting = 3; 
        int bookedSeats = 0;
        int waitingList = 0;

        System.out.println("=== Welcome to Railway Reservation System ===");
        System.out.println("Choose Train: ");
        System.out.println("1. Express Train (Fare: 500)");
        System.out.println("2. Superfast Train (Fare: 800)");
        System.out.println("3. Luxury Train (Fare: 1200)");

        int choice = sc.nextInt();
        int fare = 0;

        
        switch (choice) {
            case 1:
                fare = 500;
                System.out.println("You selected Express Train (Fare: " + fare + ")");
                break;
            case 2:
                fare = 800;
                System.out.println("You selected Superfast Train (Fare: " + fare + ")");
                break;
            case 3:
                fare = 1200;
                System.out.println("You selected Luxury Train (Fare: " + fare + ")");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Express Train.");
                fare = 500;
        }

        
        char moreBooking;
        do {
            System.out.print("\nEnter number of passengers you want to book: ");
            int numPassengers = sc.nextInt();

         
            for (int i = 1; i <= numPassengers; i++) {
                System.out.print("Enter Passenger " + i + " Name: ");
                String name = sc.next();

              
                if (bookedSeats < seats) {
                    bookedSeats++;
                    System.out.println("✅ Seat confirmed for " + name + ". Seat No: " + bookedSeats + " | Fare: " + fare);
                } 
                
                else if (waitingList < waiting) {
                    waitingList++;
                    System.out.println("⚠ " + name + " is on Waiting List. Position: " + waitingList);
                } 
                
                else {
                    System.out.println("❌ Sorry " + name + ", No seats/waiting list available.");
                }
            }

            System.out.print("\nDo you want to make another booking? (y/n): ");
            moreBooking = sc.next().charAt(0);

        } while (moreBooking == 'y' || moreBooking == 'Y');

        System.out.println("\n=== Booking Summary ===");
        System.out.println("Total Confirmed Seats: " + bookedSeats);
        System.out.println("Total Waiting List: " + waitingList);
        System.out.println("Thank you for using Railway Reservation System!");

        sc.close();
    }
}


