package day06;

import java.util.Scanner;

/**
 * �����������ɹ��
 * �����ʸ��2010��1��1�տ�ʼ�������������ɹ��
 * ����һ�����ڣ��жϳ���һ������Ӧ��ȥ���㻹��Ӧ��ȥɹ��
 * �������ڣ�2010��1��3��   ����     1��4�� ɹ��
 * ��������ʱ���2010��1��1�գ�
 * 1  ����
 * 2  ����
 * 3  ����
 * 4  ɹ��
 * 5  ɹ��
 * 6  ����
 * 7  ����
 * 8  ����
 * 9  ɹ��
 * 10  ɹ��
 * 
 * �������  days % 5   (3|4)ɹ��    (0|1|2)����
 * 
 * 2019��1 ��1��
 * 
 * 
 * @author NING MEI
 *
 */
public class ForTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = key.nextInt();
		System.out.println("�������·ݣ�");
		int month = key.nextInt();
		System.out.println("�������ڣ�");
		int day = key.nextInt();
		//����������
		int days = 0;
		// ���� 2019�� 4�� 3��
		//1.�����2010��1��1�յ�2019��1��1���ж�����  365*9 +2 
		for(int i = 2010;i<year;i++){
			//�ж��Ƿ�������
			if(i%4==0&&i%100!=0||i%400==0){
				days += 366;
			}else{
				days += 365;
			}
		}
		
		//2.���㵱ǰ�������1��1�յ�������·��ж�����
		//���� 2019�� 4�� 3�� �������2019��1��1�յ�4��1�յ�ʱ��
		for(int j=1;j<month;j++){
			switch (j) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days +=31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					days +=30;
					break;
				case 2:
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						days += 29;
					} else {
						days += 28;
					}
				default:
					break;
			}
		}
		//����������������
		days += day;
		int res = days%5;
		if(res>=1&&res<=3){
			System.out.println("����");
		}else{
			System.out.println("ɹ��");
		}
		
		
	}
}
