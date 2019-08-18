package day06;
/**
 * 经典笔试题：
 * 今有稚兔同笼，上有三十五头，下有九十四足，问稚兔几何？
 * 鸡兔同笼问题：
 * 现在若干只鸡和若干只兔，丢到一个笼子里
 * 从上面看，有35个头
 * 从下面看，94只脚
 * 问 有多少只鸡，有多少只兔子
 *
 */
public class ForTest01 {
	public static void main(String[] args) {
		//假设鸡有x只
		//假设兔子有35-x
		for(int x = 0;x<=35;x++){
			//获取兔子的数量
			int y = 35-x;
			if(x*2+y*4==94){
				System.out.println("鸡有："+x+"只");
				System.out.println("兔子有："+y+"只");
			}
			
		}
	}
}
