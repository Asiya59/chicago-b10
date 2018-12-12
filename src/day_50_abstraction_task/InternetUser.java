package day_50_abstraction_task;

public class InternetUser {
	
	public static void main(String[] args) {
		Chrome chrome = new Chrome(152);
		chrome.version = "68.08";
		chrome.launchBrowser();
		chrome.addTab("google.com");
		chrome.addTab("amazon.com");
		chrome.printInfo();
		chrome.addTab("etsy.com");
		chrome.addTab("bestbuy.com");
		chrome.seeAllUrls();
		chrome.changeTab("amazon.com");
		chrome.printInfo();
		chrome.closeTab("amazon.com");
		chrome.printInfo();
		chrome.addExtension("selenium IDE");
		chrome.runExtension("some extension");
	}

}













