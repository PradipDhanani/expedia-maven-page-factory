package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Pradip
 */
public class FlightsPage extends Utility {
    private static final Logger log = LogManager.getLogger(FlightsPage.class.getName());

    @FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
    WebElement _flyingFrom;
    @FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
    WebElement _goingTo;
    @FindBy(xpath = "//input[@id='flight-departing-hp-flight']")
    WebElement _departing;
    @FindBy(xpath = "//input[@id='flight-returning-hp-flight']")
    WebElement _returning;
    @FindBy(xpath = "//div[@class='menu-bar gcw-travel-selector-wrapper']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")
    WebElement _travellers;
    @FindBy(xpath = "//body[contains(@class,'')]/meso-native-marquee/section[@id='WizardHero']/div[@id='hero-banner']/div[contains(@class,'hero-banner-gradient native-marquee')]/div[contains(@class,'cols-row hero-banner-inner')]/section[@id='wizardSection']/div[contains(@class,'hero-banner-box siteId-3 cf hideClassicDcol')]/div[@id='wizard-tabs']/div[contains(@class,'tabs-container col')]/section[@id='section-flight-tab-hp']/form[@id='gcw-flights-form-hp-flight']/fieldset[contains(@class,'room-data')]/div[contains(@class,'cols-nested')]/div[contains(@class,'ab25184-traveler-wrapper-flight available-for-flights gcw-clear-both')]/div[@id='traveler-selector-hp-flight']/div[contains(@class,'menu-bar gcw-travel-selector-wrapper')]/ul[contains(@class,'menu-bar-inner')]/li[contains(@class,'open')]/div[contains(@class,'menu sticky gcw-menu')]/div[contains(@class,'menu-main')]/div[contains(@class,'traveler-selector-sinlge-room-data traveler-selector-room-data')]/div[contains(@class,'uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized')]/div[contains(@class,'uitk-col all-col-shrink')]/button[contains(@class,'uitk-step-input-button uitk-step-input-plus')]/span[1]//*[local-name()='svg']")
    WebElement _adultTwo;
    @FindBy(xpath = "//li[contains(@class,'open')]//button[contains(@class,'close btn-text')]")
    WebElement _close;
    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]")
    WebElement _searchButton;
    @FindBy(xpath = "//span[@class='title-city-text']")
    WebElement _getSameDestinationText;

    public void enterFlyingFrom(String flyingLocation) {
        Reporter.log("Flying from " + flyingLocation + "flying field " + _flyingFrom.toString() + "<br>");
        sendTextToElement(_flyingFrom, flyingLocation);
        log.info("Flying from " + flyingLocation + " flying field " + _flyingFrom.toString());
    }

    public void enterGoingTo(String goingLocation) {
        Reporter.log("Going to " + goingLocation + "going field " + _goingTo.toString() + "<br>");
        sendTextToElement(_goingTo, goingLocation);
        log.info("Going to " + goingLocation + "going field " + _goingTo.toString());
    }

    public void enterDepartingDate(String date) {
        Reporter.log("Departing Date " + date + "Date field " + _departing.toString() + "<br>");
        sendTextToElement(_departing, date);
        log.info("Departing Date " + date + "Date field" + _departing.toString());
    }

    public void enterReturningDate(String returnDate) {
        Reporter.log("Returning Date " + returnDate + "Return date field" + _returning.toString() + "<br>");
        _returning.sendKeys(Keys.CONTROL + "a");
        _returning.sendKeys(Keys.DELETE);
        sendTextToElement(_returning, returnDate);
        log.info("Returning Date" + returnDate + "Return date field" + _returning.toString());
    }

    public void clickOnTravellers() {
        Reporter.log("Clicking on Travellers button " + _travellers.toString() + "<br>");
        clickOnElement(_travellers);
        log.info("Clicking on Travellers button" + _travellers.toString());
    }

    public void clickOnAdults() {
        Reporter.log("Clicking on adult " + _adultTwo.toString() + "<br>");
        clickOnElement(_adultTwo);
        log.info("Clicking on adult " + _adultTwo.toString());
    }

    public void clickOnClose() {
        Reporter.log("Clicking on close button " + _close.toString() + "<br>");
        clickOnElement(_close);
        log.info("Clicking on close button " + _close.toString());
    }

    public void clickOnSearchButton() {
        Reporter.log("Clicking on search button " + _searchButton.toString() + "<br>");
        clickOnElement(_searchButton);
        log.info("Clicking on search button " + _searchButton.toString());
    }

    public String getDestinationText() {
        Reporter.log("Getting Destination message" + _getSameDestinationText.toString() + "<br>");
        log.info("Getting Destination message " + _getSameDestinationText.toString());
        return getTextFromElement(_getSameDestinationText);
    }
}
