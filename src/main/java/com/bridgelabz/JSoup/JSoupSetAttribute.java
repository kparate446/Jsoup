package com.bridgelabz.JSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JSoupSetAttribute {
	public static void main(String[] args) {
		String html = "<html><head><title>Sample Title</title></head>"
		         + "<body>"
		         + "<p>Sample Content</p>"
		         + "<div id='sampleDiv'><a id='googleA' href='www.google.com'>Google</a></div>"
		         + "<div class='comments'><a href='www.sample1.com'>Sample1</a>"
		         + "<a href='www.sample2.com'>Sample2</a>"
		         + "<a href='www.sample3.com'>Sample3</a><div>"
		         +"</div>"
		         + "<div id='imageDiv' class='header'><img name='google' src='google.png' />"
		         + "<img name='yahoo' src='yahoo.jpg' />"
		         +"</div>"
		         +"</body></html>";
		Document document = Jsoup.parse(html);
		
		//Example: set attribute
		Element link = document.getElementById("sampleDiv");
		System.out.println("Outer HTML Before Modification: "+link.outerHtml());
		link.attr("href","www.yahoo.com"); // Added the Link
		System.out.println("Outer HTML After Modification: "+link.outerHtml());
		
	}
}
