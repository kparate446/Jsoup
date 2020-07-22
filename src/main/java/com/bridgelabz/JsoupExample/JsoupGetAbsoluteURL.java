package com.bridgelabz.JsoupExample;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupGetAbsoluteURL {

	public static void main(String[] args) {

		try{
			Document document = 
					Jsoup
					.connect("http://www.google.com")
					.userAgent("Mozilla/5.0")
					.timeout(10 * 1000)
					.get();

			Elements elements = document.select("img[src]");

			for(Element e : elements){
				System.out.println("Relative URL: " + e.attr("src"));
				System.out.println("Absolute URL: " + e.absUrl("src"));
			}
		}catch(IOException ioe){
			System.out.println("Exception: " + ioe);
		}
	}
}