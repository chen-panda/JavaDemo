package day04;

import java.util.Scanner;

/**
 * ��ʽ����
 * 
 * if(�������1){
 * 	//�����1
 * }else if(�������2){
 * 	//�����2
 * }else if(�������3){
 * 	//�����3
 * }
 * ...
 * else{
 * 	//�����
 * }
 * ��ʾ�����ϵ��������ж���������Ƿ���������������������ִ�ж�Ӧ�Ĵ���飬������е�����������������ִ��else�еĴ����
 * 		һ��ִ�д����֮������if���ͽ����ˡ����ܺ����������������Ƿ������������ִ��
 * @author NING MEI
 *
 */
public class IFDemo {
	public static void main(String[] args) {
//		 int num = 4;
//		 if(num<5){
//			 System.out.println(1);
//		 }else if(num<6){
//			 System.out.println(2);
//		 }else if(num>7){
//			 System.out.println(3);
//		 }else{
//			 System.out.println(4);
//		 }
		
		//ģ���������֮���ͷż���
		// Q W E R
		//1.�������ɨ����
		Scanner key = new Scanner(System.in);
		//2.���ͷż���
		System.out.println("�� Q W E R �ͷż���");
		// next��������()   nextInt()  ,nextDouble()
		//ע�⣺����ɨ�費��ɨ���ַ���ɨ����������ַ���
		String con = key.next();
		//���ݰ������ͷż���
		//ע�⣺�Ƚ��ַ���������ʹ��== ����Ҫʹ��equals����equalsIgnoreCase
		if(con.equalsIgnoreCase("Q")){
			System.out.println("���������С�ӣ�����ؿڿ���ȱ��Сȭȭ���ô�~~");
		}else if(con.equalsIgnoreCase("W")){
			System.out.println("�������Ҹ��ܵ������������������~~");
		}else if(con.equalsIgnoreCase("E")){
			System.out.println("���У���Ҫ�������������Ʋ�");
		}else if(con.equalsIgnoreCase("R")){
			System.out.println("�����������壺����ȥ���󱦽�");
		}else{
			System.out.println("û�±�Ϲjb��");
		}
		
		key.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
