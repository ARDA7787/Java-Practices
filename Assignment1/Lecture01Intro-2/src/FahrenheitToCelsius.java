import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static double getCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
	
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble(); 

    // Convert Fahrenheit to Celsius
    double celsius = FahrenheitToCelsius.getCelsius(fahrenheit);
    System.out.println("Fahrenheit " + fahrenheit + " is " + 
      celsius + " in Celsius");  
  }
}

