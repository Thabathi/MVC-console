package RoomBooking;
	import java.util.ArrayList;
	import java.util.List;

	public class RoomController {
	    private List<Room> rooms = new ArrayList<>();
	    private RoomView roomView = new RoomView();

	    public void addRoom(Room room) {
	        rooms.add(room);
	    }

	    public void bookRoom(int roomNumber) {
	        for (Room room : rooms) {
	            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
	                room.setAvailable(false);
	                roomView.printBookingConfirmation(room);
	                return;
	            }
	        }
	        System.out.println("Sorry, the room is not available for booking.");
	    }

	    public void showRoomDetails() {
	        roomView.printRoomDetails(rooms);
	    }
	}



