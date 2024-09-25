package recursionbasic;

public class SumOFArrayElements {

	static int Sum(int A[], int N) { 
			if (N <= 0) 
				return 0; 
			return (Sum(A, N - 1) + A[N - 1]); 
	} 

	public static void main(String[] args) 
	{	 
		int arr[] = { 1, 2, 3, 4, 5 }; 
		int y=Sum(arr, arr.length);
		System.out.println("The sum of array elements is "+y); 
	} 
	

}
