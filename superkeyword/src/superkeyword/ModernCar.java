package superkeyword;

public class ModernCar extends Car{
	int run = super.milesItCanRun;
	
	public ModernCar(String model){
		super(model);
	}
	
	public void fuelType(){
		super.runOnElectricBattery();
		System.out.println("more efficient");
		
	}

}
