package LabPrograms;
import java.util.Scanner;
public class Count {
	public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s1=s.nextLine();
        String s2=s1.toLowerCase();
        int c=0,v=0,d=0,sp=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='a' || s2.charAt(i)=='e' || s2.charAt(i)=='i' || s2.charAt(i)=='o' || s2.charAt(i)=='u')
                v++;
            else if(s2.charAt(i)>'a' && s2.charAt(i)<='z')
                c++;
            else if(s2.charAt(i)>='0' && s2.charAt(i)<='9')
                d++;
            else
                sp++;
        }
        System.out.println("No of Vowels : "+v);
        System.out.println("No of Consonents : "+c);
        System.out.println("No of Digits : "+d);
        System.out.println("No of Special Characters : "+sp);
        s.close();
    }

}
