package oop.polymorphism;

public class AreaOfLand {
	
	public int calculateLandSize(int a, int b){
		int total = a + b;
		return total;
	}
	public int calculateLandSize(int a, int b, int c){
		int total = a + b + c;
		return total;
	}
	public int calculateLandSize(int a, int b, int c, int d){
		int total = a + b + c + d;
		return total;
	}

}
