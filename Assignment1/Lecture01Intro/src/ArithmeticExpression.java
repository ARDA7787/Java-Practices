
public class ArithmeticExpression {

	private static double expression(float a, float b, float c, float x, float y) {
		
		return (3+4*x)/5 - 10.0*(y-5)*(a+b+c)/x + 9*(4/x + (9+x)/y);

	}
	
	public static void main(String[] args) {
		float a, b, c, x, y;
		a = 1;
		b = 2;
		c = 3;
		x = 4;
		y = 5;
		double result = ArithmeticExpression.expression(a,b,c,x,y);
		System.out.println("result is " + result);
	}
}
