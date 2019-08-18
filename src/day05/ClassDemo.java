package day05;

import java.util.Scanner;

/**
 * 攀哥
 * 软帝集团
 * 
 * 20天学会Java开发
 * 
 * 今天的任务：写一段价值百万的人工智能代码
 * 
 * while循环
 * 格式：
 * while(条件语句){
 * 		//代码块
 * }
 * 条件语句成立（值为true） 那么就会一直重复执行代码块，直到 条件语句不成立
 *
 */
public class ClassDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//上课吃到，罚大家去田径场跑10圈
		//true 表示条件恒成立，表明循环是死循环
		//需要一个变量，用来控制条件语句
		int n = 1;
		while(n<=10){
			System.out.println("攀哥！我跑了"+n+"圈了,可以停止了么？Y/N");
			String con = key.next();
			//如果回答Y就停止
			if(con.equalsIgnoreCase("y")){
				System.out.println("停下来吧，下次再迟到，罚你扫厕所~~");
				break;//结束语句，结束循环
			}else{
				System.out.println("别停，继续跑~~");
			}
		
			n++;//2
		}
		
	}
}
