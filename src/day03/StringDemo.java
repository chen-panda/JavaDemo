package day03;

import java.util.Scanner;

/**
 * Java�е��ַ�����String
 * �����⣺
 * String�ǻ�������������
 * String���ǻ����������ͣ����������������͡���ס�������������;�8��
 * 
 * 
 * 
 * @author NING MEI
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		//�ַ���  char
		//char���͵��ַ����õ����Ű���
		char c = '��';
		char c1 = '��';
		//
		//char c1 = '�ʸ�';//����char������ֻ�ܷŵ����ַ�
		
		//�ַ�����һ���ַ����У���˫���Ű���
		String str1 = "������ʸ磬�˺ݻỰ����";
		System.out.println(str1);
		//�ַ������õķ���
		//��ȡ�ַ����ĳ��ȣ��ַ������ַ��ĸ�������ʽ�� �ַ���.length();
		System.out.println(str1.length());
		//��ȡ�ַ�����ĳ��λ���ϵ��ַ�,��ʽ�� �ַ���.charAt(λ��);
		//�ַ�����λ�ã���0��ʼ
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(str1.length()-1));//���һ���ַ���λ�ã��������ַ����ĳ���-1
		//��ȡ�ַ�����ĳ���ַ���һ�γ��ֵ�λ�� ,��ʽ�� �ַ���.indexof(�ַ���)
		System.out.println(str1.indexOf('��'));
		System.out.println(str1.indexOf("����"));//1
		
		//�Ƚ��ַ���������
		// asYu
		String str2 = "asYu";
		Scanner key = new Scanner(System.in);
		System.out.println("��������֤�룺");
		//�����ַ���  key.next()  ���� key.nextLine()
		//next()�������ո���߻س�ʱ���ͻ������ǰɨ��(ɨ�赽���ַ���"")
		//nextLine() ֻ�е������س�ʱ���Ż����ɨ��
		String con = key.next();
		System.out.println("�����������Ϊ��"+con);
		
		//�Ƚ��ַ�������ʽ �� �ַ���1.equals(�ַ���2) ,����ֵ��boolean���͵ģ�true����false
		//���ִ�Сд
		System.out.println(str2.equals(con));
		
		//�Ƚ��ַ��������Դ�Сд �ַ���1.equalsIgnoreCase(�ַ���2)
		System.out.println(str2.equalsIgnoreCase(con));
		
		key.close();
		
		
	}
}
