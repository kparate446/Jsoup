package com.bridgelabz.example;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Covid {
	public static void getData(String c) throws IOException {
		final Document document = Jsoup.connect("https://www.worldometers.info/coronavirus/country/"+ c +"/").get();
		System.out.println(document.title());
		//#maincounter-wrap
		Elements elements = document.select("#maincounter-wrap");
		System.out.println(elements.html());
		elements.forEach((e) -> {
			String text = e.select("h1").text();
			String count = e.select(".maincounter-number>span").text();
			System.out.println(text+" : "+count);
		});
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coutry name: ");
		String contry = sc.nextLine();
		getData(contry);
	}
}