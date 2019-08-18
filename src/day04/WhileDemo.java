package day04;
/**
 * Java中的循环语句 - while循环
 * 循环：重复去做某件事情
 * 格式：
 * 	while(条件表达式){
 * 		代码块
 * 	}
 * 表示：只要条件表达式成立，就会一直反复执行代码块，直到条件表达式不成立为止
 * @author NING MEI
 *
 */
public class WhileDemo {
	public static void main(String[] args) {
//		while(true){
//			System.out.println("从前有座山");
////			try {
////				Thread.sleep(1000);
////			} catch (InterruptedException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//			System.out.println("山里有个庙");
////			
////			System.out.println("庙里有个老和尚在给小和尚讲故事");
////			
////			System.out.println("讲什么呢？");
////			
////		}
		//笔试题：
//		while(true){
//			System.out.println("O(∩_∩)O！！你中毒了");
//		}
//		System.out.println("┭┮﹏┭┮");
		
		//编译器只能管到编译期时的代码，true是字面量，他的值在编译期就能确定，n是变量，它的值在运行期时确定，在编译期时，编译器没有办法获取n的值
		//从而也就没有办法判断出n是否小于8，所以无法判断出是否是死循环。
		int n = 6;
		while(n<8){
			System.out.println("O(∩_∩)O！！你中毒了");
		}
		System.out.println("┭┮﹏┭┮");
		
	}
}
