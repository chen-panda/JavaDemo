package day03;

import java.util.Scanner;

/**
 * 运算符
 * 条件（比较）运算符： 运算的结果是boolean类型的   值只有两个 true   ,false
 * 
 * 比如：  <  >  <=  >=  ==   !=（不等于）
 * @author NING MEI
 *
 */
public class ClassDemo01 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int num1 = key.nextInt();
		System.out.println("请输入第二个数字");
		int num2 = key.nextInt();
		System.out.println(num1+"<"+num2+"? 结果："+(num1<num2));
		System.out.println(num1+">"+num2+"? 结果："+(num1>num2));
		System.out.println(num1+"<="+num2+"? 结果："+(num1<=num2));
		System.out.println(num1+">="+num2+"? 结果："+(num1>=num2));
		System.out.println(num1+"=="+num2+"? 结果："+(num1==num2));
		System.out.println(num1+"!="+num2+"? 结果："+(num1!=num2));
		key.close();
	}
}
