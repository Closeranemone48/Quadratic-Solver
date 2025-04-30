import java.util.Scanner;

public class Main {

	static double a;
	static double b;
	static double c;

	static void diy(double n) {
		if (n == 0) {
			throw new ArithmeticException("Seriously‽ Do it yourslf you lazy #@*$.");
		}
	}

	public static void main(String[] args) {
		new Frame("Quadratic Solver");
		// create import objs
		Scanner sc = new Scanner(System.in);

		// declare variables
		double x1, x2, dis, a, b, c;
		System.out.println(
				"Welcome! When prompted, input the requested values following the format of ax² + bx + c = 0 , a ≠ 0"
						+ "\n");
		// var a
		System.out.println("What is the value of a");
		a = sc.nextDouble();
		diy(a);
		// var b
		System.out.println("What is the value of b");
		b = sc.nextDouble();
		// var c
		System.out.println("What is the value of c");
		c = sc.nextDouble();
		sc.close();
		// test discriminant
		dis = b * b - 4 * a * c;
		if (dis <= 0.0) {
			if (dis == 0.0) {
				x1 = x2 = -b / (2 * a);
				System.out.printf("when y is zero, x is %f \n", x1);
			} else {
				dis = -1 * (b * b - 4 * a * c);
				x1 = 2 * a;
				System.out.printf("When y is zero x is [-%g ± i√(%g)]/%f \n", b, dis, x1);
			}
		} else {
			x1 = (-b + Math.sqrt(dis)) / (2 * a);
			x2 = (-b - Math.sqrt(dis)) / (2 * a);
			System.out.printf("When y is zero, x is %f and %f \n", x1, x2);
		}
	}
}
