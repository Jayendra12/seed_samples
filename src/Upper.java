
public class Upper {

	// public static String ConvertToUpperCase(String input) {
	/*
	 * String output = "";
	 * 
	 * for (int i = 0; i < input.length(); i++) { if (input.charAt(i) >= 'a' &&
	 * input.charAt(i) <= 'z') { output += (char) (input.charAt(i) - 'a' + 'A');
	 * } else output += input.charAt(i); } return output; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * String input = "jayendra"; input = ConvertToUpperCase(input);
	 * System.out.print("Converted String in Upper Case: " + input);
	 * 
	 * }
	 */public static void main(String[] args) {
		String s = "jayendra";
		System.out.println(s.hashCode());
		s = "lalit";
		System.out.println(s.hashCode());

	}

}
