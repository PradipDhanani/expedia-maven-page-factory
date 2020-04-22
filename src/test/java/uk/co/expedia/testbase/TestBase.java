package uk.co.expedia.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.expedia.basepage.BasePage;
import uk.co.expedia.browserselector.BrowserSelector;
import uk.co.expedia.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

/**
 * Created by Pradip
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();

    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");


    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"sanity","smoke","regression"})
    public void tearDown() {
        driver.quit();
    }

}
