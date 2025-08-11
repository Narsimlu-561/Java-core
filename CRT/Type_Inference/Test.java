package Type_Inference;

public class Test {

	public static void main(String[] args) {
		var i=22.25;
		System.out.println(i);	
		/*var j;
		j=100;*/ //we can not define the var like this instead we can initialize
//		System.out.println(j);
		var n=100;
		var b="true";
		var c='v';
		var f=12.25;
		System.out.println(n);
		System.out.println(b);
		System.out.println(c);
		System.out.println(f);
		System.out.println("var as variable and dataType");
		var var=10;
		var=var+var;
		System.out.println(var);
	}

}
