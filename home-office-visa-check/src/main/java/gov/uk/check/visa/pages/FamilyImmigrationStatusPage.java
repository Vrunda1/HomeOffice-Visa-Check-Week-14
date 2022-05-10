package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
           public FamilyImmigrationStatusPage() {
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath = "//input[@id='response-0']")
        WebElement yesButton;
        @FindBy(xpath = "//button[contains(text(),'Continue')]")
        WebElement clickOnCountinue;
        public void clickOnYes(){

            Reporter.log("Clicking on OnYes"+ yesButton.toString()+ "<br>");
            clickOnElement(yesButton);
        }
        public void clickOnCountinue(){

            Reporter.log("Clicking on Countinue"+ clickOnCountinue.toString()+ "<br>");
            clickOnElement(clickOnCountinue);
        }

    }

