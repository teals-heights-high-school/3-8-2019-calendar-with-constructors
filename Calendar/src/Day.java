import java.util.ArrayList;

public class Day {
	private final int NUMBER_OF_SLOTS = 48;
	public ArrayList<Appointment> appointments;
	
	public Day() {
		appointments = new ArrayList<Appointment>();
		for(int index = 0; index < NUMBER_OF_SLOTS; index++) {
			appointments.add(new Appointment("N/A"));
		}
	}
	
	public void displaySchedule() {
		for(int index = 0; index < NUMBER_OF_SLOTS; index++) {
			Appointment appointment = appointments.get(index);
			System.out.println("Index: " + index + " | Name: " + appointment.name + " | Is Available: " + appointment.isAvailable);
		}
	}
}