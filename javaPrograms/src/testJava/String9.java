package testJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String9 {

	public static void main(String[] args) {

		String s = "abcdabcdabcderfgtttttyx";
		char[] c = s.toCharArray();

		Map<Character, Integer> map = new HashMap();

		for (char t : c) {
			if (map.containsKey(t)) {
				map.put(t, map.get(t) + 1);
			} else {
				map.put(t, 1);
			}
		}
		System.out.println(map);

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> t1 : set) {
			if (t1.getValue() == 1) {
				System.out.println(t1.getKey() + " " + t1.getValue());
			}
		}
	}
}