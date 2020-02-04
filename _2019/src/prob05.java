import java.util.*;
import java.io.*;

public class prob05 {

	static Scanner in;
	static PrintWriter out;
	static String file = "prob05";
	static int layer;

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
		layer = in.nextInt();
	}

	private static void solve() {
		int ans = 0;
		for(int i = layer; i > 0; i--) {
			ans += (i*i);
		}
		out.println(ans);
	}

}
