package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixmonths;
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement longerThanSixMonths;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueBtn;


    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "6 months or less":
                Reporter.log("Selecting 6 months or less"+moreOrLess+" from dropdown "+lessThanSixmonths.toString() + "<br>");
                clickOnElement(lessThanSixmonths);
                break;
            case "longer than 6 months":
                Reporter.log("longer than 6 months"+moreOrLess+" from dropdown "+longerThanSixMonths.toString() + "<br>");
                clickOnElement(longerThanSixMonths);
        }
    }
    public void clickNextStepButton(){
        Reporter.log("Clicking on NextStepButton"+ continueBtn.toString()+ "<br>");

        clickOnElement(continueBtn);
    }
}