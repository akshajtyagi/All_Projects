package testJava;

import java.util.HashSet;
import java.util.Set;

public class String6 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		// Set set = new HashSet();

		// Store unique values only
		// Store in random order
		// doesn't have get method

		set.add("Akshaj");
		set.add('M');
		set.add(28);
		set.add(99533);
		set.add("Akshaj"); // will not store duplicate value

		System.out.println(set.size());
		System.out.println("----------------------------------");
		System.out.println(set);

		for (Object t : set) {

			System.out.println(t);

		}

	}
}
