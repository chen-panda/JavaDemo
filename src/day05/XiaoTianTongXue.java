package day05;

import java.util.Scanner;

/**
 * �˹�����:С��ͬѧ
 * 
 */
public class XiaoTianTongXue {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ã�С��ͬѧΪ������");
		while(true){
			String con = key.next();
			//replace�滻�ַ��� 
			con = con.replace("��", "");
			con = con.replace("��", "");
			con = con.replace("��", "!");
			con = con.replace("?", "!");
			con = con.replace("��", "");
			if(con.equals("bye")){
				System.out.println("���ڽ����ˣ������ɵ�棡��");
				break;
			}
			System.out.println(con);
		}
		key.close();
		
	}
}
