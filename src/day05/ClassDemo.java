package day05;

import java.util.Scanner;

/**
 * �ʸ�
 * ��ۼ���
 * 
 * 20��ѧ��Java����
 * 
 * ���������дһ�μ�ֵ������˹����ܴ���
 * 
 * whileѭ��
 * ��ʽ��
 * while(�������){
 * 		//�����
 * }
 * ������������ֵΪtrue�� ��ô�ͻ�һֱ�ظ�ִ�д���飬ֱ�� ������䲻����
 *
 */
public class ClassDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//�ϿγԵ��������ȥ�ﾶ����10Ȧ
		//true ��ʾ���������������ѭ������ѭ��
		//��Ҫһ�����������������������
		int n = 1;
		while(n<=10){
			System.out.println("�ʸ磡������"+n+"Ȧ��,����ֹͣ��ô��Y/N");
			String con = key.next();
			//����ش�Y��ֹͣ
			if(con.equalsIgnoreCase("y")){
				System.out.println("ͣ�����ɣ��´��ٳٵ�������ɨ����~~");
				break;//������䣬����ѭ��
			}else{
				System.out.println("��ͣ��������~~");
			}
		
			n++;//2
		}
		
	}
}
