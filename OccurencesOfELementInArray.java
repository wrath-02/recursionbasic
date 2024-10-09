package recursionbasic;
import java.util.Scanner;

public class OccurencesOfELementInArray {
	public static int occ(int []arr,int n,int count,int len) {
		if(len==0)
			return count;
		if(arr[len-1]==n) {
			return occ(arr,n,count+1,len-1);
		}
		else
			return occ(arr,n,count,len-1);
		
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int []arr= {1,32,34,54,23,1,43,1};
		int len=arr.length;
		System.out.print("Enter the number for the occurences:");
		int n=sc.nextInt();
		System.out.println("Number of "+ n+"'s are "+occ(arr,n,0,len)+" in array");
	}

}
