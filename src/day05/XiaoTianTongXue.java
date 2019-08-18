package day05;

import java.util.Scanner;

/**
 * 人工智能:小甜同学
 * 
 */
public class XiaoTianTongXue {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("您好，小甜同学为您服务");
		while(true){
			String con = key.next();
			//replace替换字符串 
			con = con.replace("我", "");
			con = con.replace("吗", "");
			con = con.replace("？", "!");
			con = con.replace("?", "!");
			con = con.replace("你", "");
			if(con.equals("bye")){
				System.out.println("终于结束了，你这个傻叉！！");
				break;
			}
			System.out.println(con);
		}
		key.close();
		
	}
}
