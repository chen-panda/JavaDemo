package day06;
/**
 * 今天的目标：KO掉N个笔试编程题
 * for 循环
 * 
 * for(表达式1;条件表达式;表达式2){
 * 		代码块
 * }
 * 
 * 表达式1：通常 定义变量 用来设置循环的起点，比如 ：int i=0; (只执行一次)
 * 条件表达式：判断条件，如果条件成立，就循环重复执行代码块
 * 表达式2：修改变量的值，让变量逐渐趋近于条件节点 （在单次循环中最后执行）
 * 
 * for循环：每次循环之前，需要判断一下条件表达式是否成立，如果成立才执行代码块，否则就不执行
 * 
 * 每一种while循环都可以转换成for循环
 * 
 * while循环和for循环选择的一般建议：
 * 如果不知道循环次数，建议使用while循环
 * 如果知道具体循环多少次，建议用for循环
 *
 */
public class ForDemo {
	public static void main(String[] args) {
		//while循环:死循环
//		while(true){
//			System.out.println("你的笑像条恶犬，撞乱我心旋");
//		}
		
		//for 循环: 死循环
//		for(;;){
//			System.out.println("要打篮球先打我！！");
//		}
		
		//while循环：控制循环次数
		//循环10次
		int n = 1;
		while(n<=10){
			System.out.println("循环"+n+"次");
			n ++;
		}
		
		//for循环：控制循环次数
		for(int i=1;i<=10;i++){
			System.out.println("调戏小黑"+i+"次");
		}
		
		//for(表达式1;条件表达式;表达式2){ 代码块}
		// 语句执行的顺序
		int j = 0;
		for(System.out.print("1");j<10;System.out.println("2")){
			System.out.print(3);
			j++;
		}
		//
		
	}
}
