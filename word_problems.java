
/*Reverse every word in the string, not entire string*/

import java.util.*;

public class One{  //If declaring any other public class, declare in a seperare java file
  public static String reversed(String str){ //Here it is public static string as this program returns a string
    String words = str.split("\\s+"); //Splitting words at every white space
    StringBuilder result = new StringBuilder(); //StringBuilder has in built functions like .reverse(), .append(), etc.
    for(int i = 0; i < words.lenght(); i++){ //for every word in the string 
      if(i<0){
        results.append(" ");
      }
      result.append(new StringBuilder(words[i]).reverse()); //reverse and append to new string called results
    }
    return result.toString();
  }
  public static void main(String[] args){ //Here it is public static void as void doesnt return anything like this function
    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine(); //To scan any line of string
    System.out.println(result);
    scanner.close();
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
