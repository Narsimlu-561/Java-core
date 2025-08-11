package HYRTutorials;

public class array_2 {
	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(a[0]+a[1]+a[2]);//we are directly assign the values if we know the values before
		System.out.println("new way to create array");
		int[] b= {10,20,30,40};
		System.out.println(b[2]);
		System.out.println("printing all values present in array with a loop:");
		for(int i=0;i<b.length;i++) {
			System.out.println(i);
		}
	}

}
