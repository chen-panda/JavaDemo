package day02;

import java.util.Scanner;

/**
 * ����һ�����������������֣�������������ĺ�
 * 
 * ����������� + - *  "/"   %
 * ע�⣺ ��ʹ��  ��/��ʱ������������߶����������������ȡ������
 * 	    ��������������κ�һ����С�������������ĳ�������
 * @author NING MEI
 *
 */
public class ClassTest01 {
	
	public static void main(String[] args){
		//1.��������ɨ����
		Scanner key = new Scanner(System.in);
		//��ʾ�û������һ������
		System.out.println("�������һ�����֣�");
		//���յ�һ������
		int num = key.nextInt();
		//��ʾ����ڶ�������
		System.out.println("������ڶ�������");
		//���յڶ�������
		//int num1 = key.nextInt();
		double num1 = key.nextDouble();
		//���������ּ��������ó����
		double sum = num/num1;
		//������
		System.out.println(num+"/"+num1+"="+sum);
		//�رռ���ɨ����
		key.close();
		
	}
}
