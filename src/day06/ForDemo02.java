package day06;
/**
 * ˫��ѭ��
 * �����������������ھ��������
 * 
 * 1  2  3  4 
 * 1  2  3  4
 * 1  2  3  4
 * �����ѭ������������ѭ�����ٴΣ����ж�����
 * �����ѭ������������ѭ�����ٴΣ����ж�����
 *
 */
public class ForDemo02 {
	public static void main(String[] args) {
		//˫��forѭ�������ѭ��ִ��һ�Σ����ѭ��Ҫѭ����ϣ����ѭ���Ż������һ��ѭ��
//		for(int i=1;i<10;i++){
//			System.out.println("i:"+i+":%%%%");
//			for(int j=1;j<10;j++){
//				System.out.println("j:"+j);
//			}
//		}
		
		//����ѭ��ʱ������ʹ�ñ�ǩ�������Ҫ������ѭ��
		// ��ǩ�� :  
		// ����ָ��ѭ��ʱ��ʹ�� break ��ǩ��
		flag:for(int i=1;i<=3;i++){
			for(int j=1;j<=4;j++){
				System.out.print(j+"\t");
				if(j==2){
					//break; //�������ѭ��
					break flag;
				}
			}
			System.out.println();
		}
	}
}
