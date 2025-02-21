import java.util.*;

public class ComputeArea {
	/** Main method */

	public static void main(String[] args) {
	    double radius;
	    double area;
	    final double PI = 3.141592;
	    
	    Scanner input = new Scanner(System.in);
	    // Assign a radius
	    System.out.print("Input radius: ");
	    radius = input.nextDouble();

	    // Compute area
	    area = PI*Math.pow(radius, 2);

	    //PI = 3.14;
	    // Display results
	    System.out.println("The area for the circle of radius " +
	    		radius + " is " + area);
	}

}
