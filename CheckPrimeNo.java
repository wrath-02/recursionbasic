package recursionbasic;
import java.util.Scanner;
public class CheckPrimeNo {
	public static boolean check(int n,int i) {
		if(i==n)
			return true;
		if(n%i==0)
			return false;
		 return check(n,i+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		System.out.println(check(n,2));
		
	}

}
