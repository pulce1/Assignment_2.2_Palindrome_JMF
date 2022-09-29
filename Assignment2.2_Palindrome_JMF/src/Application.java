/**
 * This class allows you to determine if a string is a Palindrome or not using a stack
 * by taking the input from the user
* @author James Frayser
* Application.java
* @version 9/22/2002
*/
import java.util.Scanner;
import java.util.Stack;
public class Application {
       
       public static void main(String[] args) {
    	   
    	   @SuppressWarnings("resource")
    	   Scanner scan = new Scanner(System.in);
    	   Stack<Character> stack = new Stack<>();
           System.out.println("Enter a string to see if it is a palindrome, spacing, casing, and punctuation must also be\nacknowleged: ");
           String input = scan.nextLine();
           
           /**
            * Creates a place for the reverse of the input to go
            */
           String reverseInput = "";
           
           /**
            * Pushes each character from the input on the stack
            */
           for(int i = 0; i<input.length(); i++)
           {
        	   stack.push(input.charAt(i));
           }//end for
           
           /**
            * Checks to see if the stack is empty, if it isn't, it keeps popping until it 
            * is empty to make the reversed input.
            */
           while (!stack.isEmpty()) 
           {
        	   reverseInput = reverseInput + stack.pop();
           }//end while
           
           /**
            * Uses the .equals method to determine if the reversed input equals the regular
            * input. Takes the input from the user
            */
           if(input.equals(reverseInput)) 
           {
        	   System.out.println(input + " is a palindrome");
           }//end if
           else
           {
        	   System.out.println(input + " is not a palindrome");
           }//end else

       }//end main
}//end class
