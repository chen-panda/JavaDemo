package day07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����5��ͬѧ
 * ͳ��5��ͬѧ�Ŀ��Գɼ�
 * 
 * ��ҵ��
 * ������ܳɼ�
 * �����ƽ���ɼ�
 * ������༶��ͷ�
 * ������༶��߷�
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		//����ɨ����
		Scanner key = new Scanner(System.in);
		//�������飬�������5��ͬѧ�Ŀ��Գɼ�
		double[] score = new double[5];
		//�������飬�ֱ�¼��5��ͬѧ�Ŀ��Գɼ�
		for(int i=0;i<score.length;i++){
			System.out.println("�������"+(i+1)+"λͬѧ�Ŀ��Գɼ�:");
			//���տ��Գɼ�
			score[i] = key.nextDouble();
		}
		System.out.println("���Գɼ���"+Arrays.toString(score));
		key.close();
	}
}
