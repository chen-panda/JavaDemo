package day04;

import java.util.Scanner;

/**
 * ����̨���� ��ݣ����·�
 * ��� ��һ�� ��һ����һ���ж�����
 * ���磺
 * ���룺2019 ��  8 ��
 * �����2019��8��һ����31��
 * 
 * 31�죺  1  3  5  7  8  10  12
 * 30�죺  4  6  9  11
 * 
 * 2�£�
 * 		���꣺29
 *      ƽ�꣺28
 *      
 * �ж����깫ʽ�� year%4==0&&year%100!=0||year%400==0
 * 
 *
 */
public class IFTest {
	public static void main(String[] args) {
		//����ɨ����
		Scanner key = new Scanner(System.in);
		//��ʾ�������
		System.out.println("��������ݣ�");
		//������������
		int year = key.nextInt();
		//��ʾ�����·�
		System.out.println("�������·�:");
		int month = key.nextInt();
		//�������������ÿ���µ�����
		int days = 0;
		//�����1��3��5��7��8��10��12 ����31��
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			//System.out.println(year+"��"+month+"�£�һ����31��");
			days = 31;
		}else if(month==4||month==6||month==9||month==11){
			//System.out.println(year+"��"+month+"�£�һ����30��");
			days = 30;
		}else if(month==2){
			//�ж��Ƿ�������
			if(year%4==0&&year%100!=0||year%400==0){
				//System.out.println(year+"��"+month+"�£�һ����29��");
				days = 29;
			}else{
				//System.out.println(year+"��"+month+"�£�һ����28��");
				days = 28;
			}
		}else{
			System.out.println("����ȷ�����·�");
		}
		System.out.println(year+"��"+month+"�£�һ����"+days+"��");
		key.close();
		
		
	}
}
