package helloworld.java;

public class Conditional {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a<b||a==b);//true -true=true
		                             //true -false=true
		                            //false -true=true
		                           //true -true=false
		System.out.println(a<b && a==b);//true -true=true
                                       //true -false=false
                                      //false -true=false
                                     //true -true=false
	}
}
