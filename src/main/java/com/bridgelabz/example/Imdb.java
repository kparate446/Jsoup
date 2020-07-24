package com.bridgelabz.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Imdb {
	public static void main(String[] args) throws Exception {
//		final Document document = Jsoup.connect("https://www.imdb.com/chart/top").get();
////		System.out.println(document.outerHtml());;
//		for (Element row: document.select("table.chart.full-width tr")) {
//			final String title = row.select(".titleColumn a").text();
//			final String rating = row.select(".imdbRating").text();
//			System.out.println(title + "--> Rating:  " + rating);
////			System.out.println(row.text());
//		}
			
			/*****OR*******/
		Document doc = Jsoup.connect("https://www.imdb.com/chart/top").timeout(6000).get();
		Elements body = doc.select("tbody.lister-list ");
//		System.out.println(body.select("tr").size());
		for(Element e :body.select("tr")) {
			String img = e.select("td.posterColumn img").attr("src");
			System.out.println(img);
			String title = e.select("td.posterColumn img").attr("alt");
			System.out.println(title);
			String year = e.select("td.titleColumn span.secondaryInfo").text();
			System.out.println(year.replaceAll("[^\\d]", ""));//(1997)-->1997
			String rate = e.select("td.ratingColumn.imdbRating").text().trim();
			System.out.println(rate);//ratingColumn
			String yourrate = e.select("td.ratingColumn.seen-widget seen-widget-tt0111161").text().trim();
			System.out.println(yourrate);
		}
	}
}