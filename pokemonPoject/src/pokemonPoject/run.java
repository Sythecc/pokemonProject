package pokemonPoject;


public class run {

	public static void main(String[] args) throws Exception {
		initPokemon.initPokemon();
		initMoves.initMoves();
		//pokedex.getMon(666);
		//pokedex.getMon("Pikachu");
		//movedex.getMove("Nuzzle");
		wildPokemon test = new wildPokemon(pokedex.getMon(445));
		System.out.println(test);
	}

}
