package Strings;

public class string_Operations {

	public static void main(String[] args) {
		String s1="achiever";
		String s2=new String("achiever");
		String s3="achiever";
		String s4=new String("achiever");
		System.out.println("---Address comparision---");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println("---Value comparision---");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println("-----String methods----");
		String str="achiever_561";
		String str2="achiever";
		System.out.println(str.startsWith("ach"));
		System.out.println(str.endsWith("526"));
		System.out.println(str.contains("_561"));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase("AchiEveR_561"));
		String str5=" HELLO WORLD 1";
		char[] a=str5.toCharArray();
		System.out.println(a); 
		System.out.println(str5.startsWith("HE"));
		System.out.println(str5.endsWith("1"));
		System.out.println(str5.length());
		System.out.println(str5.trim());
		System.out.println(str5.toLowerCase());
		System.out.println(str5.indexOf("E"));
		System.out.println(str5.lastIndexOf("O"));
		System.out.println(str5.substring(2));
		System.out.println(str5.split(" "));
		System.out.println(str5.charAt(2));
		System.out.println(str5.replace("H","T"));
		System.out.println(Integer.valueOf(str5));
//		int i=1234;
//		String str7=String.valueOf(i);
//		System.out.println(str7);
		String st2=" ";
		String st3="";
		System.out.println(st2.isEmpty());
		System.out.println(st3.isBlank());
	}

}
