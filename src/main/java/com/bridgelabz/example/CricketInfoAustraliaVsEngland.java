package com.bridgelabz.example;

import java.io.IOException;
import java.util.StringJoiner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class CricketInfoAustraliaVsEngland {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://www.espncricinfo.com/series/18659/scorecard/1152846/england-vs-australia-1st-test-australia-in-eng-2019")
				.header("User-Agent", "Chrome")
				.get();
		System.out.println("Title of the page is "+doc.title());
		//#main-container > div > div > div.match-body > div.match-scorecard-page > div:nth-child(1) > div:nth-child(1) > div > div > div > div > table.table.batsman > tbody > tr > td.batsman-cell.text-truncate.out > a	
		//#main-container > div > div > div.match-body> div.match-scorecard-page > div:nth-child(1) > div:nth-child(1) > div > div > div > div > table.table.batsman > tbody > tr:nth-child(5) > td.batsman-cell.text-truncate.out > a
		//	Elements batsmen = doc.select("#main-container > div > div > div.match-body > div.match-scorecard-page > div:nth-child(1) > div:nth-child(1) > div > div > div > div > table.table.batsman > tbody > tr > td.batsman-cell.text-truncate > a");
		//	batsmen.forEach(batsman -> System.out.println(batsman));
		for (Element table : doc.getElementsByTag("table")) {
			for (Element trElement : table.getElementsByClass("table bowler")) {
				StringJoiner joiner = new StringJoiner(",");
				for (Element tdElement : trElement.getElementsByTag("td")) {
					joiner.add(tdElement.text());
				}
				System.out.println(joiner);
			}
		}
	}
}