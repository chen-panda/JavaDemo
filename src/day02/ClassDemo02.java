package day02;
/**
 * Java中的类型转换:
 * 自动类型转换（隐式类型转换）：
 * 	  当小范围的数据向大范围的数据类型时，会发生自动类型转换
 *   byte  -> int  (会自动转)
 * 
 * 强制类型转换（显示类型转换）：(慎用)
 * 	当大范围的数据类型向小范围数据类型时，需要强制类型转换
 *   int  -> byte(强制性)
 * 
 * @author NING MEI
 *
 */
public class ClassDemo02 {
	public static void main(String[] args){
		//面试题：
		//对于byte ,short ,char 而言，当发生运算时，运算的结果会被隐式转换成int类型
		short s = 1;
		//short s1 = s+s; s+s之后结果会变成int类型
		//int s1 = s+s;
		short s1 =(short)(s+s);
	    System.out.println(s1);
	    
	    char c = 1;
	    char c1 =(char)(c+c);
	    
	   // byte  -> int  (会自动转)
	    byte b1 = 125;
	    int i1 = b1;//byte的b1 会被自动转换成int类型
	    
	    //面试题
	    int i2 = -130;
	    //强制类型转换   
	    byte b2 = (byte)i2;//i2是int类型，如果需要转换成byte类型，就需要强制类型转换
	    System.out.println(b2);//
	    
	    
	    
	    
	    
	}
}
