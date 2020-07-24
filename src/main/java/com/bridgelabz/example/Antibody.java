package com.bridgelabz.example;

import java.io.IOException;
import java.util.StringJoiner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Antibody {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://en.m.wikipedia.org/wiki/Antibody")
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
