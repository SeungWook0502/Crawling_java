package jobkorea;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main2 {

	private static String URL = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=001&aid=0012240593";
	
	public static void main(String[] args) throws IOException {

		System.out.println("URL :: " + URL);
		
		//1. Document를 가져온다.
		Document doc = Jsoup.connect(URL).get();
		
		//2. 목록을 가져온다.
//		System.out.println("" + doc.toString());
		Elements elements = doc.select("div._article_body_contents");
//		Elements elements = doc.select("div.hdline_article_tit");
//		Elements elements_head = doc.select("div.main_content div.hdline_article_tit");
//		Elements elements_etc = doc.select("div.main_content div.mtype_list_wide strong");
		
		//3. 목록(배열)에서 정보를 가져온다.
		int idx = 0;
		for(Element element : elements) {
			
			System.out.println(++idx + "head : " + element.toString().split("<br><span class")[0]);
			System.out.println("==========================================");
			
		}
//		idx = 0;
//		for(Element element : elements_etc) {
//			
//			System.out.println(++idx + "etc : " + element.toString());
//			System.out.println("==========================================");
//			
//		}
	}
	
}