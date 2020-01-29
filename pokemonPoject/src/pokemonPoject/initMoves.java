package pokemonPoject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class initMoves {
	public static void initMoves() throws ParseException {
		// move name = new move(name, type, atkType, atk, hitChance, pp);
		move thunderbolt = new move("Thunderbolt", "Electric", "Special", 90, 100, 15);
		move thunder = new move("Thunder", "Electric", "Special", 110, 70, 10);

		// json parser
		JSONParser jsonParser = new JSONParser();

		// read file
		try (FileReader reader = new FileReader("../pokemonPoject/src/pokemonPoject/moves.json")) {

			// parses file to obj
			Object obj = jsonParser.parse(reader);
			// obj to JSONarray
			JSONArray moveList = (JSONArray) obj;
			// itterate through each mon
			moveList.forEach(move -> parseMoveObject((JSONObject) move));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void parseMoveObject(JSONObject move) {
		// Get move name
		String name = (String) move.get("ename");
		// Get move type
		String type = (String) move.get("type");
		// Get move category
		String category = (String) move.get("category");
		// "\u7269\u7406" == Physical
		// "\u7279\u6b8a" == Special
		if (category.equals("\u7269\u7406")) {
			category = "Physical";
		} else if (category.equals("\u7279\u6b8a")) {
			category = "Special";
		} else {
			category = null;
		}

		// Get move power
		int power = 0;
		if (move.get("power") != null) {
			power = Math.toIntExact((Long) move.get("power"));
		}
		// Get move acc
		int acc = 0;
		if (move.get("accuracy") != null) {
			acc = Math.toIntExact((Long) move.get("accuracy"));
		}
		// get move pp
		int pp = 0;
		if (move.get("pp") != null) {
			pp = Math.toIntExact((Long) move.get("pp"));
		}

		if (category != null && power != 0 && acc != 0 && pp != 0) {
			System.out.println(name);
			movedex.addMove(new move(name, type, category, power, acc, pp));
		}

	}
}
