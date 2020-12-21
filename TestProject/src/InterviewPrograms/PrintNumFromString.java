package InterviewPrograms;

/*Split your string into char array using yourString.toCharArray(); Then iterate through the characters and use Character.isDigit(ch); to identify if this is the numeric value. 
Or iterate through whole string and use str.charAt(i). For e.g:*/
public class PrintNumFromString {
	public static void main(String[] args) {
	    String str = "abc d 1234567890pqr 54897";
	    StringBuilder myNumbers = new StringBuilder();
	    for (int i = 0; i < str.length(); i++) {
	        if (Character.isDigit(str.charAt(i))) {
	            myNumbers.append(str.charAt(i));
	            System.out.println(str.charAt(i) + " is a digit.");
	        } else {
	            System.out.println(str.charAt(i) + " not a digit.");
	        }
	    }
	    System.out.println("Your numbers: " + myNumbers.toString());
	}
}
