package day07;

import java.util.Random;

/**
 * ģ��Ӣ�۶�ս
 * @author NING MEI
 *
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		//��һ��Ӣ�۵�����
		String name1 = "cxk";
		//��һ��Ӣ�۵�Ѫ��
		int blood1 = 700;
		//��һ��Ӣ�۵ļ����б�
		String[] sk1 = {"��","��","rap","��ʦ������"};
		//��һ��Ӣ�۵ļ����˺�
		int [] skhrt = {70,  80, 150, 200};
		
		//�ڶ���Ӣ�۵�����
		String name2 = "zdd";
		//�ڶ���Ӣ�۵�Ѫ��
		int blood2 = 800;
		//�ڶ���Ӣ�۵ļ����б�
		String[] sk2 = {"������","��ֵ����","��̵","����"};
		//�ڶ���Ӣ�۵ļ����˺�
		int [] skhrt2 = {60,90,160,190};
		
		Random rd = new Random();
		//��Ϸ��ʼʱ��
		//��cxk����ͷ�һ�����ܣ���zdd���й���
		//��zdd����ͷ�һ�����ܣ���cxk���й���
		//��ѭ���������˸ɵ���Ϊֹ
		while(true){
			//����һ������������ѡȡһ������
			int index1 = rd.nextInt(sk1.length);
			//ѡȡ����
			String s1 = sk1[index1];
			//�����������ȡ�������˺�
			int hr1 = skhrt[index1];
			//�õڶ���Ӣ�۵�Ѫ������
			blood2 -= hr1;
			System.out.println(name1+" ʹ���� "+s1+" ���ܶ� "+name2+"����� "+hr1+"���˺���"+name2+" ��ʣ"+blood2+"��Ѫ");
			//����ڶ���Ӣ��Ѫ��С��0
			if(blood2<=0){
				System.out.println(name1+"ɱ����"+name2+"���ɹ��Լ�����");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//�ڶ���Ӣ���ͷż��ܣ����һ��Ӣ��
			//����һ������������ѡȡһ������
			int index2 = rd.nextInt(sk2.length);
			//ѡȡ����
			String s2 = sk2[index2];
			//�����������ȡ�������˺�
			int hr2 = skhrt2[index2];
			//�õ�һ��Ӣ�۵�Ѫ������
			blood1 -= hr2;
			System.out.println(name2+" ʹ���� "+s2+" ���ܶ� "+name1+"����� "+hr2+"���˺���"+name1+" ��ʣ"+blood1+"��Ѫ");
			//�����һ��Ӣ��Ѫ��С��0
			if(blood1<=0){
				System.out.println(name2+"ɱ����"+name1+"���ɹ��Լ�����");
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
