package pokemonPoject;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class party {
	private static ArrayList<caughtPokemon> party = new ArrayList<caughtPokemon>(5);
	
	public static void addMon(caughtPokemon mon) {
		if(party.size()<6) {
		party.add(mon);
		}else {
			System.out.println("You already have 6 monsters in your party!");
		}
	}

	public static caughtPokemon getMon(int num) {
		return party.get(num);
	}
	
	public static ArrayList<caughtPokemon> getParty() {
		return party;
	}
}
