package com.bridgelabz.JSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JSoupWorkingUrl {
	public static void main(String[] args) throws Exception {
		
		String url = "http://www.tutorialspoint.com/";
		Document document = Jsoup.connect(url).get();
		System.out.println(document.text());
		Element link = document.select("a").first();
		System.out.println("Relative Link: "+link.attr("href"));
		System.out.println("Absolute Link: "+link.attr("abs:href"));
		System.out.println("Absolute Url Link: "+link.absUrl("href"));
	}
}