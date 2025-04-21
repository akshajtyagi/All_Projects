package testJava;

public class String3 {

	public static void main(String[] args) {

		// reverse a String and verify also is it a Palindrome or not?

		String str = "madam";

		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(rev); // madam
		System.out.println(str.equalsIgnoreCase(rev)); // true (means it's a Palindrome

		String rev1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev1 = rev1 + str.charAt(i);
		}
		System.out.println(rev1); // madam
		
		if (str.equalsIgnoreCase(rev1)) {
			System.out.println("It is a Palindrome"); // It is a Palindrome
		} else {
			System.out.println("It is not a Palindrome");
		}
	}
}
