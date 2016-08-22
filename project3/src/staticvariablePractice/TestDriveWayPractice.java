package staticvariablePractice;

public class TestDriveWayPractice {

	public static void main(String[] args) {
		DriveWayPractice dave = new DriveWayPractice();
		dave.driveWaySize = 9;
		System.out.println("Dave "+dave.driveWaySize);
		
		DriveWayPractice susan = new DriveWayPractice();
		System.out.println("Susan " +susan.driveWaySize);
		
		System.out.println("After drive way size changes ");
		susan.driveWaySize = 13;
		
		System.out.println("Dave " + dave.driveWaySize);
		
		System.out.println("Susan " +susan.driveWaySize);
		

	}

}