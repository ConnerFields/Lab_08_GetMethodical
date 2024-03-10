import java.util.Scanner; //imports scanner

public class RegExIsMagic
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + ssn); //Displays user input

        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (MXXXXX)", "^(M|m)\\d{5}$");
        System.out.println("Your M number: " + mNumber); //Displays user input

        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Your menu choice: " + menuChoice); //Displays user input
    }
}
