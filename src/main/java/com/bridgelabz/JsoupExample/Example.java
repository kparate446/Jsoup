package com.bridgelabz.JsoupExample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Example {
	public static void main(String[] args) {
		String strHTML = "<div class=\"left-align heading\">Content</div>";
		Document document = Jsoup.parse(strHTML);
		Elements divElements = document.select("div.left-align.heading");		 
		System.out.println("Selected div");
		 
		for(Element div : divElements)
		    System.out.println(div);
	}
}