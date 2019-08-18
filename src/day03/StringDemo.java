package day03;

import java.util.Scanner;

/**
 * Java中的字符串：String
 * 面试题：
 * String是基本数据类型吗？
 * String不是基本数据类型，它是引用数据类型。记住：基本数据类型就8个
 * 
 * 
 * 
 * @author NING MEI
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		//字符型  char
		//char类型的字符，用单引号包裹
		char c = '攀';
		char c1 = '哥';
		//
		//char c1 = '攀哥';//错误，char类型中只能放单个字符
		
		//字符串：一串字符序列，用双引号包裹
		String str1 = "社会我攀哥，人狠会话不多";
		System.out.println(str1);
		//字符串常用的方法
		//获取字符串的长度，字符串中字符的个数，格式： 字符串.length();
		System.out.println(str1.length());
		//获取字符串中某个位置上的字符,格式： 字符串.charAt(位置);
		//字符串的位置，从0开始
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(str1.length()-1));//最后一个字符的位置，可以用字符串的长度-1
		//获取字符串中某个字符第一次出现的位置 ,格式： 字符串.indexof(字符串)
		System.out.println(str1.indexOf('会'));
		System.out.println(str1.indexOf("会我"));//1
		
		//比较字符串的内容
		// asYu
		String str2 = "asYu";
		Scanner key = new Scanner(System.in);
		System.out.println("请输入验证码：");
		//接收字符串  key.next()  或者 key.nextLine()
		//next()当遇到空格或者回车时，就会结束当前扫描(扫描到空字符串"")
		//nextLine() 只有当遇到回车时，才会结束扫描
		String con = key.next();
		System.out.println("您输入的内容为："+con);
		
		//比较字符串，格式 ： 字符串1.equals(字符串2) ,返回值是boolean类型的，true或者false
		//区分大小写
		System.out.println(str2.equals(con));
		
		//比较字符串，忽略大小写 字符串1.equalsIgnoreCase(字符串2)
		System.out.println(str2.equalsIgnoreCase(con));
		
		key.close();
		
		
	}
}
