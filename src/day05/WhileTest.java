package day05;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜价格游戏
 * 随机生成一个商品的价格
 * 每位玩家有五次机会去猜价格
 * 如果玩家价格猜低了提示他猜低了
 * 如果玩家价格猜高了提示他猜高了
 * 如果玩家价格猜对了价格提示他猜对了，可以获得商品
 * 
 * 五次机会用完，GameOver
 * 
 *
 */
public class WhileTest {
	public static void main(String[] args) {
//		//Java中生成随机数的方式
//		//第一种 ： Math类 
//		//Math.radom()  在0-1之间随机生成一个小数
//		System.out.println(Math.random());
//		//要生成一个 0-10之间的小数？
//		System.out.println(Math.random()*10);
//		//要随机生成0-10之间的整数
//		System.out.println((int)(Math.random()*10));
//		
//		//第二种：Random类
//		Random  rd = new Random();
//		//使用rd.nextInt(num)生成随机整数
//		//表示：在[0,num)区间随机生成整数
//		int num = rd.nextInt(3);
//		System.out.println("num:"+num);
//		
		
		Random  rd = new Random();
		//1.随机生成商品的价格（100以内）
		int price = rd.nextInt(100);
		System.out.println(price);
		//2.定义扫描器
		Scanner key = new Scanner(System.in);
		//3.搭建循环结构循环5次
		int n = 1;
		while(n<=5){
			System.out.println("请输入所猜的价格：");
			//接收输入的价格
			int num = key.nextInt();
			//比较输入的价格与随机的价格
			if(num<price){
				System.out.println("猜小了~~");
			}else if(num>price){
				System.out.println("猜大了~~");
			}else {
				System.out.println("恭喜你猜对了~~CXK是你的了~~~");
				break;
			}
			n++;
		}
		key.close();
		
		
		
	}
}
