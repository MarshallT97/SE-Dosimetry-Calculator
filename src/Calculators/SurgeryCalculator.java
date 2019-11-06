package Calculators;
import Core.PatientData;


public class SurgeryCalculator extends Calculator {
	
	public SurgeryCalculator(PatientData pt){
		super(pt);
	}
	
	//calculate and set treatment in PatientData object "Patient"
	public void CalculateTreatment() {
		
		if(Patient.GetAge() >= 75) {
			// Risk increased  due to older age
			
		}
		
		if(Patient.GetCancerStage() == 1) {
			System.out.println("Low Risk: Highly curable with Curative removal surgery by itself");
		} else if(Patient.GetCancerStage() == 2) {
			System.out.println("Low/Medium Risk: Small amounts of radiation first to shrink the tumor then Curative surgery");
		} else if(Patient.GetCancerStage() == 3) {
			System.out.println("Medium Risk: larger amounts of radiation and/or Chemptherapy required to shrink"
					+ " the tumor before removal surgery is possible");
		} else if(Patient.GetCancerStage() == 4) {
			System.out.println("High Risk: Chemotherapy to stop the cancer from spreading further");
		}
	}


}
