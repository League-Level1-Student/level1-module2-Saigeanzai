package _99_extra._04_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		if (isWoman) {
			if (isKnighted) {
				return "Hello Lady " + name;
			}
			return "Hello Ms. " + name;
		}

		if (isKnighted) {
			return "Hello Sir " + name;
		}
		return "Hello Mr. " + name;
	}
}
