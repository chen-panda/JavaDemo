package day07;

import java.util.Arrays;

/**
 * Java�е����飺�������һϵ������������ͬ��Ԫ�أ����ݵ�������Ҫһ����
 * ������һ��������������
 * 
 * ���鶨��ĸ�ʽ��
 * ��ʽһ��
 * 		��������[] ������ = new ��������[���鳤��];
 * 
 * ��ʽ����
 * 		��������[] ������ = {ֵ1,ֵ��,....��ֵn};
 * 
 * ��ʽ����
 * 		��������[] ������ = new int[]{ֵ1,ֵ��,....��ֵn};
 * 
 * ע�⣺
 *    1.ֱ�����������������������ڴ��еĵ�ַ�������Ҫ��������е����ݣ���Ҫͨ��Arrays.toString(������)
 *    2.��������������û���ֶ�������ݵĻ��������л�Ĭ�ϴ�ţ���Ӧ�������͵�Ĭ��ֵ
 *    	int Ĭ��ֵ 0   boolean  Ĭ��ֵ false
 *      double Ĭ��ֵ 0.0    String�������������͵ģ� Ĭ��ֵ����null
 *    3.���鶨��ʱ������ָ������
 *    
 * 	
 * 
 * 
 *
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int b = 0;
		b = 1;
		System.out.println(b);//1
		//��������[] ������ = new ��������[���鳤��];
		int [] ary = new int[3];//��ʾ������һ������Ϊ3�����飬��������ֻ�ܷ�int���͵�����
		double [] ds = new double[5];
		boolean [] bs = new boolean[3];
		String [] sts = new String[3];
		//��ӡ����
		System.out.println(ary);//[I@15db9742����������������ڴ��еĵ�ַ
		System.out.println(ds);//[D@6d06d69c
		//��ӡ�����е����ݣ�Arrays.toString(������)
		System.out.println(Arrays.toString(ary));
		System.out.println(Arrays.toString(ds));
		System.out.println(Arrays.toString(bs));
		System.out.println(Arrays.toString(sts));
		
		//
		//int[] arys = new int[]; //�������鶨��ʱ����ָ������
		
		//��������[] ������ = {ֵ1,ֵ��,....��ֵn};
		//��ʽ����������֪�������е�����
		String [] names = {"�����","wyf","lh"};
		System.out.println(Arrays.toString(names));
		
		//��������[] ������ = new int[]{ֵ1,ֵ��,....��ֵn};
		String [] books = new String[]{"����","�������������ɵ�","����","ѩ�к�����"};
		System.out.println(Arrays.toString(books));
		
		
		//ʹ������
		//��ȡ����ĳ��� ������.length
		System.out.println(books.length);
		
		//��ȡ�����е�Ԫ��  ��ʽ:  ������[�±�(λ��)]
		//ע�⣺������±��0��ʼ
		System.out.println(books[1]);
		//��ȡ�������һ��Ԫ��  ������[������.length-1]
		System.out.println(books[books.length-1]);
		//ArrayIndexOutOfBoundsException �����±��±�Խ��
		//���������鲻���ڵ�Ԫ��
		System.out.println(books[6]);
		
		//�޸������е�ĳ��λ�õ�Ԫ��  ��ʽ�� ������[λ��] = ֵ;
		books[2] = "��ƿ÷";
		System.out.println(Arrays.toString(books));
		
		char[] cs = new char[]{'��','��'};
		String names1 =new String(cs,0,cs.length);
		System.out.println(names1);
		
		String ns = Arrays.toString(books);
		//��������:�������е�Ԫ��������ʵ�
		//����ԭ�����ʹ���±꣬�������е�Ԫ��ȡ��
		// i������Ϊ������±꣬��0��ʼ��������ĳ���-1
		for(int i=0;i<books.length;i++){
			System.out.println("��"+(i+1)+"ѭ��:"+books[i]);
		}
		
		System.out.println("����ǰ��"+Arrays.toString(ary));
		//�������飬���½������鸳ֵ
		for(int i=0;i<ary.length;i++){
			ary[i] = i*10;
		}
		System.out.println("������"+Arrays.toString(ary));
		
		
		
		
	}
}
