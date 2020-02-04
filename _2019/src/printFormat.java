import java.text.DecimalFormat;
public class printFormat {

	public static void main(String [] args) {
		double a = 35.6780;
		double b = 0.878;
		
		
		System.out.printf("%.2f, %.2f\n", a, 0.4);
		System.out.printf("%05.2f\n", 7.0);
		System.out.printf("%-10s\n", "Lee");
		System.out.printf("%10s\n", "Lee");
		System.out.printf("$%,3.2f\n", 12345678.0);
		System.out.printf("%04.2f", 7.6);
	}
}
