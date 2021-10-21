package SRP;

public class calculoTotal {

	public float calcTotal(float billAmount,float billDeduction, float VAT,String code) {
		if (code.compareTo("0")!=0) {
			return (billAmount - billDeduction) + VAT;
		}else {
			return (billAmount- billDeduction);
		}
		
	}

}