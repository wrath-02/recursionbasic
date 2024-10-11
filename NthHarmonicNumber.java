package recursionbasic;
import java.util.Scanner;
public class NthHarmonicNumber {
	public static double harmonic(double n) {
		if(n==0)
			return 0;
		return 1/n + harmonic(n-1);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the term:");
		double n=sc.nextDouble();
		System.out.print(harmonic(n));
	}

}
