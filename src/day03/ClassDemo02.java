package day03;

import java.util.Scanner;

/**
 * 位运算符
 *   |  或  :左右两边有一边为true整个结果就为true
 *   &  与 ：左右两边都为true时，整个结果才为true
 *   
 *   | 或，左右两边都是整数时，做按位或（先将整数转换成2进制，然后在将两个二进制数按位或，有一个为1，结果就为1，将最后的结果再转换成10进制）
 *
 */
public class ClassDemo02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1 = key.nextInt();
		System.out.println("请输入第二个数字");
		int num2 = key.nextInt();
		System.out.println(num1<num2|num1==num2);
		System.out.println(num1<num2&num1==num2);
		
		//面试题 3|4 =？
		System.out.println(3|4);//7
		System.out.println(3&4);//0
		
		
		key.close();
	}
}
