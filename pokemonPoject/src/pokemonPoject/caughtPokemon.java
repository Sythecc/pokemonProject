package pokemonPoject;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class caughtPokemon extends pokemon {
	private ArrayList<move> moves = new ArrayList<move>(3);
	private int currentHp;
	private int move0pp;
	private int move1pp;
	private int move2pp;
	private int move3pp;

	public caughtPokemon(pokemon mon, move move0, move move1, move move2, move move3) {
		super(mon.getName(), mon.getType1(), mon.getType2(), mon.getNum(), mon.getHp(), mon.getPhsAtk(),
				mon.getPhsDef(), mon.getSpAtk(), mon.getSpDef(), mon.getSpeed());
		this.currentHp = mon.getHp();
		setMoves(move0, move1, move2, move3);
	}

	public void setMoves(move move0, move move1, move move2, move move3) {
		moves.set(0, move0);
		move0pp = move0.getPp();
		moves.set(1, move1);
		move1pp = move1.getPp();
		moves.set(2, move2);
		move2pp = move2.getPp();
		moves.set(3, move3);
		move3pp = move3.getPp();
	}
}
