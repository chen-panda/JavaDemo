package day03;

import java.util.Scanner;

/**
 * ��Ŀ�����
 * ��ʽ���������ʽ?ֵ1:ֵ2��
 * �������ʽ�����������Ƚϣ��������ɵģ����ս��Ϊtrue����false�ı��ʽ
 * ���壺����������ʽ���Ϊtrue��ȡֵ1��Ϊ���յĽ����������Ϊfalse��ȡֵ2��Ϊ���
 * 
 *  ע�⣺��ʽ�е�ֵ1��ֵ2 ���ǵ��������ͣ�����һ��
 *
 */
public class ClassDemo04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("����������:");
		int age = key.nextInt();
		//String��Java�е��ַ���
		//String say = age>=18?"���Խ�������":"��ȥ����~~";
		double i = age>=18?10:0.1;
		//System.out.println(say);
		
//		int j = 10;
//		double d = j;
		key.close();
		
		
	}
}
