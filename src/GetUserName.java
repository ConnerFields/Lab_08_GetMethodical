//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; //imports scanner
public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

    }
}