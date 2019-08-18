package day08;
/**
 *  定义用来做两个数加法运算的方法
 *  方法定义的格式：
 *  public static  返回值类型  方法名(参数列表){
 *  
 *  }
 *  返回值类型：执行方法后，返回的数据类型.如果需要返回数据，就在此处加对应数据的数据类型，如果没有返回值，就在此处加void
 *  方法名：方便后面找到此方法的,命名方式和变量的命名方式一致
 *  参数列表：执行此方法需要依赖的第三方数据
 */
public class Method01 {
	/**
	 * 计算两个数的和
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int add(int num1 ,int num2){
		
		return num1+num2;
	}
	
	
	/**
	 * 定义一个方法，计算圆的面积
	 * double r 圆的半径
	 */
	public static double area(double r){
		//将结果，返回给调用方法的地方
		return  3.14*r*r;
	}
	
	
	/**
	 * 定义一个 计算 矩形面积的方法
	 * 
	 */
	public static int area(int w,int h){
		return w*h;
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int result = add(12,13);
		int res1 = add(15,78);
		
		double as = area(2);
		int as1 = area(18,2);
		System.out.println(result);
		System.out.println(res1);
		System.out.println(as);
		System.out.println(as1);
	}
	
}
