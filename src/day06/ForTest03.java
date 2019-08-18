package day06;

import java.util.Scanner;

/**
 * 三天打鱼两天晒网
 * 假设攀哥从2010年1月1日开始，三天打鱼两天晒网
 * 输入一个日期，判断出那一天我是应该去打鱼还是应该去晒网
 * 输入日期：2010年1月3日   打鱼     1月4日 晒网
 * 计算输入时间和2010年1月1日：
 * 1  打鱼
 * 2  打鱼
 * 3  打鱼
 * 4  晒网
 * 5  晒网
 * 6  打鱼
 * 7  打鱼
 * 8  打鱼
 * 9  晒网
 * 10  晒网
 * 
 * 相隔天数  days % 5   (3|4)晒网    (0|1|2)打鱼
 * 
 * 2019年1 月1日
 * 
 * 
 * @author NING MEI
 *
 */
public class ForTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = key.nextInt();
		System.out.println("请输入月份：");
		int month = key.nextInt();
		System.out.println("输入日期：");
		int day = key.nextInt();
		//定义总天数
		int days = 0;
		// 输入 2019年 4月 3日
		//1.计算出2010年1月1日到2019年1月1日有多少天  365*9 +2 
		for(int i = 2010;i<year;i++){
			//判断是否是润年
			if(i%4==0&&i%100!=0||i%400==0){
				days += 366;
			}else{
				days += 365;
			}
		}
		
		//2.计算当前输入的年1月1日到输入的月份有多少天
		//输入 2019年 4月 3日 ：计算出2019年1月1日到4月1日的时间
		for(int j=1;j<month;j++){
			switch (j) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days +=31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					days +=30;
					break;
				case 2:
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						days += 29;
					} else {
						days += 28;
					}
				default:
					break;
			}
		}
		//总天数加上日期数
		days += day;
		int res = days%5;
		if(res>=1&&res<=3){
			System.out.println("打鱼");
		}else{
			System.out.println("晒网");
		}
		
		
	}
}
