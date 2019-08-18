package day02;
/**
 * 今天的目标：掌握变量，运算符
 * 变量：可以改变的量（非专业回答）
 * 变量：计算机用来存储可变数据的内存空间（专业）
 * 变量：类似于酒店的房间，也类似与文本文档
 * 变量创建方式类似于创建文本文档的方式：
 *	创建变量的步骤：
 * 1.确定变量的类型和名字（声明变量）
 * 2.给变量赋值（变量的初始化）
 * 
 * 变量的命名规则（法律）：
 * 	 以字母，下划线或者 $ 开始，不能包含特殊符号(+，-，*，/等)，不能使用Java关键字
 * 
 * 
 * 变量的命名规范（道德）：
 *   驼峰命名法： 首字母小写，如果有多个单词组成，从第二个单词开始，首字母大写  startGame
 *   见名知意：看见变量名，就知道表示的含义 startGame  开始游戏
 *   
 *   
 * 使用变量时需要注意的问题：
 * 变量使用之前必须经过声明并且初始化  
 * 
 * 
 * @author NING MEI
 *
 */
public class ClassDemo01 {
	public static void main(String[] args){
		//1.声明变量
		byte b1 ;
		//2.给变量赋值(变量的初始化)
		b1 = 122;
		//使用b1变量
		//System.out.println(b1);
		b1 = 126;
		System.out.println(b1);
		
		//创建变量时，将两步可以写在一起
		//创建变量的格式： 数据类型 变量名 = 变量值;
		int i1 = 128;
		
		//有些书上定义变量
		byte b,b2,b3;//不建议这样写
		
		//
		//byte  2b;//错误，用数字开始了
		//byte &s_2s;//错误，有特殊符号
		byte $_public;//正确
		//byte public ;错误
		byte ￥s;
		
		//System.out.println(b2);//错误，没有初始化
		//a = 3;//a 没有声明类型
		//System.out.println(a);
		
		
		//使用变量时需要注意的问题
		//byte b2 = 123;  Java中变量名不能重复定义
		//byte  -128到127 
		//byte b4 = 128;  赋值时，值不能超过数据类型所能表示的范围
		//long的最大值 ：9223372036854775807
		//在编译器中，默认的整数类型是int类型，如果超出int表示范围就会出错
		//如果需要定义long类型的数据，一般建议加 l或者L
		long lon = 2147483648L;
		
		double d1 = 0.1;
		//编译器默认的小数类型是double类型，如果需要定义float类型的小数，需要在后面添加f 或者F
		float f1 = 0.1f;
		
		
	}
}
