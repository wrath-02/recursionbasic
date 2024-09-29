
import java.util.Scanner;

//printing N to 1 

public class N_to_1and1_to_N {
	public static void nto1(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		nto1(n-1);
		
	}
	
	
	//printing 1 to N
	
	public static void _1ton(int n,int i) {
		if(n==0) {
			return;
		}
		System.out.println(i);
		_1ton(n-1,i+1);
	}
	
	// Driver Class
	
	public static void main(String[] args) {
		System.out.print("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		nto1(n);
		System.out.println("/********************************/");
		_1ton(n,i);
		
	}

}
