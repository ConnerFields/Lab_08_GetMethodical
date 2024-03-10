import java.util.Scanner; //Imports Scanner
public class FavoriteNumber
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in); //gets input from user

                int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer (Whole number)");
                System.out.println("Your favorite integer is: " + favoriteInt);

                double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double (Non-Whole Number)");
                System.out.println("Your favorite double is: " + favoriteDouble);
        }
}
