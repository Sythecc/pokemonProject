package pokemonPoject;

@SuppressWarnings("unused")
public class run {

	public static void main(String[] args) throws Exception {
		initPokemon.initPokemon();
		initMoves.initMoves();
		//System.out.println(pokedex.getMon(6));
		// pokedex.getMon("Pikachu");
		// movedex.getMove("Nuzzle");
		//wildPokemon test = new wildPokemon(pokedex.getMon(445));
		//System.out.println(test);
		wildPokemon.createRandomWildPokemon();
		caughtPokemon caught1 = new caughtPokemon(wildPokemon.getMostRecentWildMon());
		party.addMon(caught1);
		wildPokemon.createRandomWildPokemon();
		caught1 = new caughtPokemon(wildPokemon.getMostRecentWildMon());
		party.addMon(caught1);
		initBattle.initBattle();
		
	}

}
