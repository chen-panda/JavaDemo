package day04;

import java.util.Scanner;

/**
 * Java中的分支语句-switch
 * 格式：
 * switch(值){
 * 	case 值1：
 * 		代码块1；
 * 	case 值2：
 * 		代码块2；
 * 	...
 * 	default:
 * 		代码块
 * }
 * 
 * 表示：会根据switch括号中值去匹配case中的值，一旦匹配到，就会从当前对应的代码块开始一直往下执行，直到遇到break或者switch结束
 * 		如果匹配不到值，就会执行default中的代码
 * 
 * 注意：
 * 		在switch中如果想要让代码块不在继续往下执行，可以在代码块的后面加break
 * 
 * 面试题： switch和if的区别，什么时候用switch，什么时候用if
 * 		答： if括号中存放的是条件语句，条件语句的结果是Boolean类型，可以是一个范围
 * 			switch括号中，放的是一个具体的值
 *      如果：知道某个条件，或者范围时，一般使用if
 *      如果：需要根据某个值去匹配其他值时,(多个固定值)，用switch
 *      
 *      
 * 面试题：switch括号中可以放哪些类型的值？
 * 		只能放  byte，short，char int,String,枚举
 * 		注意：在jdk1.7以前，String是不能放的
 * 
 *  
 * switch 中的case语句有顺序限制么？
 * 
 * @author NING MEI
 *
 */
public class SwitchDemo {
	public static void main(String[] args) {
		int num = 1;
		switch(num){
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;//结束语句
			case 3:
				System.out.println(3);
				break;
			default:
				System.out.println(4);
				break;
		}
		
		
		//运用switch解决游戏中人物移动
		Scanner key = new Scanner(System.in);
		System.out.println("请输入指令");
		String con = key.next();
		switch(con){
			case "a":
				System.out.println("向左移动");
				break;
			case "W":
			case "w":
				System.out.println("向上移动");
				break;
			case "S":
			case "s":
				System.out.println("向下移动");
				break;
			
			case "d":
				System.out.println("向右移动");
				break;
			default:
				System.out.println("没事别瞎jb按");
		}
		key.close();
	}
}
