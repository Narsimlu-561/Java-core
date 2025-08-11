package HYRTutorials;

public class arrays {
	
	public static void main(String[] args) {        //Syntax for array
		int[] j=new int[5];//dataType[] arrayName = new dataType[] 
		j[0]=10;
		j[1]=20;
		j[2]=30;
		j[3]=40;
		j[4]=50;
		j[2]=15;
		int i=0;
		int sum=0;
		for(i=0;i<j.length;i++) {
			System.out.println(j[i]);
		}
		
		while(i<j.length) {
			sum +=i;
			i++;
		}
		System.out.println("Sum of array values are: "+sum);
		
//		int[] a=new int[2];
//		float[] b=new float[2];
//		short[] c=new short[2];
//		long[] d=new long[2];
//		double[] e=new double[2];
//		char[] f=new char[2];
//		boolean[] g=new boolean[2];
//		String[] h=new String[2];
		
	}
}
