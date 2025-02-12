/*
public class  EstimateLn2 {

	public static double estimateLn2() {
		
		int n=0;
		double ln2= Math.log(2.0);
		double sum=0;
		double diff = 1e-5;
		int count = 0;
		while (Math.abs(sum - ln2) > diff && count<20) {
			n++;
			sum += Math.pow(-1, (n+1))/n;
			System.out.println("sum is " + sum);
			System.out.println("difference is " + Math.abs(sum - ln2));
			count++;
		}
		System.out.println("terminated after " + n + " iterations");
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("ln2 is  "+ estimateLn2());
	}
}
*/

public class EstimateLn2 {

    public static double estimateLn2() {
        int n = 0;  
        double ln2 = Math.log(2.0); 
        double sum = 0;  
        double diff = 1e-5;
        int count = 0;  

        while (Math.abs(sum - ln2) > diff) {
            n++;  
            sum += Math.pow(-1, (n + 1)) / n;  
            count++;  
        }

        System.out.println("ln(2) is estimated as " + sum + " after " + count + " iterations");
        return sum;
    }

    public static void main(String[] args) {
        estimateLn2();
    }
}
