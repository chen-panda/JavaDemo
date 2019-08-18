package day05;

/**
 * break 和 continue的区别
 * break 是结束循环
 * continue是跳出本次循环，执行下一次循环
 * 
 * @author NING MEI
 *
 */
public class WhileDemo {
	
	public static void main(String[] args) {
		
		int n = 0;
		while(n<=5){
			n++;
			if(n==3){
				//break;
				continue;//结束当前循环，直接开始下次循环
			}
			//当n=3时，下面代码不再执行
			System.out.println(n);
			
		}
	}
}
