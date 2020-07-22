package com.bridgelabz.JSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JSoupLoadingFromUrl {
	public static void main(String[] args) throws Exception {
		String url = "http://www.google.com";
		Document document = Jsoup.connect(url).get();
		System.out.println(document.title());
	}
}
