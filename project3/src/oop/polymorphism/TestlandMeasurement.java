package oop.polymorphism;

public class TestlandMeasurement {

	public static void main(String[] args) {
		AreaOfLand size = new AreaOfLand();
		int total1 = size.calculateLandSize(10, 15);
		System.out.println(total1);
		int total2 = size.calculateLandSize(10, 15, 9);
		System.out.println("Area Of Land Calculator measurement: " + total2);
		int total3 = size.calculateLandSize(10, 10, 10,10);
		System.out.println(total3);
		
		ModernCalculator mc = new ModernCalculator();
		int total4 = mc.calculateLandSize(10, 15, 9);
		System.out.println("Modern Calculator measurement: " + total4);
		

	}

}
