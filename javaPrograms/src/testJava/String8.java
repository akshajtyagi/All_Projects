package testJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String8 {

	public static void main(String[] args) {

		// count the occurrence of character

		String s = "bjfadskjfasdnkkadkhdnsbfkasdjsaktttggrdddnasncabcajssyuoje";

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
					
			Set<Entry<Character,Integer>> s1 =	map.entrySet();
			
			for(Entry<Character,Integer> t1:s1) {
				
				//System.out.println(t1.getKey()+" "+t1.getValue());
				
				if(t1.getValue()>=2) {
					System.out.println(t1.getKey()+" "+t1.getValue());
				}
			}
		
	}
}
