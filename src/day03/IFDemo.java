package day03;

import java.util.Scanner;

/**
 * Java中的分支语句- if 
 * 作用：条件判断
 * 格式1：
 * 		if(条件表达式){
 * 			//代码块
 * 		}
 * 表示：如果条件表达式成立，结果为true，就会执行代码块，否则就不执行
 * 
 * 格式2：
 * 		if(条件表达式){
 * 			//代码块1
 * 		}else{
 * 			//代码块2
 * 		}
 * 表示：如果条件表达式成立，结果为true，就会执行if语句中的代码块1，否则就执行else中的代码块2
 * @author NING MEI
 *
 */
public class IFDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
//		System.out.println("你是漂亮妹子么？是Q1，不是Q2");
//		int answer = key.nextInt();//answer=2
//		if(answer==1){
//			System.out.println("我们谈恋爱吧~~");
//		}
//		System.out.println("O(∩_∩)O");
		
		System.out.println("攀哥帅么？是Q1 ，不是Q2");
		int answer = key.nextInt();
		if(answer==1){
			System.out.println("别暗恋我~~~");
		}else{
			System.out.println("换一副眼镜再来~~~");
		}
		
		key.close();
	}
}
