package pokemonPoject;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class caughtPokemon extends pokemon {
	private ArrayList<move> moves = new ArrayList<move>(3);
	private ArrayList<Integer> pp = new ArrayList<Integer>(3);
	private int currentHp;

	public caughtPokemon(pokemon mon, move move0, move move1, move move2, move move3) {
		super(mon.getName(), mon.getType1(), mon.getType2(), mon.getNum(), mon.getHp(), mon.getPhsAtk(),
				mon.getPhsDef(), mon.getSpAtk(), mon.getSpDef(), mon.getSpeed());
		this.currentHp = mon.getHp();
		setMoves(move0, move1, move2, move3);
	}

	private void setMoves(move move0, move move1, move move2, move move3) {
		this.moves.add(move0);
		this.pp.add(move0.getPp());
		this.moves.add(move1);
		this.pp.add(move1.getPp());
		this.moves.add(move2);
		this.pp.add(move2.getPp());
		this.moves.add(move3);
		this.pp.add(move3.getPp());

	}

	public String toString() {
		return super.toString() + "Move0 :" + moves.get(0) + " PP : " + pp.get(0) + "\n" + "Move1 :" + moves.get(1)
				+ " PP : " + pp.get(1) + "\n" + "Move2 :" + moves.get(2) + " PP : " + pp.get(2) + "\n" + "Move3 :"
				+ moves.get(3) + " PP : " + pp.get(3);

	}
}
