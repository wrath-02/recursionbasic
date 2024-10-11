package recursionbasic;
import java.util.Scanner;
public class BinaryToDecimal {
	public static int convert(int n,int i) {
		if(n==0) {
			return 0;
		}
		int x=n%10;
		int ans=((int)Math.pow(2,i))*x;
		return  ans + convert(n/10,i+1); 
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the binary number:");
		int n=sc.nextInt();
		System.out.println("The decimal conversion is "+convert(n,0));
		
		
	}

}
