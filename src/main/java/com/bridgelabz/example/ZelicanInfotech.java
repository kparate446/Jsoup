package com.bridgelabz.example;

import java.io.IOException;
import java.util.StringJoiner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ZelicanInfotech {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://www.zaubacorp.com/company/ZELICAN-INFOTECH-PRIVATE-LIMITED/U72300MH2013PTC244289")
				.header("User-Agent", "Chrome")
				.get();
		for (Element table : doc.getElementsByTag("table")) {
			for (Element trElement : table.getElementsByTag("tr")) {
				StringJoiner data = new StringJoiner(" --> ");
				for (Element tdElement : trElement.getElementsByTag("td")) {
					data.add(tdElement.text());
				}
				System.out.println(data);
			}
		}
	}
}