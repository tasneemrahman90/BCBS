package packageEMR;

public class EMR {
	
	private String patientName; 
	private int ssn;
	private String dob; 
	private String bloodPressure;
	private int pulse; 
	private double temp;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public int getPulse(){
		return pulse;
	}
	public void setPulse(int pulse) {
		this.pulse = pulse; 
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public void createBasicInfo(){
		System.out.println("This section is for basic patient info:");
	}
	
	public void createVitals(){
		System.out.println("This section is for patient vitals:");
	}

}
