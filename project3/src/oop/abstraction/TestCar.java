package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		
		MotorEngineCar toyotaCorolla = new MotorEngineCar();
		toyotaCorolla.buildEngine();
		
		Car nissanPathfinder = new MotorEngineCar();
		nissanPathfinder.carShape();
		
		MotorCar bmwSeries5 = new MotorEngineCar();
		bmwSeries5.drive();

	}

}
