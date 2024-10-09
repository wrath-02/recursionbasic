package recursionbasic;
import java.util.Scanner;
public class SumOfDigits {
	public static int sum(int n,int s) {
		if(n==0)
			return s;
		int x=n%10;
		return sum(n/10,s+x);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Sum of the digits are "+sum(n,0));
		
		
	}

}
