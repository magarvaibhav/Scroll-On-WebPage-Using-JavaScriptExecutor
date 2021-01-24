package tests;

import steps.ScrollSteps;

public class ScrollHandleTest {

	public static void main(String[] args) throws Exception {
		
		ScrollSteps objScrollSteps=new ScrollSteps();
		objScrollSteps.LaunchBrowser();
		objScrollSteps.openApplication();
		objScrollSteps.allMethodsOfScroll();
		objScrollSteps.closeBrowser();
		
	}

}
