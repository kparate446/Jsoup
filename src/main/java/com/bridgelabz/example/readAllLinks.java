package com.bridgelabz.example;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class readAllLinks {
	//Adding all the set of url
	public static Set<String> uniqueURL = new HashSet<String>();
	public static String site;

	public static void main(String[] args) throws IOException {
		readAllLinks obj = new readAllLinks();
		site = "stackoverflow.com";
		obj.getLinks("http://stackoverflow.com/");
	}

	private void getLinks(String url) throws IOException {
		Document doc = Jsoup.connect(url).userAgent("Mozilla").get();
		Elements links = doc.select("a");

		if (links.isEmpty()) {
			return;
		}
		links.stream().map((link) -> link.attr("abs:href")).forEachOrdered((this_url) -> {
			boolean add = uniqueURL.add(this_url);
			if (add && this_url.contains(site)) {
				System.out.println(this_url);
				try {
					getLinks(this_url);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		});
	}
}