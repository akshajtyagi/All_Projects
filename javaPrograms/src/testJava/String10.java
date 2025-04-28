package testJava;

public class String10 {

	public static void main(String[] args) {

		// Regular Expression: [^0-9a-zA-Z]

		String s = "$$$$$##@@#$%%^^**amndkasdasnxiqwnnsnzddAGHTY()*&^%%$$#@!123466";

		s = s.replaceAll("[^0-9A-Za-z]", "");
		System.out.println(s);

	}
}