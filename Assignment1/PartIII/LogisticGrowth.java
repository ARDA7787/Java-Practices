import java.util.*;

public class LogisticGrowth {

	public static double calculatePopulation(double K, double r, int t, double P0) {
		

		return K/(1+((K-P0)/P0)*Math.exp(-r * t));
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double K = scan.nextDouble();
		double P0 = scan.nextDouble();
		double r = scan.nextDouble();
		int t = scan.nextInt();
		
		double population = calculatePopulation (K, r, t, P0);
		System.out.println("The population at time t = " + t + " is: " + population);

	}
}