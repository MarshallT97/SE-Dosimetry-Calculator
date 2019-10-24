package Calculators;
import Core.PatientData;;

public class RadiationCalculator {

//PatientData object that holds all the patient diagnostic information entered by staff
private PatientData Patient;

//Constructor
RadiationCalculator(PatientData patient){
	this.Patient = patient;
}

//Calculates and sets the radiation dose for the patient 
public void CalculateRadiationDose(String tumorlocation) {
	double riskFactorHeart = 0;
	double riskFactorLungs = 0;
	double riskFactorBrain = 0;
	double riskFactorThyroid = 0;
	double riskFactorKidneys = 0;
	double riskFactorLiver = 0;
	double riskFactorStomach = 0;
	
	double totalDoseLow = 0;
	double totalDoseMed = 0;
	double totalDoseHigh = 0;
	
	double sievertsLow = 9.9;
	double sievertsMed = 19.9;
	double sievertsHigh = 29.9;
	
	double absorbedDoseLow = 0;
	double absorbedDoseMed = 0;
	double absorbedDoseHigh = 0;
	
		
	switch(tumorlocation) 
	{
		case "Heart":
			//low risk
			absorbedDoseLow = (sievertsLow)/((5)*((2*riskFactorHeart)+riskFactorLungs));
			totalDoseLow = absorbedDoseLow*Patient.GetOrganMass();
			
			//medium risk
			
			//high risk
			
		case "Lungs":
			
		case "Brain":
			
		case "Thyroid":
		
		case "Kidneys":
			
		case "Liver":
			
		case "Stomach":
			
	}

	Patient.SetTotalDoseLowRisk(totalDoseLow);
	Patient.SetTotalDoseMedRisk(totalDoseMed);
	Patient.SetTotalDoseHighRisk(totalDoseHigh);
}

}
