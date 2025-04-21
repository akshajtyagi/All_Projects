package testJava;

public class String1 {

	public static void main(String[] args) {

		// String s1 = new String("Automation"); // it will create 2 objects internally
		// one in Heap Area & another in
		// String Constant Pool (SCP)

		// String str = " Akshaj Tyagi ";
		// System.out.println(str.trim()); // it will remove the space from the string
		// (Starting and ending spaces only, not in b/w the string)

		String str = "Akshaj Tyagi"; // it will create only 1 object internally in SCP

		System.out.println(str.length()); // 12
		System.out.println(str.isEmpty()); // false

		String str1 = "akshaj tyagi";

		System.out.println(str1.equals(str)); // boolean (false)
		System.out.println(str1.equalsIgnoreCase(str)); // boolean (true)

		System.out.println(str1.compareTo(str)); // 32
		System.out.println(str1.compareToIgnoreCase(str)); // 0

		System.out.println(str.concat(str1)); // Akshaj Tyagiakshaj tyagi

		System.out.println(str.substring(7)); // Tyagi
		System.out.println(str.substring(0, 4)); // Aksh

		System.out.println(str.replace("j", "y")); // Akshay Tyagi
		System.out.println(str.replaceFirst("a", "y")); // Akshyj Tyagi
		System.out.println(str.replaceAll("a", "y")); // Akshyj Tyygi

		System.out.println(str.indexOf("a")); // 4
		System.out.println(str.lastIndexOf("a")); // 9
		System.out.println(str.contains("sh")); // boolean (true)
		System.out.println(str.startsWith("Ak")); // boolean (true) Case sensitive
		System.out.println(str.endsWith("tyag")); // boolean (false)
		System.out.println(str.charAt(5)); // j

		System.out.println(str.toUpperCase()); // AKSHAJ TYAGI
		System.out.println(str.toLowerCase()); // akshaj tyagi

		int a = 10;
		String s3 = String.valueOf(a);
		System.out.println(s3);

		char[] c = str.toCharArray();
		System.out.println(c);

	}

}