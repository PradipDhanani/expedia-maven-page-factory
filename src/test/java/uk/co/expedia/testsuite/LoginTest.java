package uk.co.expedia.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;
import uk.co.expedia.testbase.TestBase;

/**
 * Created by Pradip
 */
public class LoginTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    AccountPage accountPage;

    @BeforeMethod(groups = {"sanity", "smoke", "regression"})
    public void setUp() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        accountPage = new AccountPage();
    }

    @Test(groups = {"smoke", "regression"}, priority = 0)
    public void verifyUserShouldNotLoginWithInvalidUserNameAndPassword() {
        homePage.clickOnAcceptButton();
        accountPage.clickOnAccountButton();
        homePage.clickOnSignInButton();
        signInPage.enterEmailAddress("dhannobhagslowly@gmail.com");
        signInPage.enterPassword("dhanno123456@");
        signInPage.clickOnSignInButton();
        String expectedResult = "You may have entered an unknown email address or an incorrect password";
        String actualResult = signInPage.getErrorText();
        Assert.assertEquals(expectedResult, actualResult);


    }
}
