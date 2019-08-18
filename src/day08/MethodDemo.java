package day08;
/**
 * Java中的方法（函数）：规定做一件事情的流程
 * 方法的好处：
 * 	可以提高代码的复用性，简化开发，提高开发效率
 * 创建方法的建议：
 * 	方法=工具 ，
 *  一般会将一套固定的流程，抽离出来，定义成方法。
 * 
 * 乔峰打一套降龙十八掌掌 ：
 * 1.扎马步
 * 2.双手伸开
 * 3.手左右推几下
 * 4.手上下来回翻滚
 * 5.向前推
 * 
 * 乔峰 遇到 鸠摩智 要打降龙十八掌
 * 
 * @author NING MEI
 *
 */
public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("乔峰走在路上，遇到了鸠摩智");
		xiang18zhang();
//		System.out.println("~扎马步");
//		System.out.println("~双手伸开");
//		System.out.println("~手左右推几下");
//		System.out.println("~手上下来回翻滚");
//		System.out.println("~向前推");
		System.out.println("一条龙出来了把鸠摩智打死了~~");
		
		System.out.println("乔峰走在路上，遇到了慕容复");
		xiang18zhang();
//		System.out.println("~扎马步");
//		System.out.println("~双手伸开");
//		System.out.println("~手左右推几下");
//		System.out.println("~手上下来回翻滚");
//		System.out.println("~向前推");
		System.out.println("一条龙出来了把莫容复打死了~~");

	}
	
	/**
	 * 方法
	 * 规定释放降龙十八掌的过程
	 */
	public static  void xiang18zhang(){
		System.out.println("~扎马步");
		System.out.println("~双手伸开");
		System.out.println("~手左右推几下");
		System.out.println("~手上下来回翻滚");
		System.out.println("~向前推");
	}
	
}
