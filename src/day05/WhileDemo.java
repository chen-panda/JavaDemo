package day05;

/**
 * break �� continue������
 * break �ǽ���ѭ��
 * continue����������ѭ����ִ����һ��ѭ��
 * 
 * @author NING MEI
 *
 */
public class WhileDemo {
	
	public static void main(String[] args) {
		
		int n = 0;
		while(n<=5){
			n++;
			if(n==3){
				//break;
				continue;//������ǰѭ����ֱ�ӿ�ʼ�´�ѭ��
			}
			//��n=3ʱ��������벻��ִ��
			System.out.println(n);
			
		}
	}
}
