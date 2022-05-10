package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ResultPage resultPage;
    ReasonForTravelPage reasonForTravelPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void anAustralianCominToUKForTourism() {
        startPage.clickOnAcceptCookies();
        startPage.clickOnStartNow();
       selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism");
       reasonForTravelPage.clickNextStepButton();
       SoftAssert softAssert = new SoftAssert();
       softAssert.assertEquals(resultPage.getResultMessage(), "You will not need a visa to come to the UK");
       softAssert.assertAll();
    }
    @Test(groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {
        startPage.clickOnStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        Thread.sleep(1000);
        reasonForTravelPage.selectReasonForVisit("workAccedemic");
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectLengthOfStay("longerThanSixMonths");
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickNextStepButton();
        SoftAssert softAssert = new SoftAssert();
        resultPage.confirmResultMessage("You need a visa to work in health and care");
    }
    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickOnStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("JoinPartner");
        reasonForTravelPage.clickNextStepButton();
        familyImmigrationStatusPage.clickOnYes();
        familyImmigrationStatusPage.clickOnCountinue();
        resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");
    }
    }













