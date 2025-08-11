package helloworld.java;

public class Stringlen {
	public static void main(String[] args) {
		String s="ABCDE";
		char[] word=s.toCharArray();
		int length=word.length/2;
		if(length%2!=0) {
			System.out.println(word[length-1]+" "+word[length]);
		}
		else {
			System.out.println(word[length]);
		}
	}

}
