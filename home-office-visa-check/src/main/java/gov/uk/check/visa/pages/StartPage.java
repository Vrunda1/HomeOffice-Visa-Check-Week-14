package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCokies;
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startButton;
    public void clickOnAcceptCookies() {
        Reporter.log("Clicking on AcceptCookies"+ acceptCokies.toString()+ "<br>");
        clickOnElement(acceptCokies);
    }
    public void clickOnStartNow() {
        Reporter.log("Clicking on StartNow"+ startButton.toString()+ "<br>");
        clickOnElement(startButton);

    }
}
