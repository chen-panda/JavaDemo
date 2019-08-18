package day04;

import java.util.Scanner;

/**
 * 控制台输入 年份，和月份
 * 输出 这一年 这一个月一共有多少天
 * 比如：
 * 输入：2019 年  8 月
 * 输出：2019年8月一共有31天
 * 
 * 31天：  1  3  5  7  8  10  12
 * 30天：  4  6  9  11
 * 
 * 2月：
 * 		润年：29
 *      平年：28
 *      
 * 判断润年公式： year%4==0&&year%100!=0||year%400==0
 * 
 *
 */
public class IFTest {
	public static void main(String[] args) {
		//定义扫描器
		Scanner key = new Scanner(System.in);
		//提示输入年份
		System.out.println("请输入年份：");
		//接收输入的年份
		int year = key.nextInt();
		//提示输入月份
		System.out.println("请输入月份:");
		int month = key.nextInt();
		//定义变量，接收每个月的天数
		int days = 0;
		//如果是1，3，5，7，8，10，12 都是31天
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			//System.out.println(year+"年"+month+"月，一共有31天");
			days = 31;
		}else if(month==4||month==6||month==9||month==11){
			//System.out.println(year+"年"+month+"月，一共有30天");
			days = 30;
		}else if(month==2){
			//判断是否是润年
			if(year%4==0&&year%100!=0||year%400==0){
				//System.out.println(year+"年"+month+"月，一共有29天");
				days = 29;
			}else{
				//System.out.println(year+"年"+month+"月，一共有28天");
				days = 28;
			}
		}else{
			System.out.println("请正确输入月份");
		}
		System.out.println(year+"年"+month+"月，一共有"+days+"天");
		key.close();
		
		
	}
}
