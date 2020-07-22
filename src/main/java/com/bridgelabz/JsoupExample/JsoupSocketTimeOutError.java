package com.bridgelabz.JsoupExample;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
 
public class JsoupSocketTimeOutError {
 
    public static void main(String[] args) {
        
        try{
            //connect to the website
            Connection connection = Jsoup.connect("http://www.example.com");
            
            //set user agent to Google Chrome
            connection.userAgent("Mozilla/5.0");
            
            //get the HTML document
            Document doc = connection.get();
            
            //parse text from HTML
            String strHTML = doc.text();
         }catch(IOException ioe){
            //System.out.println("IOException: " + ioe);
            ioe.printStackTrace();
        }        
    }
}