package RoomBooking;
import java.util.List;
import java.util.Scanner;
public class RoomView {
	 public void printRoomDetails(List<Room> rooms) {
	        System.out.println("Room Number\tRoom Type\tRoom Price\tAvailability");
	        for (Room room : rooms) {
	            System.out.println(room.getRoomNumber() + "\t\t" + room.getRoomType() + "\t\t" + room.getRoomPrice() + "\t\t" + (room.isAvailable() ? "Available" : "Booked"));
	        }
	    }

	    public void printBookingConfirmation(Room room) {
	        System.out.println("Your booking is confirmed for Room Number " + room.getRoomNumber() + "!");
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        RoomController roomController = new RoomController();

	         
	        roomController.addRoom(new Room(101, "Single ", 500.00, true));
	        roomController.addRoom(new Room(102, "Single", 500.00, true));
	        roomController.addRoom(new Room(103, "Double", 1500.00, true));
	        roomController.addRoom(new Room(104, "Double", 1500.00, true));
	        roomController.addRoom(new Room(105, "Family", 2000.00, true));
	        roomController.addRoom(new Room(106, "Family", 2000.00, true));

	        
	        while (true) {
	            System.out.println("Welcome to the Hotel Booking System!");
	            System.out.println("1. Show Room Details");
	            System.out.println("2. Book a Room");
	            System.out.println("3. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    roomController.showRoomDetails();
	                    break;
	                case 2:
	                    System.out.println("Enter Room Number:");
	                    int roomNumber = scanner.nextInt();
	                    roomController.bookRoom(roomNumber);
	                    break;
	                case 3:
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }

	}


