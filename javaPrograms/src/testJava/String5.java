package testJava;

import java.util.ArrayList;
import java.util.List;

public class String5 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		// List list = new ArrayList();

		list.add("Akshaj");
		list.add('M');
		list.add(28);
		list.add(true);
		list.add("Akshaj");	// can store duplicate values

		System.out.println(list);

		list.add(0, "Akshaj Tyagi");

		System.out.println(list);

		list.remove(4);

		System.out.println(list);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		System.out.println(list.size());

		System.out.println("======================================");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

	}
}