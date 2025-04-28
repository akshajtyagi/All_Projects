package testJava;

public class String11 {

	public static void main(String[] args) {

		String s = "test automation playwright selenium";
		String[] s1 =	s.split(" ");
		String  s2 = s1[2];
		String rev ="";
		//int len = s2.length();
		
		for(int i=s2.length()-1; i>=0; i--) {
				rev = rev +s2.charAt(i);
		}
		System.out.println(rev);
		System.out.println(s1[0]+" "+s1[1]+" "+rev+" "+s1[3]);
	}
}
