package day03;

import java.util.Scanner;

/**
 * �߼������
 *    ||  ��  ����������һ��Ϊtrue���������Ϊtrue
 *    
 *    &&  ��  �������߶�Ϊtrueʱ�����������Ϊtrue��ֻҪ��һ��Ϊfalse���������Ϊfalse
 * 
 * @author NING MEI
 *
 */
public class ClassDemo03 {
	public static void main(String[] args) {
//		Scanner key = new Scanner(System.in);
//		System.out.println("�������һ������");
//		int num1 = key.nextInt();
//		System.out.println("������ڶ�������");
//		int num2 = key.nextInt();
//		
//		System.out.println(num1<num2||num1==num2);//true
//		System.out.println(num1<num2&&num1==num2);//false
//		key.close();
//		
		//������
		int x = 1;
		int y = 2;
		int z = 3;
		
//		boolean ok = x++<y++|++y<z++;
//		System.out.println(ok);//true
//		System.out.println("x:"+x);//2
//		System.out.println("y:"+y);//4
//		System.out.println("z:"+z);//4
		
		/*
		 * &&  �� ||  ���������·
		 * 
		 *   ����|| ���ԣ�����������һ��Ϊtrue�����Ϊtrue��Ҳ���ǣ������Ϊtrueʱ��
		 *   �ұߵĽ��������Ľ��û��Ӱ�죬��ʱ�Ͳ���Ҫִ���ұߵĴ��룬�ұߵĴ���ͻᱻƵ�յ�������·��
		 * 
		 */
		boolean ok = x++>y++&&++y<z++;
		System.out.println(ok);//true
		System.out.println("x:"+x);//2
		System.out.println("y:"+y);//3
		System.out.println("z:"+z);//3
		
		
		//�ԼӺ��Լ�
		//�Լӣ�
		//  ǰ++  ���� ++j  ��ʾ�����Լ�1  �ٰѼ�1��Ľ����ֵ��ȥ
		//  ��++  ���� j++  ��ʾ���Ȱ��Լ���ֵ��ֵ��ȥ�����Լ�1
		int j = 1;
		int i = j++;
		System.out.println(i);//1
		System.out.println(j);//2
		
		i = ++j;
		System.out.println(i);//3
		System.out.println(j);//3
		
		//�Լ�
		// ǰ-- ����--j  ��ʾ�����Լ�1  �ٰѼ�1��Ľ����ֵ��ȥ
		// ��-- ����j--  ��ʾ���Ȱ��Լ���ֵ��ֵ��ȥ�����Լ�1
		
	}
	
}
