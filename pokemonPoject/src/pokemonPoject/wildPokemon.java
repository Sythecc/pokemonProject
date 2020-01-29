package pokemonPoject;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class wildPokemon extends pokemon {
	private ArrayList<move> moves = new ArrayList<move>(3);
	private ArrayList<Integer> pp = new ArrayList<Integer>(3);
	private int currentHp;

	public wildPokemon(pokemon mon) {
		super(mon.getName(), mon.getType1(), mon.getType2(), mon.getNum(), mon.getHp(), mon.getPhsAtk(),
				mon.getPhsDef(), mon.getSpAtk(), mon.getSpDef(), mon.getSpeed());
		this.currentHp = mon.getHp();
		generateMoves();
	}

	private void generateMoves() {
		int moveCount = 0;
		while (moveCount < 4) {
			int moveNum = (int) (Math.random() * (339) + 1);
			move newMove = movedex.getMove(moveNum);
			if (newMove.getType().equals(super.getType1()) || newMove.getType().equals(super.getType2())) {
				if (!moves.contains(newMove)) {
					this.moves.add(newMove);
					this.pp.add(newMove.getPp());
					moveCount++;
				}
			}
		}
	}
	public String toString() {
		return super.toString() +
				"Move0 :" + moves.get(0) + " PP : " +pp.get(0)+ "\n" +
				"Move1 :" + moves.get(1) + " PP : " +pp.get(1)+ "\n" +
				"Move2 :" + moves.get(2) + " PP : " +pp.get(2)+ "\n" +
				"Move3 :" + moves.get(3) + " PP : " +pp.get(3);

	}
}
