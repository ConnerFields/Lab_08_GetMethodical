import java.util.Scanner; //imports scanner

public class TenDollarCheckout
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double totalCost = 0.0;
        do
        {
            double itemCost = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.5, 10.0); //gets input from user and checks if it is in an acceptable range
            totalCost += itemCost; // adds item cost to total cost

            boolean moreItems = SafeInput.getYNConfirm(in, "Do you have more items to check out?");
            if (!moreItems) //checks to see if loop is complete
            {
                break;
            }
        } while (true);

        System.out.printf("\nTotal Cost of Items: $%.2f\n", totalCost); //prints total
    }
}
