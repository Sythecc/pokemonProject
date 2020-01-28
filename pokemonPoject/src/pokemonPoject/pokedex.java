package pokemonPoject;

import java.util.ArrayList;
import java.util.List;

public class pokedex {
	private static List<pokemon> pokedex = new ArrayList<pokemon>();

	public pokedex() {
		
	}
	
	public static void addMon(pokemon mon){
		pokedex.add(mon);
	}
	
	public static void getMon(int num) {
		num--;
		System.out.println(pokedex.get(num));
	}
}
