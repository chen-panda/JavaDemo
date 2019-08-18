package day02;

import java.util.Scanner;

/**
 * 键盘扫描器的使用：Scanner
 * 作用：可以接受键盘输入的内容，传输到程序中
 * 键盘扫描器的使用步骤：
 * 1.创建键盘扫描器 ：  Scanner key = new Scanner(System.in);
 * 2.提示用户输入内容：
 * 3.接收用户输入的内容
 * 4.使用完毕之后关闭键盘扫描器
 * @author NING MEI
 *
 */
public class ClassDemo {
	public static void main(String[] args){
		//创建键盘扫描器
		Scanner key = new Scanner(System.in);
		//提示用户输入内容
		System.out.println("请输入一个整数:");
		//接收用户输入的内容 key.next数据类型();
		//如果出现java.util.InputMismatchException 说明输入的数据类型和接收的数据类型不匹配
		int num = key.nextInt();
		System.out.println("您输入的内容为:"+num);
		//使用完毕扫描器，将扫描器关闭
		key.close();
	}
}
