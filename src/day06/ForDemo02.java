package day06;
/**
 * 双重循环
 * 可以用来处理类似于矩阵的问题
 * 
 * 1  2  3  4 
 * 1  2  3  4
 * 1  2  3  4
 * 最外层循环控制行数，循环多少次，就有多少行
 * 最里层循环控制列数，循环多少次，就有多少列
 *
 */
public class ForDemo02 {
	public static void main(String[] args) {
		//双重for循环，外层循环执行一次，里层循环要循环完毕，外层循环才会进行下一次循环
//		for(int i=1;i<10;i++){
//			System.out.println("i:"+i+":%%%%");
//			for(int j=1;j<10;j++){
//				System.out.println("j:"+j);
//			}
//		}
		
		//多重循环时，可以使用标签，标记需要跳出的循环
		// 标签名 :  
		// 跳出指定循环时，使用 break 标签名
		flag:for(int i=1;i<=3;i++){
			for(int j=1;j<=4;j++){
				System.out.print(j+"\t");
				if(j==2){
					//break; //跳出里层循环
					break flag;
				}
			}
			System.out.println();
		}
	}
}
