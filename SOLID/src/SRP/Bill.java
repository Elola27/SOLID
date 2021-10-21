package SRP;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	

// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		//calculoTotal a=new calculoTotal();
		calculoVAT b=new calculoVAT();
		calculoDeduction c=new calculoDeduction();
// Dedukzioa kalkulatu
		billDeduction=c.calcDeduction(billAmount, deductionPercentage);
		//billDeduction = calcDeduction();
// VAT kalkulatzen dugu
		VAT =b.calcVAT(billAmount);
// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}