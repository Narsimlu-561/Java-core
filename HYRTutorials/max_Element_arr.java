package HYRTutorials;

public class max_Element_arr {

	public static void main(String[] args) {
		int arr[]= {3,4,5,6,80,9};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])  
				max=arr[i];
		}
		System.out.println("max element : "+ max);
	}

}
