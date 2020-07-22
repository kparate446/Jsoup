package com.bridgelabz.JsoupExample;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupBasicAuthentication {

	public static void main(String[] args) {

		//replace these values with your own
		String strURL = "http://localhost:4200/login";
		String strUserId = "kparate03@gmail.com";
		String strPasword = "kunal";

		/*
		 * User id, password string needs to be in
		 * userid:password format with no space 
		 * in between them
		 */
		String authString = strUserId + ":" + strPasword;

		//encode the authString using base64
		String encodedString = 
				new String( Base64.encodeBase64(authString.getBytes()) );

		/*
		 * connect to the website using Jsoup
		 * and provide above value in Authorization header
		 */
		System.out.println("Id:Password---->"+authString);
		try{

			Document document = Jsoup.connect(strURL)
					.header("Authorization", "Basic " + encodedString)
					.get();

			System.out.println("Logged in using basic authentication");
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}