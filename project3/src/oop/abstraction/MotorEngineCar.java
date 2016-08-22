package oop.abstraction;

public class MotorEngineCar extends MotorCar implements Car {

	//Car Interface
	public void carShape() {
		System.out.println("car shape should be 5 by 5 feet");	
	}

	public void start() {
		System.out.println("Must have start feature to start the engine");
		
	}

	public void stop() {
		System.out.println("Once you start the car, you must have stop feature implemented");
	}
  
	//MotorCar abstract class
	public void drive() {
		System.out.println("You can drive the car after start the engine");
	}
	
	//Belong to MotorEnginecar
	public void breakPad() {
		System.out.println("Must have break pad to stop the car");
	}
	

}
