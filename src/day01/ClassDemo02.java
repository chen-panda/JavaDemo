package day01;
/**
 *��ҵ2�� �����int��short��long��char�����ֵ����Сֵ���ߴ�
 * Java�е��������ͣ�
 * �����������ͣ�
 * 	���ͣ�Java��������ʾ��������������
 * 					λ��                       ���ֵ                          ��Сֵ
 * 		byte        8           127(2^7-1)         -128(-2^7)
 * 		short		16          2^15-1             -32768(-2^15)
 * 		int         32          2^31-1               -2^31
 *      long        64          2^63-1               -2^63
 *  �ַ��ͣ�Java��������ʾ���ֻ��߷��ŵ���������
 *  	ע�⣺ÿһ���ַ�������һ����Ӧ����ֵ��ÿ���ַ�������ת����һ����������������ķ�Χ��0-65535��
 *  	char        16
 *  �����ͣ�Java��������ʾС������������  
 *  	float ������С�� �������ã�
 *  	double ˫����С�������ã�
 *  �������ͣ� Java��������ʾ��٣��Դ��Ƿ� ��������
 *  	boolean ��ֻ������ֵ   true  ��ʾ�棬�ԣ���   
 *    			  false ��ʾ�٣�����
 *      
 *      
 * �����������ͣ�JDK�з�װ���࣬�Լ��Զ����Java�඼���������������� 
 * 	ÿһ�л����������Ͷ���Ӧ���������������ͣ������װ�˶Ի����������Ͳ����ĳ����ͷ���
 * 	������������               ������������
 * 	byte    			Byte
 *  short               Short
 *  int                 Integer
 *  long                Long
 *  char                Character
 *  float               Float
 *  double              Double
 *  boolean             Boolean
 * 
 * 
 * �����⣺Java���м����������ͣ�
 * 
 *
 */
public class ClassDemo02 {
	public static void main(String[] args){
		//��ȡbyte�����ֵ
		System.out.println("byte�����ֵ��"+Byte.MAX_VALUE);
		//��ȡbyte����Сֵ
		System.out.println("byte����Сֵ��"+Byte.MIN_VALUE);
		//byte�ĳߴ磨λ����
		System.out.println("byte��λ����"+Byte.SIZE);
	}
}
