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
 * 爬虫：从王者荣耀官网上爬取图片
 * 为大数据服务
 * 爬虫必备技能：
 *  Web前端 ：HTML+CSS +JS
 *  Jsoup :Java爬虫工具包  ，HttpClient
 *  JavaSE 核心 ： 集合，IO流， 线程
 *  
 *  
 *  
 * 
 * 
 * 
 * jsoup jar包
 * @author NING MEI
 *
 */
public class GetImg {
	static String url = "https://pvp.qq.com/web201605/herolist.shtml";
	static String path = "d://img/";
	
	/**
	 * 根据网络地址，获取对应网络地址上的图片
	 * @param url
	 */
	public static void getImgs(String url){
		//加载对应网址上的html代码
		try {
			Document document = Jsoup.connect(url).userAgent("Mozilla/4.0 (compatible; MSIE 9.0;Widnows NT 6.1;Trident/5.0)").get();
//			System.out
			//查找显示图片的ul标签
			Elements selectUL = document.select("[class=herolist clearfix]");
			//在ul标签中查找li标签
			Elements selectLI = selectUL.select("li");
			//for循环，遍历所有的li标签，获取详情页地址，以及头像图片
			//forEach
			//Element 元素(标签) 代表着，html中显示内容标签
			for(Element e:selectLI){
				//找到英雄详情页的地址
				//从li标签中找到a标签，并且获取到里面href属性值
				String heroURL = e.select("a").attr("href");
				//获取英雄的名称 text() 获取标签中的文本内容
				String heroName = e.select("a").text();
				//System.out.println(heroURL);
				//System.out.println(heroName);
				//拼接详情页的地址
				String detailUrl = "https://pvp.qq.com/web201605/"+heroURL;
				//获取详情页的html代码
				Document doc = Jsoup.connect(detailUrl).userAgent("Mozilla/4.0 (compatible; MSIE 9.0;Widnows NT 6.1;Trident/5.0)").get();
				//找到显示背景的div标签
				Elements div = doc.select("[class=zk-con1 zk-con]");
				//获取显示的背景
				String bg = div.attr("style");
				//System.out.println(bg);
				//拆分字符串 :拆出英雄图片的地址
				//subString(起始位置，终止位置) subString(start,end) 
				//表示从[start,end)范围内拆分出子字符串
				String heroImgUrl = bg.substring(16, bg.length()-11);
				System.out.println("开始下载:"+heroImgUrl);
				//规定图片下载到的地址
				String uri = path+ heroName+".jpg";
				//下载图片
				//http://
				download("http:"+heroImgUrl,uri);
				
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 下载指定路径下的图片
	 * @param url
	 */
	public static void download(String imgUrl,String path){
		//构建URL链接
		try {
			URL url = new URL(imgUrl);
			//IO 流 ： 自来水管道
			//输入流，将网页上的图片流化，输送到程序中
			DataInputStream dataInputStream = new DataInputStream(url.openStream());
			//输出流，将图片数据，输出到指定的文件中保存
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
		//获取系统当前时间的毫秒数
		long start = System.currentTimeMillis();
		//爬取图片
		getImgs(url);
		//获取系统当前时间的毫秒数
		long end = System.currentTimeMillis();
		System.out.println("图片下载完毕，一共耗时："+(end-start)/1000.0);
	}
}
