package day06;
/**
 * 经典笔试题：
 * 求出 100-999之间所有的水仙花数
 * 水仙花数： 个位数上的3次方+十位数上的3次方+百位数上的3次方 = 数字本身
 *
 */
public class ForTest {
	public static void main(String[] args) {
		//设置循环
		for(int num = 100;num<=999;num++){
			//num是一个3位数 比如：125 
			//分别取出，每位上的数字
			//取出个位上的数字  125 %10 
			int ge = num%10;
			//取出十位上的数字 125/10= 12%10 = 2
			int shi = num/10%10;
			//取出百位上的数字 125/100 = 1
			int bai = num/100;
			int result = ge*ge*ge +shi*shi*shi+bai*bai*bai;
			if(result==num){
				System.out.println(num);
			}
		}
	}
}
