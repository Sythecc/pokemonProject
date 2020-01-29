package pokemonPoject;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class party {
	private static List<pokemon> party = new ArrayList<pokemon>(5);

	public party() {

	}

	public static void addMon(pokemon mon) {
		party.add(mon);
	}

	public static pokemon getMon(int num) {
		num--;
		return party.get(num);
	}

	public static pokemon getMon(String name) {
		for (pokemon mon : party) {
			String monName = mon.getName();
			if (monName.toLowerCase().equals(name.toLowerCase())) {
				return mon;
			}
		}
		return null;
	}
}
