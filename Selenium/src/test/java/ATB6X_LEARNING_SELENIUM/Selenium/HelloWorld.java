package ATB6X_LEARNING_SELENIUM.Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://sdet.live");
	}

}
