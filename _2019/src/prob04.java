import java.util.*;
import java.io.*;

public class prob04 {

	static Scanner in;
	static PrintWriter out;
	static String file = "prob04";
	static double taxRate, total;

	public static void main(String[] args) throws IOException {
		for (int i = 1; i <= 3; i++) {
			in = new Scanner(new File(file + "-" + i + "-in.txt"));
			out = new PrintWriter(new File("out.txt"));

			int n = Integer.parseInt(in.nextLine());

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
		taxRate = in.nextDouble();
		total = in.nextDouble();
		taxRate = taxRate/100;
	}

	private static void solve() {
		double pretax_price = total / (1.0 + taxRate);
		double tax_amt = pretax_price * taxRate;
		out.print("On your ");
		out.printf("$%.2f", total);
		out.print(" purchase, the tax amount is ");
		out.printf("$%.2f", tax_amt);
		out.println();
	}

}
