public class Run {
	public static void main(String[] args) {
		//create a schedule for a week
		//this creates all of our days and appointments as well via the constructors
		Week week = new Week();
		//we can verify this by displaying the current appointments
		System.out.println("Monday Appointments");
		week.monday.displaySchedule();
		//now let's add an appointment for Wednesday
		Appointment doctorVisit = new Appointment("Doctor");
		doctorVisit.isAvailable = false;
		week.wednesday.appointments.set(15, doctorVisit);
		//let's make sure that our week updated correctly by displaying Wednesday's appointments
		System.out.println("Wednesday Appointments");
		week.wednesday.displaySchedule();
	}
}
