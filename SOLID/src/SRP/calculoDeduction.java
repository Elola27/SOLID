package SRP;

public class calculoDeduction {

	public float calcDeduction(float billAmount,float deductionPercentage) {
		if (billAmount>5000) {
			return (billAmount*deductionPercentage + 5 ) / 100;
		}
		else {
			return (billAmount * deductionPercentage) / 100;
		}
	}

}
