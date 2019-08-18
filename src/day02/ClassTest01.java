package day02;

import java.util.Scanner;

/**
 * 案例一：键盘输入两个数字，输出这两个数的和
 * 
 * 算术运算符： + - *  "/"   %
 * 注意： 当使用  “/”时，如果左右两边都是整数，就做相除取整运算
 * 	    如果左右两边有任何一边是小数，就做正常的除法运算
 * @author NING MEI
 *
 */
public class ClassTest01 {
	
	public static void main(String[] args){
		//1.创建键盘扫描器
		Scanner key = new Scanner(System.in);
		//提示用户输入第一个数字
		System.out.println("请输入第一个数字：");
		//接收第一个数字
		int num = key.nextInt();
		//提示输入第二个数字
		System.out.println("请输入第二个数字");
		//接收第二个数字
		//int num1 = key.nextInt();
		double num1 = key.nextDouble();
		//将两个数字加起来，得出结果
		double sum = num/num1;
		//输出结果
		System.out.println(num+"/"+num1+"="+sum);
		//关闭键盘扫描器
		key.close();
		
	}
}
