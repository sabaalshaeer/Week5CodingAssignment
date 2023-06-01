package CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		/*10.	In this class instantiate an instance of each of your logger classes that 
		 * implement the Logger interface.
		*/
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("Jude");
		System.out.println("\n...................\n");
		asteriskLogger.Error("ErrorMessage");
		
		System.out.println("\n");
		
		spacedLogger.Log("Alshaeer");
		System.out.println("\n...................\n");
		spacedLogger.Error("ErrorMessage");


	}

}
