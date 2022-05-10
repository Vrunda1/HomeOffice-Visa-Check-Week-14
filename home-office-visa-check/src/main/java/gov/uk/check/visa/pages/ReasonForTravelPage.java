package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='response-0']")
    WebElement travelReason;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAccedemicReason;
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartnerReason;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void selectReasonForVisitTravel() {
        Reporter.log("Clicking on Reason For Visit Travel"+ workAccedemicReason.toString()+ "<br>");
        clickOnElement(workAccedemicReason);
    }

    public void selectReasonForVisitJoinPartner() {
        Reporter.log("Clicking on Reason For Visit Join Partner"+ joinPartnerReason.toString()+ "<br>");
        clickOnElement(joinPartnerReason);
    }

    public void clickNextStepButton() {
        Reporter.log("Clicking on NextStepButton"+ continueButton.toString()+ "<br>");
        clickOnElement(continueButton);
    }

    public void selectReasonForVisit(String visitReason) {
        if (visitReason == "Tourism") {
            Reporter.log("Clicking on Tourism"+ travelReason.toString()+ "<br>");
            clickOnElement(travelReason);
        }
        if (visitReason == "workAccedemic") {
            Reporter.log("Clicking on workAccedemic"+ workAccedemicReason.toString()+ "<br>");
            clickOnElement(workAccedemicReason);
        }
        if (visitReason == "JoinPartner") {
            Reporter.log("Clicking on JoinPartner"+ joinPartnerReason.toString()+ "<br>");
            clickOnElement(joinPartnerReason);
        }
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

   }
