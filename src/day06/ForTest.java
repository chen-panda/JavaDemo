package day06;
/**
 * ��������⣺
 * ��� 100-999֮�����е�ˮ�ɻ���
 * ˮ�ɻ����� ��λ���ϵ�3�η�+ʮλ���ϵ�3�η�+��λ���ϵ�3�η� = ���ֱ���
 *
 */
public class ForTest {
	public static void main(String[] args) {
		//����ѭ��
		for(int num = 100;num<=999;num++){
			//num��һ��3λ�� ���磺125 
			//�ֱ�ȡ����ÿλ�ϵ�����
			//ȡ����λ�ϵ�����  125 %10 
			int ge = num%10;
			//ȡ��ʮλ�ϵ����� 125/10= 12%10 = 2
			int shi = num/10%10;
			//ȡ����λ�ϵ����� 125/100 = 1
			int bai = num/100;
			int result = ge*ge*ge +shi*shi*shi+bai*bai*bai;
			if(result==num){
				System.out.println(num);
			}
		}
	}
}
