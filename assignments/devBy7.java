package assignments;

public class devBy7 {
	//print the numbers which are divisible by 7 for the range 150 to 200
	public static void main(String[] args) {
		int i=150;
		int j=200;
		while(i<=j) {
			if(i%7==0) 
				System.out.println(i);
				i++;
		}
	}
}
