package HYRTutorials;

public class JaggedArray_2 {
  public static void main(String[] args) {
    int arr[][]={
      {1,2},
      {1,2,3,4,5},
      {1,2,3}
    };
    System.out.println("printing Jagged Array");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
      System.out.println("the given array is ");
    }
  }
}
