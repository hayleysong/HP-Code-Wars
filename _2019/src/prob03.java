import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class prob03 {

	static Scanner in;
	static PrintWriter out;
	static String file = "prob03";

	public static void main(String[] args) throws IOException {
		for (int i = 1; i <= 3; i++) {
			in = new Scanner(new File(file + "-" + i + "-in.txt"));
			out = new PrintWriter(new File("out.txt"));

			int n = 1;

			for (int j = 0; j < n; j++) {
				init();
				solve();
			}
			in.close();
			out.close();
			System.out.println(i);
			Check.check("out.txt", file + "-" + i + "-out.txt");
		}
	}

	private static void init() {

	}

	private static void solve() {
		int r = in.nextInt();
		double p = 3.14159;
		double ans = Math.round(p * r * r * (0.75) * 100);
		ans = ans/100;
			out.printf("%.2f", ans);
	}

}
