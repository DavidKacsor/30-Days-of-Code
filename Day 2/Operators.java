import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        double tip_percent = in.nextDouble();
        double tax_percent = in.nextDouble();
        in.close();
        
        double tip = tip_percent/100 * meal_cost;
        double tax = tax_percent/100 * meal_cost;
        
        int totalCost = (int) Math.round((meal_cost + tip + tax));
        
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
