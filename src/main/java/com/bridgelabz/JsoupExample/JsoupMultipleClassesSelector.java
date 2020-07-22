package com.bridgelabz.JsoupExample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class JsoupMultipleClassesSelector {
 
    public static void main(String[] args) {
        
        String strHTML = "<div class=\"left-align heading\">Multiple classes</div>" + 
                "<div class=\"left-align\">Content 1</div>" + 
                "<div class=\"heading\">Content 2</div>" +
                "<div>no class</div>";
        
        Document document = Jsoup.parse(strHTML);
        
        //select div elements having left-align class
        Elements divElements = document.select("div.left-align");
 
        System.out.println("div having single class left-align");
        for(Element div : divElements)
            System.out.println(div);
 
        System.out.println(""); 
        
        //select div elements having heading class
        divElements = document.select("div.heading");
 
        System.out.println("div having single class heading");
        for(Element div : divElements)
            System.out.println(div);
 
        System.out.println("");
        
        //select div elements having left-align and heading classes
        divElements = document.select("div.left-align.heading");
        
        System.out.println("div having multiple classes left-align and heading");
        for(Element div : divElements)
            System.out.println(div);        
    }
}