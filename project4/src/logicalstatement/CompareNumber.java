package logicalstatement;

public class CompareNumber {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 30;
		
		if(num1>num2){
			System.out.println(num1 + " is greater than "+ num2);
		}else if(num1<num2) {
			System.out.println(num1 + " is smaller than "+ num2);
		}else if(num1==num2) {
			System.out.println(num1 + " is equals to "+ num2);
		}
	}
}

