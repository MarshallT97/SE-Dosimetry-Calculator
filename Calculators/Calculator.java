package Calculators;
import Core.PatientData;

public abstract class Calculator { 
	
	protected PatientData Patient;
	
	protected Calculator(PatientData pt){
		this.Patient = pt;
	}
	
	//to be overridden by children
	protected abstract void CalculateTreatment();
	
	//rounds number to 2 decimal places
	protected double TwoDecimalRound(double number) {
		number = Math.round(number * 100);
		number = number/100;
		return number;
	}
}