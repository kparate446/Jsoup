package com.bridgelabz.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Revenge {
	private static final String Website = "https://www.revengeofficial.com/";
	private static Map<String , String > items;


	public static void main(String[] args) throws IOException {
		items = new HashMap<>();
		getLink();
	}	
	private static void getLink() throws IOException {
		Document document = Jsoup.connect(Website).get();

		Elements elements = document.getElementsByClass("grid-view-item__link grid-view-item__image-container full-width-link");

		for(Element element : elements) {
			String link = element.attributes().get("href");
			findPrice(link);
			printItems();
		}
	}

	private static void findPrice(String link) throws IOException {
		Document document = Jsoup.connect(Website).get();
		Elements elements = document.getElementsByClass("price__regular");
		for(Element element : elements) {
			items.put(link, element.text());
		}
	}
	private static void printItems() {
		for (Map.Entry<String, String> entry : items.entrySet()){
			String links = entry.getKey();
			String price = entry.getValue();
			System.out.println("Link "+links);
			System.out.println("Price "+price);
		}
	}
}
