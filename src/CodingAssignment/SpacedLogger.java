package CodingAssignment;
//3.	Create two classes that implement the Logger interface
public class SpacedLogger implements Logger {
	
/*
 * 6.	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
 */
	@Override
	public void Log(String string) {
		StringBuilder spacedMessage = new StringBuilder();
		for(int i=0;i< string.length(); i++) {
            spacedMessage.append(string.charAt(i)).append(" ");
		}
        System.out.println(spacedMessage.toString());

	}

	/*
	 * 8.	The error method should do the same, but with “ERROR:” preceding the spaced out input 
	 * (i.e. ERROR: H e l l o)
	 */
	@Override
	public void Error(String string) {
		StringBuilder spacedMessage = new StringBuilder("ERROR: ");
		for(int i=0;i< string.length(); i++) {
            spacedMessage.append(string.charAt(i)).append(" ");
		}
        System.out.println(spacedMessage.toString());

		}
		
		
	

}
