package day03;

import java.util.Scanner;

/**
 * �����
 * �������Ƚϣ�������� ����Ľ����boolean���͵�   ֵֻ������ true   ,false
 * 
 * ���磺  <  >  <=  >=  ==   !=�������ڣ�
 * @author NING MEI
 *
 */
public class ClassDemo01 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = key.nextInt();
		System.out.println("������ڶ�������");
		int num2 = key.nextInt();
		System.out.println(num1+"<"+num2+"? �����"+(num1<num2));
		System.out.println(num1+">"+num2+"? �����"+(num1>num2));
		System.out.println(num1+"<="+num2+"? �����"+(num1<=num2));
		System.out.println(num1+">="+num2+"? �����"+(num1>=num2));
		System.out.println(num1+"=="+num2+"? �����"+(num1==num2));
		System.out.println(num1+"!="+num2+"? �����"+(num1!=num2));
		key.close();
	}
}
