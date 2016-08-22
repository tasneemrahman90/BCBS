package packageEMR;

public class TestEMR {

	public static void main(String[] args) {
		
		EMR pt1 = new EMR();
		pt1.setPatientName("John Doe");
		pt1.setSsn(105880168);
		pt1.setDob("05/05/1995");
		pt1.setBloodPressure("120/80");
		pt1.setPulse(76);
		pt1.setTemp(98.6);
		
		pt1.createBasicInfo();
			System.out.println("The patient's name is " + pt1.getPatientName() + ", the patient's SSN is " + pt1.getSsn() + ", and the patient's DOB is " + pt1.getDob() + "." + "\n");
		pt1.createVitals();
			System.out.println(pt1.getPatientName() + "'s BP is " + pt1.getBloodPressure() + ", pulse is " + pt1.getPulse() + ", and temperature is " + pt1.getTemp() + "." + "\n");
		
		System.out.println("Nurse's instructions: ");
		Glucose glucoseCheck = new Glucose();
			glucoseCheck.createGlucoseLevel();
		
		Lifestyle lifestyleCheck = new Lifestyle();
			lifestyleCheck.createLifestyle();
		
		Emergency notice = new Emergency(); 
		notice.createEmergencyNotice();	
		
	}

}
