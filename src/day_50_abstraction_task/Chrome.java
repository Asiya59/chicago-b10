package day_50_abstraction_task;

import java.util.ArrayList;

public class Chrome extends Browser implements Extension{

	public Chrome(int memory) {
		this.memory = memory;
		this.urls = new ArrayList<>();
	}
	
	@Override
	public void addExtension(String extention) {
		System.out.println("Adding the extention: " + extention);
	}
	
	@Override
	public void removeExtension(String extention) {
		System.out.println("Removing the extension: " + extention);
	}
	
	@Override
	public void runExtension(String extention) {
		System.out.println("Extension: " + extention + " is running now");
	}
	
	
	
	
	
	@Override
	public void launchBrowser() {
		if(this.browserLaunched) {
			System.out.println("Chrome browser is already launched");
		}
		else {
			System.out.println("Chrome browser is launching");
			this.memory -= 50;
			this.browserLaunched = true;
		}
	}
	
	@Override
	public void addTab(String url) {
		if(this.browserLaunched) {
			if(this.memory >= 25) {
				System.out.println("Chrome browser adding new tab: " + url);
				this.urls.add(url);
				this.focusedUrl = url;
				this.memory -= 25;
			}
			else {
				System.out.println("Sorry Chrome browser is out of memory");
			}
		}
		else {
			System.out.println("Chrome browser is not launched yet. Please launch the browser first.");
		}
	}
	
	@Override
	public boolean closeTab(String url) {
		for(String u: this.urls) {
			if(u.equals(url)) {
				if(this.focusedUrl.equals(url) && this.urls.size() > 1) {
					this.focusedUrl = this.urls.get(0);
				}
				this.urls.remove(u);
				this.memory += 25;
				System.out.println("Tab with: " + url + " is closed.");
				return true;
			}
		}
		System.out.println("Tab with: " + url + " was not found in open tabs.");
		return false;
	}
	
	@Override
	public void changeTab(String url) {
		boolean found = false;
		for(String u: this.urls) {
			if(u.equals(url)) {
				this.focusedUrl = url;
				System.out.println("Tab changed to URL: " + url);
				return;
			}
		}
	
		System.out.println("URL: " + url + " was not found within open tabs");
	}
	
	@Override
	public void closeBrowser() {
		if(this.browserLaunched) {
			System.out.println("Closing Chrome browser. All tabs are closing");
			this.memory += (this.urls.size() * 25) + 50;
			this.urls.clear();
			this.focusedUrl = null;
			this.browserLaunched = false;
		}
		else {
			System.out.println("Chrome browser is not launched.");
		}
	}

	
}




























