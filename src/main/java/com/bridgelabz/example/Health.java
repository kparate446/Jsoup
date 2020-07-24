package com.bridgelabz.example;

import java.util.StringJoiner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Health {
	public static void main(String[] args) throws Exception {
		Document doc = Jsoup
				.connect("https://www.healthed.govt.nz/resource-table/table-infectious-diseases")
				.get();

		for (Element table : doc.getElementsByTag("table")) {
			for (Element trElement : table.getElementsByTag("tr")) {
				StringJoiner joiner = new StringJoiner(",");
				for (Element tdElement : trElement.getElementsByTag("td")) {
					joiner.add(tdElement.text());
				}
				System.out.println(joiner);
			}
		}
	}
}