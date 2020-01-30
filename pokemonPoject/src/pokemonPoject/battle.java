package pokemonPoject;

import java.util.ArrayList;

public class battle {
	private wildPokemon enemy;
	private ArrayList<caughtPokemon> party;

	public battle(ArrayList<caughtPokemon> party) {
		wildPokemon.createRandomWildPokemon();
		enemy = wildPokemon.getMostRecentWildMon();
		this.party = party;
	}

	public boolean isBattleOver() {
		if (enemy.getHp() <= 0) {
			return true;
		} else {
			return false;
		}
	}

	public wildPokemon getEnemy() {
		return enemy;
	}

	public double attack(wildPokemon target, move moveChosen, caughtPokemon mon) {
		// Human Attack
		// Damage = ((((2 * Level / 5 + 2) * AttackStat * AttackPower / DefenseStat) /
		// 50) + 2) * STAB * Weakness/Resistance * RandomNumber / 100
		double damage = 0;
		double STAB = 1;
		if (moveChosen.getType() == mon.getType1() || moveChosen.getType() == mon.getType2()) {
			STAB = 1.5;
		}
		if (Math.random() * 100 > moveChosen.getHitChance()) {
			if (moveChosen.getAtkType() == "Physical") {
				damage = ((((2 * 50 / 5 + 2) * mon.getPhsAtk() * moveChosen.getPower() / target.getPhsDef()) / 50) + 2)
						* STAB * (Math.random() * (100 - 85) + 85) / 100;
			} else {
				damage = ((((2 * 50 / 5 + 2) * mon.getSpAtk() * moveChosen.getPower() / target.getSpDef()) / 50) + 2)
						* STAB * (Math.random() * (100 - 85) + 85) / 100;
			}
		}
		return damage;

	}

	public double attack(caughtPokemon target, move moveChosen, wildPokemon mon) {
		// Bot attack
		double damage = 0;
		double STAB = 1;
		if (moveChosen.getType() == mon.getType1() || moveChosen.getType() == mon.getType2()) {
			STAB = 1.5;
		}
		if (Math.random() * 100 > moveChosen.getHitChance()) {
			if (moveChosen.getAtkType() == "Physical") {
				damage = ((((2 * 50 / 5 + 2) * mon.getPhsAtk() * moveChosen.getPower() / target.getPhsDef()) / 50) + 2)
						* STAB * (Math.random() * (100 - 85) + 85) / 100;
			} else {
				damage = ((((2 * 50 / 5 + 2) * mon.getSpAtk() * moveChosen.getPower() / target.getSpDef()) / 50) + 2)
						* STAB * (Math.random() * (100 - 85) + 85) / 100;
			}
		}
		return damage;
	}

}
