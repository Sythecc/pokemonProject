package pokemonPoject;

import java.util.ArrayList;
import java.util.List;

public class movedex {
	private static List<move> movedex = new ArrayList<move>();

	public movedex() {

	}

	public static void addMove(move move) {
		movedex.add(move);
	}

	public static move getMove(int num) {
		num--;
		return movedex.get(num);
	}

	public static move getMove(String name) {
		for (move move : movedex) {
			String moveName = move.getName();
			if (moveName.toLowerCase().equals(name.toLowerCase())) {
				return move;
			}
		}
		return null;
	}
}
