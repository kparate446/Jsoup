package com.bridgelabz.JsoupExample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.safety.Whitelist;
 
public class JsoupPreserveLineBreaks {
 
    public static void main(String[] args) {
 
        String strHTML = "<html><body>" +
                    "Hello\nworld" +
                    "<br>" + 
                    "HiWorld" +
                    "<p>Paragraph</p> completed" +
                    "</body></html>";
        
        //create Jsoup document from HTML
        Document jsoupDoc = Jsoup.parse(strHTML);
        
        //set pretty print to false, so \n is not removed
        jsoupDoc.outputSettings(new OutputSettings().prettyPrint(false));
        
        //select all <br> tags and append \n after that
        jsoupDoc.select("br").after("\\n");
        
        //select all <p> tags and prepend \n before that
        jsoupDoc.select("p").before("\\n");
                
        //get the HTML from the document, and retaining original new lines
        String str = jsoupDoc.html().replaceAll("\\\\n", "\n");
        
        String strWithNewLines = 
            Jsoup.clean(str, "", Whitelist.none(), new OutputSettings().prettyPrint(false));
        
        System.out.println(strWithNewLines);
    }
}