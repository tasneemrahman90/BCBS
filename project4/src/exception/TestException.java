package exception;

public class TestException {

	public static void main(String[] args) {
		
		int number = 10;
		try{
			
		int result = number/0;
		System.out.println(result);
		
		}catch(Exception ex){
			System.out.println("You can not divide a number by zero, please fix the statement");
		}

	}

}
