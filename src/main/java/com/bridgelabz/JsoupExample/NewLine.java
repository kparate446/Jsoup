package com.bridgelabz.JsoupExample;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.safety.Whitelist;

public class NewLine {
	public static void main(String[] args) {

		String strHTML = "<html><body>Hello\nworld</body></html>";	

		OutputSettings settings = new OutputSettings();
		settings.prettyPrint(false);
		String str = Jsoup.clean(strHTML, "", Whitelist.none(), settings);
		System.out.println(str);
	}
}