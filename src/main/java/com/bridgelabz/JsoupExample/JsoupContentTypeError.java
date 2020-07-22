package com.bridgelabz.JsoupExample;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupContentTypeError {

	public static void main(String[] args) throws IOException {
		/**Error*/
		//        try{
		//            Document document = Jsoup.connect("http://ip.jsontest.com/").get();
		//        }catch(IOException ioe){
		//            ioe.printStackTrace();
		//        }
		/**Solve the Error*/
		try{            
			Document document = Jsoup.connect("http://ip.jsontest.com/")
					.ignoreContentType(true)
					.get();
			System.out.println(document.text());

		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	} 
}
