package recursionbasic;
import java.util.Scanner;
public class DecimalToBinary {
	public static void convert(int n) {
		if(n<2) {
			System.out.print(n);
			return;
		}	
		convert(n/2);
		System.out.print(n%2);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		convert(n);
		
	}

}
