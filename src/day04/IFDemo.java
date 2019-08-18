package day04;

import java.util.Scanner;

/**
 * 格式三：
 * 
 * if(条件语句1){
 * 	//代码块1
 * }else if(条件语句2){
 * 	//代码块2
 * }else if(条件语句3){
 * 	//代码块3
 * }
 * ...
 * else{
 * 	//代码块
 * }
 * 表示：从上到下依次判断条件语句是否成立，如果条件语句成立就执行对应的代码块，如果所有的条件都不成立，就执行else中的代码块
 * 		一旦执行代码块之后，整个if语句就结束了。不管后面的其他条件语句是否成立，都不会执行
 * @author NING MEI
 *
 */
public class IFDemo {
	public static void main(String[] args) {
//		 int num = 4;
//		 if(num<5){
//			 System.out.println(1);
//		 }else if(num<6){
//			 System.out.println(2);
//		 }else if(num>7){
//			 System.out.println(3);
//		 }else{
//			 System.out.println(4);
//		 }
		
		//模拟德玛西亚之力释放技能
		// Q W E R
		//1.定义键盘扫描器
		Scanner key = new Scanner(System.in);
		//2.请释放技能
		System.out.println("按 Q W E R 释放技能");
		// next数据类型()   nextInt()  ,nextDouble()
		//注意：键盘扫描不能扫描字符，扫描出来的是字符串
		String con = key.next();
		//根据按键，释放技能
		//注意：比较字符串，不能使用== ，需要使用equals或者equalsIgnoreCase
		if(con.equalsIgnoreCase("Q")){
			System.out.println("致命打击：小子！你的胸口可能缺了小拳拳的敲打~~");
		}else if(con.equalsIgnoreCase("W")){
			System.out.println("勇气：我感受到了来自梁静茹的力量~~");
		}else if(con.equalsIgnoreCase("E")){
			System.out.println("审判：你要接收社会主义的制裁");
		}else if(con.equalsIgnoreCase("R")){
			System.out.println("德玛西亚正义：带你去看大宝剑");
		}else{
			System.out.println("没事别瞎jb按");
		}
		
		key.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
