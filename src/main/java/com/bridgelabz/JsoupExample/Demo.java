package com.bridgelabz.JsoupExample;

public class Demo {
	public static void main(String[] args) {
		String[] strHtmlLinks = {
				"<a href='#'>HTML<b>Bold</b>link</a>",
				"<A href=''></A>",
				"< a href='#'></ a >",
				"< a href='#'>< / a >"
		};
		String strRegEx = "<[/]?a[^>]*>";
		for(String html : strHtmlLinks)
			System.out.println(html.replaceAll(strRegEx, ""));
	}
}