package day02;

import java.util.Scanner;

/**
 * ����ɨ������ʹ�ã�Scanner
 * ���ã����Խ��ܼ�����������ݣ����䵽������
 * ����ɨ������ʹ�ò��裺
 * 1.��������ɨ���� ��  Scanner key = new Scanner(System.in);
 * 2.��ʾ�û��������ݣ�
 * 3.�����û����������
 * 4.ʹ�����֮��رռ���ɨ����
 * @author NING MEI
 *
 */
public class ClassDemo {
	public static void main(String[] args){
		//��������ɨ����
		Scanner key = new Scanner(System.in);
		//��ʾ�û���������
		System.out.println("������һ������:");
		//�����û���������� key.next��������();
		//�������java.util.InputMismatchException ˵��������������ͺͽ��յ��������Ͳ�ƥ��
		int num = key.nextInt();
		System.out.println("�����������Ϊ:"+num);
		//ʹ�����ɨ��������ɨ�����ر�
		key.close();
	}
}
