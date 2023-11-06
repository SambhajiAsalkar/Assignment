package java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) 
      {        
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sentence: ");
        String sentence = sc.nextLine();        
        sentence=sentence.toLowerCase(); // Convert to lowerCase to handle both cases
        Set<Character> letters = new HashSet<>();       
        for (int i = 0; i < sentence.length(); i++) 
          {
            char c = sentence.charAt(i);
            if (Character.isLetter(c))                
                 {
                  letters.add(c);        
                 }
          }
         if(letters.size()==26)
         {
        	 System.out.println("Sentence is pangram");
         }
         else {
        	 System.out.println("Sentence is not pangram");
            }
         sc.close();
        }
      
    }
