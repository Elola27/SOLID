package DIP;

import java.util.HashMap;

public class Preconditions implements PreconditionsAbstraction{
	@Override
	public boolean isPossible(String subject,HashMap<String,Integer> records) {
		return true;
	}

}
