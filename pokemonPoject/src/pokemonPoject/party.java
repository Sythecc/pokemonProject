package pokemonPoject;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class party {
	private static List<caughtPokemon> party = new ArrayList<caughtPokemon>(5);

	public party() {

	}

	public static void addMon(caughtPokemon mon) {
		party.add(mon);
	}

	public static caughtPokemon getMon(int num) {
		return party.get(num);
	}

	public static caughtPokemon getMon(String name) {
		for (caughtPokemon mon : party) {
			String monName = mon.getName();
			if (monName.toLowerCase().equals(name.toLowerCase())) {
				return mon;
			}
		}
		return null;
	}
}
