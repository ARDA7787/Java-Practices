import java.util.*;
import


/*Reverse every word in the string, not entire string*/

public class One {  
  public static void main(String[] args){ //Here it is public static void as void doesnt return anything like this function
    //Scanner for input
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine(); //To scan any line of string
    
    String words[] = line.split("\\s+"); //Splitting words at every white space
    StringBuilder result = new StringBuilder(); //StringBuilder has in built functions like .reverse(), .append(), etc.
    
    for(int i = 0; i < words.length; i++){ //for every word in the string
      if(i > 0){
        result.append(" "); //Append space between words except before the first word
      }
      result.append(new StringBuilder(words[i]).reverse()); //reverse and append to new string called results
    }
    
    System.out.println(result.toString()); //Output the final result
    
    scan.close(); //Close the scanner
  }
}


//Input: My name is Aryan and yours is ??
//Output: yM eman si nayrA dna sruoy si ??




/*Get the character at the given index within the String*/

public class Two{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine(); //scan.nextLine() for string scan input
    int point = scan.nextInt(); //scan.nextInt() for int scan input

    if(point >= 0 && point < line.length()){   //make sure point value is valid
      int index = line.charAt(point);  //declare varibale index and assign the value of the character using line.charAt(')
      System.out.println(point + " is " + (char)index);
    }
    else{
      System.out.println("Invalid!");
    }
    scan.close();
  }
}

//Input 1: I am a Computer Science Engineer 
//Input 2: 10
//Output : p



/*Check if string is Palindrome*/

public class Three{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    //Declare 3 variables - 2 pointer variable and one boolean
    int left = 0;  //To start reading from the left of the line
    int right = sentence.length() - 1; //To start reading from the right (minus 1 because the pointer position starts from zero)
    boolean isPalindrome = true; 

    while(left <= right){ //The program will only run till the pointer variables meet so only till half the string
      if(sentence.charAt(left) != sentence.charAt(right)){ //Take a negetive approach as we can use isPalindrome to print string easily
        isPalindrome = false;
        break; //If statement without an else so we break
      }
      left++; //Move left pointer towrds right 
      right--; //Move right pointer towards left
    }
    if(isPalindrome){ //Default isPalindrome value which was declared as true at the start
      System.out.print("The string " + sentence + " is a Palindrome");
    }
    else{
      System.out.print("The string " + sentence + " is not a Palindrome");
    }
    scan.close();
  }
}


//Input: rotator
//Output: The string rotator is a Palindrome


/*
