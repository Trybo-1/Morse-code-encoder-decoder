package acsse.csc2a;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to represent the morse encoder and decoder
 * 
 * @author Nabeel Vally Omar 
 * @version P01
 */
 

public class MorseCodeConverter {
    private String message;
    private String morseCode;
    private static final String[] text = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                                          "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "W", "Z",
                                          "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    private static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                                            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                                            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                                            "..---", "...--", "....-", ".....", "-....", "--...", "---..",
                                            "----.", "-----"};
	/**
	 * Creates a morsecode converter and initialises default states
	 */
    public MorseCodeConverter() {
        this.message = "";
        this.morseCode = "";
    }
	/**
	 * Encodes a message into morse code
	 * @param msg The message to convert to morse code
	 * @return The encoded messege
	 */
    public String encode(String msg) {
        message = toUpper(msg);
        StringBuilder encodedMessage = new StringBuilder();
        
        for (char c : message.toCharArray()) {
            int index = -1;
            for (int j = 0; j < text.length; j++) {
                if (text[j].charAt(0) == c) {
                    index = j;
                }
            }
            if (index != -1) {
                encodedMessage.append(morse[index]).append(" ");
            }
        }
        morseCode = encodedMessage.toString().trim();
        return morseCode;
    }
	/**
	 * Decodes morse code into a normal message 
	 * @param mc The morse code to be converted to a normal messege.
	 * @return The decoded messege.
	 */
    public String decode(String mc) {
        morseCode = mc;
        List<String> tokens = new ArrayList<>();
        
        for (String token : mc.split(" ")) {
            tokens.add(token);
        }
        
        StringBuilder decodedMessage = new StringBuilder();
        for (String element : tokens) {
            int index = -1;
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(element)) {
                    index = i;
                }
            }
            if (index != -1) {
                decodedMessage.append(text[index]);
            }
        }
        message = decodedMessage.toString();
        return message;
    }
	/**
	 * Retrieves the message.
	 * @return The message.
	 */
    public String getMessage() {
        return message;
    }
	/**
	 * Stores the message.
	 * @param msg The message is stored.
	 */
    public void setMessage(String msg) {
        this.message = msg;
    }
	/**
	 * Retrieves the morsecode.
	 * @return The morse code.
	 */
    public String getMorseCode() {
        return morseCode;
    }
	/**
	 * Stores the morse code message.
	 * @param mc The morse code message is stored.
	 */
    public void setMorseCode(String mc) {
        this.morseCode = mc;
    }
	/**
	 * Converts the message to uppecase.
	 * @param msg The message to convert.
	 * @return The message in Uppercase.
	 */
    public String toUpper(String msg) {
        return msg.toUpperCase();
    }
}
