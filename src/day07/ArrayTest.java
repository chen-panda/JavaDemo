package day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 班上5名同学
 * 统计5名同学的考试成绩
 * 
 * 作业：
 * 计算出总成绩
 * 计算出平均成绩
 * 计算出班级最低分
 * 计算出班级最高分
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		//定义扫描器
		Scanner key = new Scanner(System.in);
		//定义数组，用来存放5名同学的考试成绩
		double[] score = new double[5];
		//遍历数组，分别录入5名同学的考试成绩
		for(int i=0;i<score.length;i++){
			System.out.println("请输入第"+(i+1)+"位同学的考试成绩:");
			//接收考试成绩
			score[i] = key.nextDouble();
		}
		System.out.println("考试成绩表："+Arrays.toString(score));
		key.close();
	}
}
