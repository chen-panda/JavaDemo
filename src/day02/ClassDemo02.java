package day02;
/**
 * Java�е�����ת��:
 * �Զ�����ת������ʽ����ת������
 * 	  ��С��Χ���������Χ����������ʱ���ᷢ���Զ�����ת��
 *   byte  -> int  (���Զ�ת)
 * 
 * ǿ������ת������ʾ����ת������(����)
 * 	����Χ������������С��Χ��������ʱ����Ҫǿ������ת��
 *   int  -> byte(ǿ����)
 * 
 * @author NING MEI
 *
 */
public class ClassDemo02 {
	public static void main(String[] args){
		//�����⣺
		//����byte ,short ,char ���ԣ�����������ʱ������Ľ���ᱻ��ʽת����int����
		short s = 1;
		//short s1 = s+s; s+s֮��������int����
		//int s1 = s+s;
		short s1 =(short)(s+s);
	    System.out.println(s1);
	    
	    char c = 1;
	    char c1 =(char)(c+c);
	    
	   // byte  -> int  (���Զ�ת)
	    byte b1 = 125;
	    int i1 = b1;//byte��b1 �ᱻ�Զ�ת����int����
	    
	    //������
	    int i2 = -130;
	    //ǿ������ת��   
	    byte b2 = (byte)i2;//i2��int���ͣ������Ҫת����byte���ͣ�����Ҫǿ������ת��
	    System.out.println(b2);//
	    
	    
	    
	    
	    
	}
}
