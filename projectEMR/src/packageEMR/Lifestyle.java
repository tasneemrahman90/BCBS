package packageEMR;

public class Lifestyle {

	boolean smoker = true;
	boolean drinker = false;

	public void createLifestyle(){
		if(smoker == true){
			System.out.print("Remind patient about the adverse effects of smoking. ");
		}else if (smoker == false){
			System.out.println("");
		}
		if(drinker == true){
			System.out.println("Remind patient about the adverse effects of drinking.");
		}else if (drinker == false){
			System.out.println("");
		}
}
}
