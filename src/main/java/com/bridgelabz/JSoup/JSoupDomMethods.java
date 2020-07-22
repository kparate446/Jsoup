package com.bridgelabz.JSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupDomMethods {
	public static void main(String[] args) {
		String html =  "<html><head><title>Sample Title</title></head>"
				+ "<body>"
				+ "<p>Sample Content</p>"
				+ "<div id='sampleDiv'><a href='www.google.com'>Google</a>"
				+ "<div id='sampleDiv'><a href='www.googdfdgghjle.com'>Google</a></div>"
				+ "</div>"
				+"</body></html>";
		Document document = Jsoup.parse(html);
		System.out.println(document.title());
		Elements paragraphs = document.getElementsByTag("p");
		for (Element paragraph : paragraphs) {
			System.out.println(paragraph.text());
		}
		Element sampleDiv = document.getElementById("div");
		System.out.println("Data: "+sampleDiv.text());

		Elements links = sampleDiv.getElementsByTag("a");
		for (Element link : links) {
			System.out.println("Href: "+link.attr("href") );
			System.out.println("Text: "+ links.text());
		}	
	}
}
