package day08;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * ���棺��������ҫ��������ȡͼƬ
 * Ϊ�����ݷ���
 * ����ر����ܣ�
 *  Webǰ�� ��HTML+CSS +JS
 *  Jsoup :Java���湤�߰�  ��HttpClient
 *  JavaSE ���� �� ���ϣ�IO���� �߳�
 *  
 *  
 *  
 * 
 * 
 * 
 * jsoup jar��
 * @author NING MEI
 *
 */
public class GetImg {
	static String url = "https://pvp.qq.com/web201605/herolist.shtml";
	static String path = "d://img/";
	
	/**
	 * ���������ַ����ȡ��Ӧ�����ַ�ϵ�ͼƬ
	 * @param url
	 */
	public static void getImgs(String url){
		//���ض�Ӧ��ַ�ϵ�html����
		try {
			Document document = Jsoup.connect(url).userAgent("Mozilla/4.0 (compatible; MSIE 9.0;Widnows NT 6.1;Trident/5.0)").get();
//			System.out
			//������ʾͼƬ��ul��ǩ
			Elements selectUL = document.select("[class=herolist clearfix]");
			//��ul��ǩ�в���li��ǩ
			Elements selectLI = selectUL.select("li");
			//forѭ�����������е�li��ǩ����ȡ����ҳ��ַ���Լ�ͷ��ͼƬ
			//forEach
			//Element Ԫ��(��ǩ) �����ţ�html����ʾ���ݱ�ǩ
			for(Element e:selectLI){
				//�ҵ�Ӣ������ҳ�ĵ�ַ
				//��li��ǩ���ҵ�a��ǩ�����һ�ȡ������href����ֵ
				String heroURL = e.select("a").attr("href");
				//��ȡӢ�۵����� text() ��ȡ��ǩ�е��ı�����
				String heroName = e.select("a").text();
				//System.out.println(heroURL);
				//System.out.println(heroName);
				//ƴ������ҳ�ĵ�ַ
				String detailUrl = "https://pvp.qq.com/web201605/"+heroURL;
				//��ȡ����ҳ��html����
				Document doc = Jsoup.connect(detailUrl).userAgent("Mozilla/4.0 (compatible; MSIE 9.0;Widnows NT 6.1;Trident/5.0)").get();
				//�ҵ���ʾ������div��ǩ
				Elements div = doc.select("[class=zk-con1 zk-con]");
				//��ȡ��ʾ�ı���
				String bg = div.attr("style");
				//System.out.println(bg);
				//����ַ��� :���Ӣ��ͼƬ�ĵ�ַ
				//subString(��ʼλ�ã���ֹλ��) subString(start,end) 
				//��ʾ��[start,end)��Χ�ڲ�ֳ����ַ���
				String heroImgUrl = bg.substring(16, bg.length()-11);
				System.out.println("��ʼ����:"+heroImgUrl);
				//�涨ͼƬ���ص��ĵ�ַ
				String uri = path+ heroName+".jpg";
				//����ͼƬ
				//http://
				download("http:"+heroImgUrl,uri);
				
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ����ָ��·���µ�ͼƬ
	 * @param url
	 */
	public static void download(String imgUrl,String path){
		//����URL����
		try {
			URL url = new URL(imgUrl);
			//IO �� �� ����ˮ�ܵ�
			//������������ҳ�ϵ�ͼƬ���������͵�������
			DataInputStream dataInputStream = new DataInputStream(url.openStream());
			//���������ͼƬ���ݣ������ָ�����ļ��б���
			FileOutputStream outputStream = new FileOutputStream(path);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int length =0;
			while((length=dataInputStream.read(buffer))!=-1){
				output.write(buffer,0,length);
			}
			outputStream.write(output.toByteArray());
			outputStream.close();
			dataInputStream.close();
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//��ȡϵͳ��ǰʱ��ĺ�����
		long start = System.currentTimeMillis();
		//��ȡͼƬ
		getImgs(url);
		//��ȡϵͳ��ǰʱ��ĺ�����
		long end = System.currentTimeMillis();
		System.out.println("ͼƬ������ϣ�һ����ʱ��"+(end-start)/1000.0);
	}
}
