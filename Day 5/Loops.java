import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while(i<11) {
            
            System.out.println( n + " x " + i + " = " + n * i);
            i++;
        }
        
    }
}
