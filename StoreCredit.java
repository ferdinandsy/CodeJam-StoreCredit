import java.io.*;
import java.util.*;

public class StoreCredit {
    public static void main(String[] args) {
    	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int counter = 1; // Case Counter
        int N = Integer.parseInt(in.nextLine()); // Number of Cases
        StringBuilder output = new StringBuilder(); // Total Output 
        while (counter <= N)
        {
            int C = Integer.parseInt(in.nextLine()); // Credit Limit
            int I = Integer.parseInt(in.nextLine()); // Number of Items
            String items = in.nextLine(); // Prices of Items
            String[] arrItems = items.split(" ");
            for (int i = 0; i < I; ++i)
            {
                for (int j = 0; j < I; ++j)
                {
                    if (i == j)
                    {
                        continue; // make sure different items are being referred
                    }

                    if (Integer.parseInt(arrItems[i]) + Integer.parseInt(arrItems[j]) == C) // correct item pair was found
                    {
                        output.append(String.format("Case #%d: %s\n", counter, (i + 1) + " " + (j + 1))); // append to output string
                        i = I;
                        break;
                    }
                }
            }
            counter++;
        }
        System.out.println(output);
    }
}