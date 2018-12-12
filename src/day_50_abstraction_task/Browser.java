package day_50_abstraction_task;

import java.util.List;

public abstract class Browser {

	public String version;
	public int memory;
	public boolean browserLaunched;
	public boolean windowMaximized;
	public String focusedUrl;
	public List<String> urls;
	
	public abstract void launchBrowser();
	public abstract void closeBrowser();
	public abstract void addTab(String url);
	public abstract void changeTab(String url);
	public abstract boolean closeTab(String url);
	
	public void maximizeWindow() {
		System.out.println("Browser maximized");
		this.windowMaximized = true;
	}
	
	public void printInfo() {
		System.out.println("\nCURRENT BROWSER STATUS INFO\n");
		System.out.println("Browser version: " + this.version);
		System.out.println("Available memory: " + this.memory);
		System.out.println("Window maximized: " + this.windowMaximized);
		System.out.println("Current URL: " + this.focusedUrl);
		System.out.println("Total open tabs: " + this.urls.size());
	}
	
	public void seeAllUrls() {
		System.out.println("\nALL URLS IN OPEN TABS\n");
		int count = 1;
		for(String url: urls) {
			System.out.println("URL - " + count + ": " + url);
			count++;
		}
	}
	
	
	
}













