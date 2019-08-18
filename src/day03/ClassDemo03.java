package day03;

import java.util.Scanner;

/**
 * 逻辑运算符
 *    ||  或  左右两边有一边为true整个结果就为true
 *    
 *    &&  与  左右两边都为true时，整个结果才为true，只要有一边为false整个结果都为false
 * 
 * @author NING MEI
 *
 */
public class ClassDemo03 {
	public static void main(String[] args) {
//		Scanner key = new Scanner(System.in);
//		System.out.println("请输入第一个数字");
//		int num1 = key.nextInt();
//		System.out.println("请输入第二个数字");
//		int num2 = key.nextInt();
//		
//		System.out.println(num1<num2||num1==num2);//true
//		System.out.println(num1<num2&&num1==num2);//false
//		key.close();
//		
		//笔试题
		int x = 1;
		int y = 2;
		int z = 3;
		
//		boolean ok = x++<y++|++y<z++;
//		System.out.println(ok);//true
//		System.out.println("x:"+x);//2
//		System.out.println("y:"+y);//4
//		System.out.println("z:"+z);//4
		
		/*
		 * &&  和 ||  会造成语句短路
		 * 
		 *   对于|| 而言，左右两边有一边为true结果就为true，也就是，当左边为true时，
		 *   右边的结果对整体的结果没有影响，此时就不需要执行右边的代码，右边的代码就会被频闭掉（被短路）
		 * 
		 */
		boolean ok = x++>y++&&++y<z++;
		System.out.println(ok);//true
		System.out.println("x:"+x);//2
		System.out.println("y:"+y);//3
		System.out.println("z:"+z);//3
		
		
		//自加和自减
		//自加：
		//  前++  比如 ++j  表示，先自加1  再把加1后的结果赋值出去
		//  后++  比如 j++  表示，先把自己的值赋值出去，再自加1
		int j = 1;
		int i = j++;
		System.out.println(i);//1
		System.out.println(j);//2
		
		i = ++j;
		System.out.println(i);//3
		System.out.println(j);//3
		
		//自减
		// 前-- 比如--j  表示，先自减1  再把加1后的结果赋值出去
		// 后-- 比如j--  表示，先把自己的值赋值出去，再自减1
		
	}
	
}
