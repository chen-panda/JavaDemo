package day03;

import java.util.Scanner;

/**
 * λ�����
 *   |  ��  :����������һ��Ϊtrue���������Ϊtrue
 *   &  �� ���������߶�Ϊtrueʱ�����������Ϊtrue
 *   
 *   | ���������߶�������ʱ������λ���Ƚ�����ת����2���ƣ�Ȼ���ڽ���������������λ����һ��Ϊ1�������Ϊ1�������Ľ����ת����10���ƣ�
 *
 */
public class ClassDemo02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = key.nextInt();
		System.out.println("������ڶ�������");
		int num2 = key.nextInt();
		System.out.println(num1<num2|num1==num2);
		System.out.println(num1<num2&num1==num2);
		
		//������ 3|4 =��
		System.out.println(3|4);//7
		System.out.println(3&4);//0
		
		
		key.close();
	}
}
