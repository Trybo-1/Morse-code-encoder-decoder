import acsse.csc2a.MorseCodeConverter;
import java.util.Scanner;

/**
 * Class which contains the main method.
 * 
 * @author Nabeel Vally Omar
 * @version P01
 */
 
public class Main {
	
	/**
	 * @param args not used
	 */
    public static void main(String[] args) {
		//Creating an instance of the morsecode converter
        MorseCodeConverter converter = new MorseCodeConverter();
		//creating a scanner to handle user input
		Scanner scanner = new Scanner(System.in);
		
        //Prompting user
        System.out.print("Would you like to encode a message (Y) or decode (N)? ");
        String encode = scanner.nextLine().trim().toUpperCase(); //getting user input
        
		//variables to store input and output
        String message;
        String result;
        
        if (encode.equals("Y")) {
            // Encoding into Morse Code
            System.out.print("Please enter message to encode: ");
            message = scanner.nextLine();
            
            // Encode
            result = converter.encode(message);
            
            System.out.println("Encoded Message:");
            System.out.println("_________________________________");
            System.out.println(result);
            System.out.println("_________________________________");
        } else {
            // Decoding Morse Code into Plain Text
            System.out.println("Please enter message to decode (use spaces in between Morse Code letters): ");
            message = scanner.nextLine();
            
            // Decode
            result = converter.decode(message);
            
            System.out.println("Decoded Message:");
            System.out.println("_________________________________");
            System.out.println(result);
            System.out.println("_________________________________");
        }
        
        scanner.close();//deleting scanner
    }
}
