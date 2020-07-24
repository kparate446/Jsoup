package com.bridgelabz.example;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoup {
	public static void main(String[] args) throws IOException {
		/** Passing data in String Format */
		 String html = "<html><head><title>First parse</title></head>"
		 + "<body><p>Parsed HTML into a doc.</p></body></html>";
		 Document doc = Jsoup.parse(html);
		 System.out.println(doc);
		 System.out.println(doc.getElementsByTag("title").get(0).text());

		/** Passing data in Body Form */
		 String html = "<div><p>Lorem ipsum.</p>";
		 Document doc = Jsoup.parseBodyFragment(html);
		 Element body = doc.body();
		 System.out.println(body);

		/** Load a document from a Url */
		 Document doc = Jsoup.connect("http://example.com/").get();
		 System.out.println(doc);
		 String title = doc.title();
		 System.out.println(title);

		/** Load a document from a File */
		 File input = new File("C:\\Users\\HP\\Desktop\\ShoppingApp\\a.html");
		 Document doc = Jsoup.parse(input, "UTF-8", "");
		 System.out.println(doc);

		/** Use DOM methods to navigate a document */
		 Document doc = Jsoup.connect("http://example.com/").get();
		 Elements links = doc.getElementsByTag("a");
		 for (Element link : links) {
		 System.out.println(link.attr("href"));
		 System.out.println(link.text());
		 }

		/** Use selector-syntax to find elements */
		 Document doc = Jsoup.connect("http://example.com/").get();
		 System.out.println( doc.select("a[href]"));

		/** Extract attributes, text, and HTML from elements */
		 Document doc = Jsoup.connect("http://example.com/").get();
		 System.out.println(doc.body().text());

		/** Working with URLs */
		Document doc = Jsoup.connect("http://example.com/").get();
		System.out.println(doc.select("a").first().attr("href"));
		System.out.println(doc.select("a").first().attr("abs:href"));
	}
}