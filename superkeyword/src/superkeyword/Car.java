package superkeyword;

public class Car {
	String model;
	int milesItCanRun = 220;
	
	public Car(String model){
		this.model = model;
		System.out.println(model);
	}

	public void runOnElectricBattery(){
		System.out.println("Engine run by electric battery");
	}
}
