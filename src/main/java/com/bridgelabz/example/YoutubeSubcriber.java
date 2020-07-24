package com.bridgelabz.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class YoutubeSubcriber {
	public static void main(String[] args) throws Exception {
		String Url = "https://www.youtube.com/watch?v=jFWsj_QT0G8";
		Document doc = Jsoup.connect(Url)
				.header("User-Agent", "Chrome")
				.get();
		
		Element body = doc.body();
		Elements elements = body.getElementsByAttributeValue("itemprop","Url");
		elements.forEach(element -> System.out.println(element.attr("href")));
	}
}
