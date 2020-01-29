package pokemonPoject;

@SuppressWarnings("unused")
public class run {

	public static void main(String[] args) throws Exception {
		initPokemon.initPokemon();
		initMoves.initMoves();
		// pokedex.getMon(666);
		// pokedex.getMon("Pikachu");
		// movedex.getMove("Nuzzle");
		wildPokemon test = new wildPokemon(pokedex.getMon(445));
		System.out.println(test);
		caughtPokemon caught1 = new caughtPokemon(test, test.getMove0(), test.getMove1(), test.getMove2(),
				test.getMove3());
		party.addMon(caught1);
		System.out.println(party.getMon(0));
	}

}
