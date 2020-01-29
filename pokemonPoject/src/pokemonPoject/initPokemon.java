package pokemonPoject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class initPokemon {
	public static void initPokemon() throws ParseException {
		// pokemon name = new pokemon(name, type, num, hp, phsAtk, phsDef, spAtk, spDef,
		// speed);

		// json parser
		JSONParser jsonParser = new JSONParser();

		// read file
		try (FileReader reader = new FileReader("../pokemonPoject/src/pokemonPoject/pokedex.json")) {

			// parses file to obj
			Object obj = jsonParser.parse(reader);
			// obj to JSONarray
			JSONArray pokemonList = (JSONArray) obj;
			// itterate through each mon
			pokemonList.forEach(mon -> parsePokeDexObject((JSONObject) mon));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void parsePokeDexObject(JSONObject mon) {

		JSONObject nameObj = (JSONObject) mon.get("name");
		// Get mon name
		String name = (String) nameObj.get("english");
		// Get mon id
		int id = Math.toIntExact((Long) mon.get("id"));
		// Get mon type
		JSONArray type = (JSONArray) mon.get("type");
		String type1 = (String) type.get(0);
		String type2;
		if (type.size() == 2) {
			type2 = (String) type.get(1);
		} else {
			type2 = null;
		}
		// Get mon base
		JSONObject base = (JSONObject) mon.get("base");
		int hp = Math.toIntExact((Long) base.get("HP"));
		int phsAtk = Math.toIntExact((Long) base.get("Attack"));
		int phsDef = Math.toIntExact((Long) base.get("Defense"));
		int spAtk = Math.toIntExact((Long) base.get("Sp. Attack"));
		int spDef = Math.toIntExact((Long) base.get("Sp. Defense"));
		int speed = Math.toIntExact((Long) base.get("Speed"));

		pokedex.addMon((new pokemon(name, type1, type2, id, hp, phsAtk, phsDef, spAtk, spDef, speed)));

	}

}
