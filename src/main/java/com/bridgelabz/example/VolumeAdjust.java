package com.bridgelabz.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class VolumeAdjust {
	public static void main(String[] args) throws Exception {
		final Document document = Jsoup.connect(
				"https://www.wikihow.com/Adjust-Bass-on-a-Computer#/Image:Adjust-Bass-on-a-Computer-Step-7-Version-3.jpg")
				.timeout(6000).get();
			Elements body = document.select("div#mf-section-1 ");
		for (Element step : body) {
			String method = step.select("div.steps h3 div.altblock").text();
			String title = step.select("div.steps h3 span.method_of_count").text();
			System.out.println(title);
			for (Element img : step.select(".section_text img")) {
				String img_url = img.attr("data-src");
				System.out.println("Get Url:-> " + img_url);
			}
		}
	}
}