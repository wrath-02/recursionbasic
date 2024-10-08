package recursionbasic;
import java.util.Scanner;
public class Josephusproblem {
	 public  static int findTheWinner(int n, int k) {
	        if(n==1)
	            return 1;
	        return (findTheWinner(n-1, k)+(k-1))%n+1;     
	        
	    }

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number of people: ");
		int n=sc.nextInt();
		System.out.print("Enter the kth people from the start: ");
		int k=sc.nextInt();
		System.out.println("The Winner is person standing at "+findTheWinner(n,k));
		

	}

}
