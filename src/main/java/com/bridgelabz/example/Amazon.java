package com.bridgelabz.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Amazon {
	public static void main(String[] args) throws Exception {
		final Document document = Jsoup.connect("https://www.amazon.in/").timeout(6000).get();
		Elements body = document.select("div.a-section");
		for (Element step : body) {
			String title = step.select(" div.a-cardui-body div a ").text();
			System.out.println(title);
			for (Element img : step.select("div img")) {
				System.out.println("Get Url:-> " + img);
			}
		}
	}
}