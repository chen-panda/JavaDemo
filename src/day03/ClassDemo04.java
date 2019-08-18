package day03;

import java.util.Scanner;

/**
 * 三目运算符
 * 格式：条件表达式?值1:值2；
 * 条件表达式：由条件（比较）运算符组成的，最终结果为true或者false的表达式
 * 含义：如果条件表达式结果为true就取值1作为最终的结果，如果结果为false就取值2作为结果
 * 
 *  注意：格式中的值1和值2 他们的数据类型，必须一样
 *
 */
public class ClassDemo04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("请输入年龄:");
		int age = key.nextInt();
		//String是Java中的字符串
		//String say = age>=18?"可以进入网吧":"回去喝奶~~";
		double i = age>=18?10:0.1;
		//System.out.println(say);
		
//		int j = 10;
//		double d = j;
		key.close();
		
		
	}
}
