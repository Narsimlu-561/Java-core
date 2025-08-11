package assignments;
import java.util.Arrays;  
import java.util.Scanner;
public class arrSize {
	/**
	 * 
	 * @param |...Sum of array Integers is...|
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size: ");
		int arrSize=sc.nextInt();
		
		System.out.println("enter the array values:");
		int[] arr=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Input :"+Arrays.toString(arr));//don't touch this code, this is same for every program
		System.out.println();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println("Output: "+sum);
		sc.close();
	}

}
