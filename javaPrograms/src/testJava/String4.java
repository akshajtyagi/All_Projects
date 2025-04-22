package testJava;

public class String4 {

	public static void main(String[] args) {

		String a = "ABC";
		String b = "XYZ";

		a = a + b;
		b = a.substring(0, a.length() - b.length()); // ABC
		a = a.substring(b.length()); // XYZ

		System.out.println(a);
		System.out.println(b);
	}
}
