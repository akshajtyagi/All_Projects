package testJava;

public class String2 {

	public static void main(String[] args) {

		// reverse a String

		// First way

		StringBuilder sb = new StringBuilder("Automation");
		System.out.println("reverse by using first way is: " + sb.reverse()); // reverse by using first way is:
																				// noitamotuA

		// Second way

		String str = "Automation";
		StringBuilder rev = new StringBuilder(str).reverse();
		System.out.println("reverse by using second way is: " + rev); // reverse by using second way is: noitamotuA

		// Third way
		String str1 = "Automation";
		String rev1 = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			rev1 = rev1 + str1.charAt(i);
		}
		System.out.println("reverse by using third way is: " + rev1); // reverse by using third way is: noitamotuA
	}

}
