package java;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNo = sc.nextLine().toUpperCase(); // to convert UpperCase if user write lowerCase
        int intValue = romanToInt(romanNo);
        System.out.println("The integer value of " + romanNo + "=" + intValue);
        sc.close();
    }
    
    public static int romanToInt(String s) 
    {
    	int result = 0;
        int previousVal = 0;
         
     HashMap<Character, Integer> romanNo = new HashMap<>();
        romanNo.put('I', 1);
        romanNo.put('V', 5);
        romanNo.put('X', 10);
        romanNo.put('L', 50);
        romanNo.put('C', 100);
        romanNo.put('D', 500);
        romanNo.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--)
         {
            int Value = romanNo.get(s.charAt(i));
            if (Value < previousVal) 
            {
                result =result - Value;
            } 
             else 
            {
                result=result + Value;
            }
            previousVal = Value;
        }

        return result;
    }
}
