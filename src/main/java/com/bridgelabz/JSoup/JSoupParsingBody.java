package com.bridgelabz.JSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupParsingBody {
	public static void main(String[] args) {
		String html = "<div><p>Smaple Content</p></div>";
		Document document = Jsoup.parseBodyFragment(html);
		Element body = document.body();
		Elements paragraphs = body.getElementsByTag("p");
		for(Element paragraph : paragraphs) {
			System.out.println(paragraph.text());
		}
	}
}
