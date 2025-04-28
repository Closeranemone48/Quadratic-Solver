
import java.awt.Frame;

public class QuadraticEquation {

	public String quadraticMath(Double a, Double b, Double c) {
		new Frame();
		new Main();
		double x1, x2, dis;
		String result = "";
		if (a == 0.0) {
			result = ("Seriously\u203d Do it yourslf you lazy #@*$. \n");
		} else {
			dis = b * b - 4 * a * c;
			if (dis <= 0.0) {
				if (dis == 0.0) {
					x1 = x2 = -b / (2 * a);
					result = ("when y is zero, x is " + x1 + "\n");
				} else {
					dis = -1 * (b * b - 4 * a * c);
					x1 = 2 * a;
					result = ("When y is zero x is [-" + b + " \u00b1 i\u221a(" + dis + ")]/" + x1 + "\n");
				}
			} else {
				x1 = (-b + Math.sqrt(dis)) / (2 * a);
				x2 = (-b - Math.sqrt(dis)) / (2 * a);
				result = ("When y is zero, x is " + x1 + " and " + x2 + "\n");
			}
		}
		return result;
	}
}
