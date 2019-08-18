package day07;

import java.util.Random;

/**
 * 模拟英雄对战
 * @author NING MEI
 *
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		//第一个英雄的名字
		String name1 = "cxk";
		//第一个英雄的血量
		int blood1 = 700;
		//第一个英雄的技能列表
		String[] sk1 = {"唱","跳","rap","律师函警告"};
		//第一个英雄的技能伤害
		int [] skhrt = {70,  80, 150, 200};
		
		//第二个英雄的名字
		String name2 = "zdd";
		//第二个英雄的血量
		int blood2 = 800;
		//第二个英雄的技能列表
		String[] sk2 = {"翻白眼","颜值攻击","吐痰","嘲讽"};
		//第二个英雄的技能伤害
		int [] skhrt2 = {60,90,160,190};
		
		Random rd = new Random();
		//游戏开始时，
		//让cxk随机释放一个技能，对zdd进行攻击
		//让zdd随机释放一个技能，对cxk进行攻击
		//死循环，让两人干到死为止
		while(true){
			//生成一个随机数，随机选取一个技能
			int index1 = rd.nextInt(sk1.length);
			//选取技能
			String s1 = sk1[index1];
			//根据随机数，取出技能伤害
			int hr1 = skhrt[index1];
			//让第二个英雄的血量减少
			blood2 -= hr1;
			System.out.println(name1+" 使用了 "+s1+" 技能对 "+name2+"造成了 "+hr1+"点伤害，"+name2+" 还剩"+blood2+"点血");
			//如果第二个英雄血量小于0
			if(blood2<=0){
				System.out.println(name1+"杀死了"+name2+"，成功吃鸡！！");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//第二个英雄释放技能，打第一个英雄
			//生成一个随机数，随机选取一个技能
			int index2 = rd.nextInt(sk2.length);
			//选取技能
			String s2 = sk2[index2];
			//根据随机数，取出技能伤害
			int hr2 = skhrt2[index2];
			//让第一个英雄的血量减少
			blood1 -= hr2;
			System.out.println(name2+" 使用了 "+s2+" 技能对 "+name1+"造成了 "+hr2+"点伤害，"+name1+" 还剩"+blood1+"点血");
			//如果第一个英雄血量小于0
			if(blood1<=0){
				System.out.println(name2+"杀死了"+name1+"，成功吃鸡！！");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
