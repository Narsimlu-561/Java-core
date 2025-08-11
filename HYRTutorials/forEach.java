package HYRTutorials;

public class forEach {

	public static void main(String[] args) {
//		int arr[]= {5,4,2,8,6,8};
		//using for loop
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//using for eavh loop
//		int sum=0;
//		for(int value :arr) {
//			sum+=value;
//		}
//		
//		System.out.println(sum);
		int arr[][]= {
				{1,5,4},
				{6,3,7},
				{8,2,3}
		};
		int sum=0;
		int elem=0;
		for(int[] singleDarr:arr) {
			for(int value:singleDarr) {
				System.out.print(value +" ");
				sum+=value;
				elem++;
			}
			System.out.println();
		}
			
			System.out.println();
			System.out.println("Sum :"+sum);
			System.out.println("Avg :"+ sum/elem);
	}

}
