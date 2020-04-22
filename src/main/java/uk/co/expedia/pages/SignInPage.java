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
public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    @FindBy(xpath = "//input[@id='gss-signin-email']")
    WebElement _emailAddress;
    @FindBy(xpath = "//input[@id='gss-signin-password']")
    WebElement _passwordLink;
    @FindBy(xpath = "//button[@id='gss-signin-submit']")
    WebElement _signIn;
    @FindBy(xpath = "//div[@id='gss-signin-incorrect-email-or-password']")
    WebElement _errorText;

    public void enterEmailAddress(String email) {
        Reporter.log("Enter email " + email + "Email field " + _emailAddress.toString() + "<br>");
        sendTextToElement(_emailAddress, email);
        log.info("Enter email " + email + "Email field " + _emailAddress.toString());

    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + "Enter password " + _passwordLink.toString() + "<br>");
        sendTextToElement(_passwordLink, password);
    }

    public void clickOnSignInButton() {
        Reporter.log("Clicking sign in button " + _signIn.toString() + "<br>");
        clickOnElement(_signIn);
        log.info("Clicking sign in button " + _signIn.toString());

    }

    public String getErrorText() {
        Reporter.log("Getting error message " + _errorText.toString() + "<br>");
        log.info("Getting error message " + _errorText.toString());
        return getTextFromElement(_errorText);
    }

}
