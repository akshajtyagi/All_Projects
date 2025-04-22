package testJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String7 {

	public static void main(String[] args) {

		// HashMap map = new HashMap();
		// Map map = new HashMap();
		Map<String, String> map = new HashMap<>();

		// Stores in Key and Value pairs.

		map.put("Name", "Akshaj");
		map.put("Job", "Testing");
		map.put("Phone", "99533");

		System.out.println(map);
		System.out.println(map.get("Name")); // Akshaj
		System.out.println(map.size());

		System.out.println("-----------------------------------------------------------------");

		// to convert map into set

		Set<Entry<String, String>> s1 = map.entrySet();

		for (Entry<String, String> t : s1) {

			System.out.println(t.getKey() + " " + t.getValue());
		}

	}

}
