package day03;

import java.util.Scanner;

/**
 * Java�еķ�֧���- if 
 * ���ã������ж�
 * ��ʽ1��
 * 		if(�������ʽ){
 * 			//�����
 * 		}
 * ��ʾ������������ʽ���������Ϊtrue���ͻ�ִ�д���飬����Ͳ�ִ��
 * 
 * ��ʽ2��
 * 		if(�������ʽ){
 * 			//�����1
 * 		}else{
 * 			//�����2
 * 		}
 * ��ʾ������������ʽ���������Ϊtrue���ͻ�ִ��if����еĴ����1�������ִ��else�еĴ����2
 * @author NING MEI
 *
 */
public class IFDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
//		System.out.println("����Ư������ô����Q1������Q2");
//		int answer = key.nextInt();//answer=2
//		if(answer==1){
//			System.out.println("����̸������~~");
//		}
//		System.out.println("O(��_��)O");
		
		System.out.println("�ʸ�˧ô����Q1 ������Q2");
		int answer = key.nextInt();
		if(answer==1){
			System.out.println("������~~~");
		}else{
			System.out.println("��һ���۾�����~~~");
		}
		
		key.close();
	}
}
