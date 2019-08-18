package day07;

import java.util.Arrays;

/**
 * Java中的数组：用来存放一系列数据类型相同的元素（数据的类型需要一样）
 * 数组是一种引用数据类型
 * 
 * 数组定义的格式：
 * 格式一：
 * 		数据类型[] 数组名 = new 数据类型[数组长度];
 * 
 * 格式二：
 * 		数据类型[] 数组名 = {值1,值二,....，值n};
 * 
 * 格式三：
 * 		数据类型[] 数组名 = new int[]{值1,值二,....，值n};
 * 
 * 注意：
 *    1.直接输出数组名会输出数组在内存中的地址，如果需要输出数组中的内容，需要通过Arrays.toString(数组名)
 *    2.如果定义的数组中没有手动存放数据的话，数组中会默认存放，对应数据类型的默认值
 *    	int 默认值 0   boolean  默认值 false
 *      double 默认值 0.0    String（引用数据类型的） 默认值都是null
 *    3.数组定义时，必须指定长度
 *    
 * 	
 * 
 * 
 *
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int b = 0;
		b = 1;
		System.out.println(b);//1
		//数据类型[] 数组名 = new 数据类型[数组长度];
		int [] ary = new int[3];//表示定义了一个长度为3的数组，数组里面只能放int类型的数据
		double [] ds = new double[5];
		boolean [] bs = new boolean[3];
		String [] sts = new String[3];
		//打印数组
		System.out.println(ary);//[I@15db9742，输出的是数组在内存中的地址
		System.out.println(ds);//[D@6d06d69c
		//打印数组中的内容：Arrays.toString(数组名)
		System.out.println(Arrays.toString(ary));
		System.out.println(Arrays.toString(ds));
		System.out.println(Arrays.toString(bs));
		System.out.println(Arrays.toString(sts));
		
		//
		//int[] arys = new int[]; //错误，数组定义时必须指定长度
		
		//数据类型[] 数组名 = {值1,值二,....，值n};
		//格式二：适用与知道数组中的内容
		String [] names = {"徐凤年","wyf","lh"};
		System.out.println(Arrays.toString(names));
		
		//数据类型[] 数组名 = new int[]{值1,值二,....，值n};
		String [] books = new String[]{"诛仙","坏蛋是怎样练成的","昆仑","雪中悍刀行"};
		System.out.println(Arrays.toString(books));
		
		
		//使用数组
		//获取数组的长度 数组名.length
		System.out.println(books.length);
		
		//获取数组中的元素  格式:  数组名[下标(位置)]
		//注意：数组的下标从0开始
		System.out.println(books[1]);
		//获取数组最后一个元素  数组名[数组名.length-1]
		System.out.println(books[books.length-1]);
		//ArrayIndexOutOfBoundsException 数组下标下标越界
		//访问了数组不存在的元素
		System.out.println(books[6]);
		
		//修改数组中的某个位置的元素  格式： 数组名[位置] = 值;
		books[2] = "金瓶梅";
		System.out.println(Arrays.toString(books));
		
		char[] cs = new char[]{'唱','跳'};
		String names1 =new String(cs,0,cs.length);
		System.out.println(names1);
		
		String ns = Arrays.toString(books);
		//遍历数组:将数组中的元素逐个访问到
		//核心原理：逐个使用下标，将数组中的元素取出
		// i可以作为数组的下标，从0开始，到数组的长度-1
		for(int i=0;i<books.length;i++){
			System.out.println("第"+(i+1)+"循环:"+books[i]);
		}
		
		System.out.println("遍历前："+Arrays.toString(ary));
		//遍历数组，给新建的数组赋值
		for(int i=0;i<ary.length;i++){
			ary[i] = i*10;
		}
		System.out.println("遍历后："+Arrays.toString(ary));
		
		
		
		
	}
}
