package day08;
/**
 *  �����������������ӷ�����ķ���
 *  ��������ĸ�ʽ��
 *  public static  ����ֵ����  ������(�����б�){
 *  
 *  }
 *  ����ֵ���ͣ�ִ�з����󣬷��ص���������.�����Ҫ�������ݣ����ڴ˴��Ӷ�Ӧ���ݵ��������ͣ����û�з���ֵ�����ڴ˴���void
 *  ����������������ҵ��˷�����,������ʽ�ͱ�����������ʽһ��
 *  �����б�ִ�д˷�����Ҫ�����ĵ���������
 */
public class Method01 {
	/**
	 * �����������ĺ�
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int add(int num1 ,int num2){
		
		return num1+num2;
	}
	
	
	/**
	 * ����һ������������Բ�����
	 * double r Բ�İ뾶
	 */
	public static double area(double r){
		//����������ظ����÷����ĵط�
		return  3.14*r*r;
	}
	
	
	/**
	 * ����һ�� ���� ��������ķ���
	 * 
	 */
	public static int area(int w,int h){
		return w*h;
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int result = add(12,13);
		int res1 = add(15,78);
		
		double as = area(2);
		int as1 = area(18,2);
		System.out.println(result);
		System.out.println(res1);
		System.out.println(as);
		System.out.println(as1);
	}
	
}
