package DIP;

import java.util.HashMap;
//A
public class Student {
	public String name;
	public String sex;
	public String year;
// matrikulatuta dagoen espedientea
	public HashMap<String, Integer> subjectRecord;
// ikasleak ordaindu behar duena
	public String toCharge;

// Irakasgai batean matrikulatzen duen metodoa.
	public void register(String subject, PreconditionsAbstraction p,DeductionAbstraction d,SubjectQuotesAbstraction sq) {
// Aurrebaldintzak konprobatzen dira
		boolean isPosible = p.isPossible(subject, subjectRecord);
		if (isPosible) {
			// Dedukzioa kalkulatu sex eta edadearen arabera
			int percentage = d.calcDeduction(sex, year);
// Irakasgaiaren prezioa lortu
			int quote = sq.getPrice(subject);
			// HashMap batean gordetzen du eta ordaindu behar duen balioa eguneratu
			subjectRecord.put(subject, null);
			toCharge = toCharge + (quote - percentage * quote / 100);
		}
	}
}