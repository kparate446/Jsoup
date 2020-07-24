package com.bridgelabz.JsoupExample;

import java.io.IOException;
import java.util.Map;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupPostData {
	public static void main(String[] args) {     
		try{
			Response response = 
					Jsoup.connect("http://www.example.com/postpage")
					.userAgent("Mozilla/5.0")
					.timeout(10 * 1000)
					.method(Method.POST)
					.data("txtloginid", "YOUR_LOGINID")
					.data("txtloginpassword", "YOUR_PASSWORD")
					.data("random", "123342343")
					.data("task", "login")
					.data("destination", "/welcome")
					.followRedirects(true)
					.execute();

			//parse the document from response
			Document document = response.parse();
			//get cookies
			Map<String, String> mapCookies = response.cookies();
		}catch(IOException ioe){
			System.out.println("Exception: " + ioe);
		}

	}
}