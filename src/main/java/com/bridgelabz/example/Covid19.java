package com.bridgelabz.example;

import java.io.IOException;
import java.util.StringJoiner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Covid19 {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://en.m.wikipedia.org/wiki/COVID-19_testing#United_States_2")
				.get();

		for (Element table : doc.getElementsByTag("table")) {
			for (Element trElement : table.getElementsByTag("tr")) {
				StringJoiner joiner = new StringJoiner(",");
				for (Element tdElement : trElement.getElementsByTag("th")) {
					joiner.add(tdElement.text());
				}
				for (Element element : trElement.getElementsByTag("td")) {
					joiner.add(element.text());
				}
				System.out.println(joiner);
			}
		}
	}
}