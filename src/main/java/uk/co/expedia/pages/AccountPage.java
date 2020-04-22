package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Pradip
 */
public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());


    @FindBy(xpath = "//button[@id='header-account-menu']")
    WebElement _accountLink;

    public void clickOnAccountButton() {
        Reporter.log("Clicking on account button " + _accountLink.toString() + "<br>");
        clickOnElement(_accountLink);
        log.info("Clicking on account button " + _accountLink.toString());
    }
}
