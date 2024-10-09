package recursionbasic;
import java.util.Scanner;
public class TriangularNumber {
	public static int tri(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return (n) + tri(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term:");
		int n=sc.nextInt();
		System.out.println("Triangular Number is "+tri(n));
		
		
	}

}
