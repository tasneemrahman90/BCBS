package finalvariable;

public class TestDriveWay {

	public static void main(String[] args) {
		DriveWay dave = new DriveWay();
		int sizePrevious = dave.driveWaySize;
		System.out.println(sizePrevious);
		
		DriveWay susan = new DriveWay();
		System.out.println(susan.driveWaySize);
		int sizeCurrent = susan.driveWaySize;
		System.out.println(sizeCurrent);
		System.out.println(dave.driveWaySize);
		
		

	}

}
