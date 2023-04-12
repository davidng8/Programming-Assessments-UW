import java.util.*;
public class EncryptionMachine {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final int SHIFT = 3;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        welcome(sc);
        counter(sc);
        System.out.println();
        System.out.println("Message fully encrypted. Happy secret messaging!");
    }
public static void welcome(Scanner sc) {
// this method takes input of the key.
    System.out.println("Welcome to the CSE142 Encryption Machine!");
    System.out.println("The program lets you encrypt a message");
    System.out.println("with a key so your recipient can decrypt.");
    System.out.println();
    System.out.println("Encrypted messages use a shared keyword to decrypt.");
    System.out.print("  Enter key: ");
    String word = sc.next();
    String encryption = encryption(word);
    System.out.println("    \"" + word + "\" has been encrypted to: " + encryption );
    System.out.println();
    }
public static void counter(Scanner sc){
//this method counts the amount of words in your inputted message.
    System.out.print("How many words are in your message? ");
    int letterCount = sc.nextInt();
    for(int i = 0; i < letterCount; i++){
        System.out.print("  Next word: ");
        String word = sc.next();
        System.out.println("    \"" + word + "\" has been encrypted to: " + encryption(word));
    }
}
public static String encryption(String word){
//this method encrypts the message and returns the encrypted values which 
//is used in the first method to print out the output of the encrypted message.
    String encrypt = "";
        for(int i = 0; i < (word.length()); i++){
            char w = word.charAt(i);
            int x = ALPHABET.indexOf(w);
            char alphabetChar = 'a';
            if(x + (SHIFT % 26)>= 26){
                alphabetChar = ALPHABET.charAt(x - 26 + (SHIFT % 26));
            }
            else
            {
                alphabetChar = ALPHABET.charAt(x + (SHIFT % 26));
            }
            encrypt = encrypt + alphabetChar;
        }
        return encrypt;
    }

}
