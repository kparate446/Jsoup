package com.bridgelabz.JsoupExample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class JsoupIterateAllElements {
 
    public static void main(String[] args) {
        
        String strHTML = "<html>" +
                "<head>" +
                "<title>Page Title</title>" +
                "</head>" +
                "<body bgcolor=\"ffffff\">" +
                "<a href=\"http://www.google.com\">Google</a>" +
                "<h1>Heading 1</h1>" +
                "<div>div tag <strong>content</strong></div>" +
                "</body>" +
                "</html>";
        
        //parse HTML
        Document document = Jsoup.parse(strHTML);
        
        //select all elements
//        Elements elements = document.select("*");
//        Elements elements = document.body().select("*");
        Elements elements = document.body().children();
        //iterate elements using enhanced for loop
        for(Element e : elements)
            System.out.println( e.tagName() + ": " + e.text());
    }
}