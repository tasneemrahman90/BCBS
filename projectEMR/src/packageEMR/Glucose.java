package packageEMR;

public class Glucose {
	
	int glucoseLevel = 219;
	
	public void createGlucoseLevel(){
		
		if (glucoseLevel < 65) {
			System.out.println("Patient's glucose is too low. Give one glass of orange juice stat.");}
		else if (glucoseLevel >= 65 && glucoseLevel <= 100) {
			System.out.println("Patient's glucose levels are normal."); }
		else if (glucoseLevel > 100 && glucoseLevel <= 200) {
			System.out.println("Administer 1 tab Metformin."); }
		else if (glucoseLevel > 200 && glucoseLevel <= 400) {
			System.out.println("Administer 2 tabs Metformin."); }
		else if (glucoseLevel > 400) {
			System.out.println("Administer 3 tabs Metformin and call M.D. stat. "); }	
	}
	}


