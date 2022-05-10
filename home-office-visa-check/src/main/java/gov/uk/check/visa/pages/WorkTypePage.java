package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthcare;
    @FindBy(xpath = "//label[contains(text(),'Digital technology professional')]")
    WebElement digitaltechnology;
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement academicOrResearch;
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement workInArtsOrCulture;
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement professionalSports;
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousWorker;
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement startbuisness;
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement anotherTypeJob;


    public void clickNextStepButton() {
        Reporter.log("Clicking on newsletterbox"+ continueButton.toString()+ "<br>");
        clickOnElement(continueButton);
    }
    public void selectJobType(String job){
        switch (job) {
            case "Health and care professional":
                Reporter.log("Clicking on Health and care professiona"+ healthcare.toString()+ "<br>");
                clickOnElement(healthcare);
                break;
            case "Digital technology professional":
                Reporter.log("Clicking on Digital technology professional"+ digitaltechnology.toString()+ "<br>");
                clickOnElement(digitaltechnology);
                break;
            case "Academic or researcher":
                Reporter.log("Clicking on Academic or researcher"+ academicOrResearch.toString()+ "<br>");
                clickOnElement(academicOrResearch);
                break;
            case "Work in arts or culture":
                Reporter.log("Clicking on Work in arts or culture"+ workInArtsOrCulture.toString()+ "<br>");
                clickOnElement(workInArtsOrCulture);
                break;
            case "Professional sports person":
                Reporter.log("Clicking on Professional sports person"+ professionalSports.toString()+ "<br>");
                clickOnElement(professionalSports);
                break;
            case "Religious worker":
                Reporter.log("Clicking on Religious worker"+ religiousWorker.toString()+ "<br>");
                clickOnElement(religiousWorker);
                break;
            case "Iwant to start business":
                Reporter.log("Clicking on I want to start business"+ startbuisness.toString()+ "<br>");
                clickOnElement(startbuisness);
                break;
            case "Iwanttodoanothertypeofjobshowmeotherworkvisas":
                Reporter.log("Clicking on Iwant to do another typeof jobs how meotherworkvisas"+ anotherTypeJob.toString()+ "<br>");
                clickOnElement(anotherTypeJob);
                break;
        }
    }
    }








