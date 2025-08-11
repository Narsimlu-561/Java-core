package HYRTutorials;

public class transpose_Matrix {

	public static void main(String[] args) {
		int i,j;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("original matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("transpose matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
