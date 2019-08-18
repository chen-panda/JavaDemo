package day01;

import org.junit.Test;

/**
 * 文档注释：  API帮助文档，可以生成API帮助文档
 * 文档注释：用在类前，方法前
 * Java中的注释：相当于读书是做的笔记
 * Java类：人类，鸟类，畜生类
 * 会把一系列具有相同特点和行为的物体归纳到一起称之为一类
 * Java类表示Java世界中的数据类型
 * Java类 用class修饰，class后面的称为类名
 * 比如：Java中要表示人类
 * class 人{
 * 
 * }
 * 
 * @author NING MEI
 *
 */
public class ClassDemo {
	/*
	 * Java中的多行注释：无法生成帮助文档。当需要一次注释多行时
	 * Java程序的入口：main
	 * 如果需要写一个可以运行的Java程序，就必须提供入口
	 * 入口格式固定
	 * 常见错误：如果运行时run as 没有Java Application选项，说明要么没有main，要么main格式错误
	 */
	public static  void main(String[] args){
		//Java中的单行注释：一次只能注释一行
		//Java中的打印输出语句：会在控制台中打印括号中的内容
		//System.out.print("内容");
		System.out.print("德玛西亚:");
		System.out.print("人在塔在");
		//System.out.println("内容")
		//ln 表示打印输出内容之后换行
		System.out.println("菜虚昆：要打篮球先打我");
		System.out.println("鸡你太美");
		
		//Java中常用的转义字符
		// \n  :表示换行符 ，相当于键盘上的Enter键
		System.out.println("蛮族之王：\n我的大刀早已\n饥渴难耐");
		// \t :表示制表符，相当于键盘的Tab键
		System.out.println("徐凤年：\t秀东\t春雷在手，天下\t我有！");
		
		
		//常见笔试题：
		//+号可以用来做加法运算，也可以用来连接内容
		//当+遇到双引号之前，都做正常加法运算
		//遇到双引号开始以及之后，都只做连接
		System.out.println(1+1+"1"+1+1);//2111
		System.out.println(1+"1"+1+1+1);//11111
		System.out.println(1+1+"1"+(1+1));//212
		
		
	}
}
