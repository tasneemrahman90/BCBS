package classNobject;

public class TestHouse {
	public static void main(String[] args) {
		 
		House whiteHouse = new House();
		whiteHouse.createBedroom();
		
		whiteHouse.houseName = "President's House";
		System.out.println("The name of the house: " + whiteHouse.houseName);
		
		whiteHouse.address = 52;
		System.out.println("The address of the house: " + whiteHouse.address);
		
		int result = whiteHouse.addTwoNumbers(10, 10);
		System.out.println(result);
		
	} 
	
	}