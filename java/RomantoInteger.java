
import java.util.*;
import java.util.Scanner;

public class RomantoInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> Map = new HashMap<>();
        Map.put('I', 1);
        Map.put('V', 5);
        Map.put('X', 10);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D', 500);
        Map.put('M', 1000);

        int numerical = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = Map.get(s.charAt(i));
            
            if (i < s.length() - 1) {
                int nextVal = Map.get(s.charAt(i + 1));
                if (currentVal < nextVal) {
                    numerical -= currentVal;
                } else {
                    numerical += currentVal;
                }
            } 
            else 
            {
                numerical += currentVal;
            }
        }

        return numerical;
    }

    public static void main(String[] args) {
        String romanNumber;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roman number: ");
        romanNumber=sc.next();
        int result = romanToInt(romanNumber);
        System.out.println("Integer value of " + romanNumber + " - " + result );
    }
}


