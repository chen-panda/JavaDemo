package day04;

import java.util.Scanner;

/**
 * Java�еķ�֧���-switch
 * ��ʽ��
 * switch(ֵ){
 * 	case ֵ1��
 * 		�����1��
 * 	case ֵ2��
 * 		�����2��
 * 	...
 * 	default:
 * 		�����
 * }
 * 
 * ��ʾ�������switch������ֵȥƥ��case�е�ֵ��һ��ƥ�䵽���ͻ�ӵ�ǰ��Ӧ�Ĵ���鿪ʼһֱ����ִ�У�ֱ������break����switch����
 * 		���ƥ�䲻��ֵ���ͻ�ִ��default�еĴ���
 * 
 * ע�⣺
 * 		��switch�������Ҫ�ô���鲻�ڼ�������ִ�У������ڴ����ĺ����break
 * 
 * �����⣺ switch��if������ʲôʱ����switch��ʲôʱ����if
 * 		�� if�����д�ŵ���������䣬�������Ľ����Boolean���ͣ�������һ����Χ
 * 			switch�����У��ŵ���һ�������ֵ
 *      �����֪��ĳ�����������߷�Χʱ��һ��ʹ��if
 *      �������Ҫ����ĳ��ֵȥƥ������ֵʱ,(����̶�ֵ)����switch
 *      
 *      
 * �����⣺switch�����п��Է���Щ���͵�ֵ��
 * 		ֻ�ܷ�  byte��short��char int,String,ö��
 * 		ע�⣺��jdk1.7��ǰ��String�ǲ��ܷŵ�
 * 
 *  
 * switch �е�case�����˳������ô��
 * 
 * @author NING MEI
 *
 */
public class SwitchDemo {
	public static void main(String[] args) {
		int num = 1;
		switch(num){
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;//�������
			case 3:
				System.out.println(3);
				break;
			default:
				System.out.println(4);
				break;
		}
		
		
		//����switch�����Ϸ�������ƶ�
		Scanner key = new Scanner(System.in);
		System.out.println("������ָ��");
		String con = key.next();
		switch(con){
			case "a":
				System.out.println("�����ƶ�");
				break;
			case "W":
			case "w":
				System.out.println("�����ƶ�");
				break;
			case "S":
			case "s":
				System.out.println("�����ƶ�");
				break;
			
			case "d":
				System.out.println("�����ƶ�");
				break;
			default:
				System.out.println("û�±�Ϲjb��");
		}
		key.close();
	}
}
