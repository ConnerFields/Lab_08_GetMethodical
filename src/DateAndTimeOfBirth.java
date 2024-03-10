import java.util.Scanner; //imports scanner
public class DateAndTimeOfBirth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter the year of birth", 1950, 2015); //gets input from user
        int month = SafeInput.getRangedInt(in, "Enter the month of birth", 1, 12); //gets input from user

        int daysInMonth; //sorts month into proper day count.
        if (month == 2)
        {
            daysInMonth = 29; // February has 29 days (leap years)
        } else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            daysInMonth = 30; // April, June, September, and November have 30 days
        } else
        {
            daysInMonth = 31; // All other months have 31 days
        }

        int day = SafeInput.getRangedInt(in, "Enter the day of birth", 1, daysInMonth); //sets value to user input
        int hours = SafeInput.getRangedInt(in, "Enter the hours of birth", 1, 24); //sets value to user input
        int minutes = SafeInput.getRangedInt(in, "Enter the minutes of birth", 1, 59); //sets value to user input

        System.out.println("\nDate and Time of Birth: " + year + "-" + month + "-" + day +
                " " + hours + ":" + minutes); //displays data
    }
}
