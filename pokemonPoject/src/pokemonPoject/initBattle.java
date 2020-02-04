package pokemonPoject;

import java.util.ArrayList;
import java.util.Scanner;

public class initBattle {
	public static void initBattle() {
		// temp input
		Scanner scan = new Scanner(System.in);
		battle newBattle = new battle(party.getParty());
		int monster = 0;
		int moveCounter = 1;
		int hpCounter = 0;
		move moveChosen;
		move enemyMoveChosen;
		double damage = 0;
		System.out.println("You encountered a Wild " + newBattle.getEnemy().getName() + "!!!!");
		System.out.println("You choose " + party.getMon(monster).getName()+"!!!");
		System.out.println("_________________________________");
		while (!newBattle.isBattleOver()) {
			moveCounter = 1;
			for (move move : party.getMon(monster).getMoves()) {
				System.out.println("Move " + moveCounter);
				System.out.println(move);
				System.out.println("_________________________________");
				moveCounter++;
			}
			System.out.println("Pick a move! (1-4)");
			moveChosen = party.getMon(monster).getMove(scan.nextInt() - 1);
			// if enemy is slower
			if (newBattle.getEnemy().getSpeed() < party.getMon(monster).getSpeed()) {
				// damage of enemy by chosenmove of mon
				damage = newBattle.attack(newBattle.getEnemy(), moveChosen, party.getMon(monster));
				// store inititial hp
				hpCounter = newBattle.getEnemy().getHp();
				// deal damage
				newBattle.getEnemy().dealDamage(damage);
				// sysout damage log
				System.out.println("Your " + party.getMon(monster).getName() + " used " + moveChosen.getName() + " and did "
						+ (int) damage + " damage!");
				System.out.println("The wild " + newBattle.getEnemy().getName() + " went from " + hpCounter + " hp to "
						+ newBattle.getEnemy().getHp() + " hp!");
				// if he aint dead
				if (newBattle.getEnemy().getHp() > 0) {
					// chose a move
					enemyMoveChosen = newBattle.getEnemy().getMove((int) Math.random() * 3 + 1);
					// calc damage
					damage = newBattle.attack(party.getMon(monster), enemyMoveChosen, newBattle.getEnemy());
					// store inititial hp
					hpCounter = party.getMon(monster).getHp();
					// deal damage
					party.getMon(monster).dealDamage(damage);
					// sysout damage log
					System.out.println("The wild " + newBattle.getEnemy().getName() + " used " + enemyMoveChosen.getName() + " and did "
							+ (int) damage + " damage!");
					System.out.println("Your " + party.getMon(monster).getName() + " went from " + hpCounter + " hp to "
							+ party.getMon(monster).getHp() + " hp!");
				}
				// if you are slower
			} else {
				// chose a move
				enemyMoveChosen = newBattle.getEnemy().getMove((int) Math.random() * 4 + 1);
				// calc damage
				damage = newBattle.attack(party.getMon(monster), enemyMoveChosen, newBattle.getEnemy());
				// store inititial hp
				hpCounter = party.getMon(monster).getHp();
				// deal damage
				party.getMon(monster).dealDamage(damage);
				// sysout damage log
				System.out.println("The wild " + newBattle.getEnemy().getName() + " used " + enemyMoveChosen.getName() + " and did "
						+ (int) damage + " damage!");
				System.out.println("Your " + party.getMon(monster).getName() + " went from " + hpCounter + " hp to "
						+ party.getMon(monster).getHp() + " hp!");
				// if u arent dead
				if (party.getMon(monster).getHp() > 0) {
					// calc damage
					damage = newBattle.attack(newBattle.getEnemy(), moveChosen, party.getMon(monster));
					// store inititial hp
					hpCounter = newBattle.getEnemy().getHp();
					// deal damage
					newBattle.getEnemy().dealDamage(damage);
					// sysout damage log
					System.out.println("Your " + party.getMon(monster).getName() + " used " + moveChosen.getName() + " and did "
							+ (int) damage + " damage!");
					System.out.println("The wild " + newBattle.getEnemy().getName() + " went from " + hpCounter + " hp to "
							+ newBattle.getEnemy().getHp() + " hp!");
				}
			}
		}
	}

}
