import java.util.InputMismatchException;
import java.util.Scanner;

public class UserSignUp {
    //create main method
    public static void main(String[] args) {
        //declare Scanner that accepts input
        Scanner input = new Scanner(System.in);
        //declare two variables; username and password
        String username;
        String password;

        //insert try block with prompts for the user to input the username and password
        try {
            System.out.print("Username: ");
            username = input.next();
            System.out.print("Password: ");
            password = input.next();

            //users input then gets passed to the validateUsername and validatePassword methods
            validateUsername(username);
            validatePassword(password);

            System.out.println("Successfully signed up.");
        }
        //catch block that will catch any IllegalArgumentException// if none are caught then print statement "Successfully..."
        catch(IllegalArgumentException e){
            System.out.print(e.getMessage());
        }
    }
    //validateUsername method and make sure both the letters before and after @ are valid
    //declare String to hold the pattern, .+@.+\.com,  to match the username
    public static void validateUsername (String username) throws IllegalArgumentException {
        String pattern = ".+@.+\\.com";
        //check if passed username matches the pattern
            if (!username.matches(pattern)){
                throw new IllegalArgumentException("Username must be a valid email.");
            }
    }
    //validatePassword method takes argument and does not return anything and throws IllegalArgumentException like last method
    public static void validatePassword (String password) throws IllegalArgumentException {
        //Declare four boolean variables and initialize to false
        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean specialCharacter = false;

        //check if each character in the password is an uppercase or lowercase letter, digit or special character
        for(int i = 0; i < password.length(); i++){
            char pw = password.charAt(i);

            if(Character.isUpperCase(pw)){
                uppercase = true;

            } else if (Character.isLowerCase(pw)) {
                lowercase = true;

            } else if (Character.isDigit(pw)) {
                digit = true;

            } else if (!Character.isUpperCase(pw) && !Character.isLowerCase(pw) && !Character.isDigit(pw)) {
                specialCharacter = true;

            }
        }
        //if a boolean is false throw an IllegalArgumentException
            if(!uppercase){
                throw new IllegalArgumentException("Password must contain an uppercase letter.");

            } else if (!lowercase) {
                throw new IllegalArgumentException("Password must contain a lowercase letter.");

            } else if (!digit) {
                throw new IllegalArgumentException("Password must contain a digit.");

            } else if (!specialCharacter) {
                throw new IllegalArgumentException("Password must contain a special character.");

            }
    }

}






