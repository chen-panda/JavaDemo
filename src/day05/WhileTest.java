package day05;

import java.util.Random;
import java.util.Scanner;

/**
 * �¼۸���Ϸ
 * �������һ����Ʒ�ļ۸�
 * ÿλ�������λ���ȥ�¼۸�
 * �����Ҽ۸�µ�����ʾ���µ���
 * �����Ҽ۸�¸�����ʾ���¸���
 * �����Ҽ۸�¶��˼۸���ʾ���¶��ˣ����Ի����Ʒ
 * 
 * ��λ������꣬GameOver
 * 
 *
 */
public class WhileTest {
	public static void main(String[] args) {
//		//Java������������ķ�ʽ
//		//��һ�� �� Math�� 
//		//Math.radom()  ��0-1֮���������һ��С��
//		System.out.println(Math.random());
//		//Ҫ����һ�� 0-10֮���С����
//		System.out.println(Math.random()*10);
//		//Ҫ�������0-10֮�������
//		System.out.println((int)(Math.random()*10));
//		
//		//�ڶ��֣�Random��
//		Random  rd = new Random();
//		//ʹ��rd.nextInt(num)�����������
//		//��ʾ����[0,num)���������������
//		int num = rd.nextInt(3);
//		System.out.println("num:"+num);
//		
		
		Random  rd = new Random();
		//1.���������Ʒ�ļ۸�100���ڣ�
		int price = rd.nextInt(100);
		System.out.println(price);
		//2.����ɨ����
		Scanner key = new Scanner(System.in);
		//3.�ѭ���ṹѭ��5��
		int n = 1;
		while(n<=5){
			System.out.println("���������µļ۸�");
			//��������ļ۸�
			int num = key.nextInt();
			//�Ƚ�����ļ۸�������ļ۸�
			if(num<price){
				System.out.println("��С��~~");
			}else if(num>price){
				System.out.println("�´���~~");
			}else {
				System.out.println("��ϲ��¶���~~CXK�������~~~");
				break;
			}
			n++;
		}
		key.close();
		
		
		
	}
}
