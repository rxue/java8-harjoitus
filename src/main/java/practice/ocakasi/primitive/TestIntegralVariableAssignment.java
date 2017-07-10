package practice.ocakasi.primitive.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class TestIntegralVariableAssignment {
	public static void main(String[] args) {
		byte b1 = 127;//Range in [-127, 127] => OK
		byte b2 = 128;//out of range of [-127, 127] => Does not compile! 
		byte byteResult1 = 127 - 1;	//All operands are literals && byte is smaller than int => evaluated at compile time && result in byte range => OK 
		byte byteResult = 127 * 2;		//All operands are literals && byte is smaller than int => evaluated at compile time && result not in byte range => Does not compile
		char charSum = 65535 + 2;// Same as the above
		int in = 214748365; //assigned literal out of int range => Does not compile!
		int intSum = 214748364 + 1;//arithmetic expression assigned to int variable is not evaluated at compile time
		System.out.println(intSum);//If the syntax errors above is removed, this can compile and run without Exception but printed overflowed result
		long l = 10;//
		long l2 = 2147483648L;//This is out of range of int => compulsory to add prefix
		double d = 10.f;
	}

}
