package day01;
/**
 *作业2： 测出，int，short，long，char的最大值，最小值，尺寸
 * Java中的数据类型：
 * 基本数据类型：
 * 	整型：Java中用来表示整数的数据类型
 * 					位数                       最大值                          最小值
 * 		byte        8           127(2^7-1)         -128(-2^7)
 * 		short		16          2^15-1             -32768(-2^15)
 * 		int         32          2^31-1               -2^31
 *      long        64          2^63-1               -2^63
 *  字符型：Java中用来表示文字或者符号的数据类型
 *  	注意：每一个字符，都有一个对应的数值（每个字符都可以转换成一个整数，这个整数的范围是0-65535）
 *  	char        16
 *  浮点型：Java中用来表示小数的数据类型  
 *  	float 单精度小数 （不常用）
 *  	double 双精度小数（常用）
 *  布尔类型： Java中用来表示真假，对错，是否 数据类型
 *  	boolean ：只有两个值   true  表示真，对，是   
 *    			  false 表示假，错，否
 *      
 *      
 * 引用数据类型：JDK中封装的类，以及自定义的Java类都属于引用数据类型 
 * 	每一中基本数据类型都对应的有引用数据类型，里面封装了对基本数据类型操作的常量和方法
 * 	基本数据类型               引用数据类型
 * 	byte    			Byte
 *  short               Short
 *  int                 Integer
 *  long                Long
 *  char                Character
 *  float               Float
 *  double              Double
 *  boolean             Boolean
 * 
 * 
 * 面试题：Java中有几种数据类型？
 * 
 *
 */
public class ClassDemo02 {
	public static void main(String[] args){
		//获取byte的最大值
		System.out.println("byte的最大值："+Byte.MAX_VALUE);
		//获取byte的最小值
		System.out.println("byte的最小值："+Byte.MIN_VALUE);
		//byte的尺寸（位数）
		System.out.println("byte的位数："+Byte.SIZE);
	}
}
