package HYRTutorials;

public class add_Of_matrices {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		System.out.println("after addition ");
		{
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					
					sum=a[i][j]+b[i][j];
					System.out.print(sum+"\t");                                                       
				}
				System.out.println();
			}
			
		}
	}
}
