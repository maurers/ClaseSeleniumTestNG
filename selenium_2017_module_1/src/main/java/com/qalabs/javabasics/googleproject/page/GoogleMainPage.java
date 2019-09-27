package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMainPage extends BasePage {
  @FindBy(how = How.NAME, using = "q")
  private WebElement searchBox;

  @FindBy(how = How.NAME, using = "btnK")
  private WebElement searchInGoogleButton;

  @FindBy(how = How.NAME, using = "btnI")
  private WebElement feelingLuckyButton;

  @FindBy(how = How.ID, using = "hplogo")
  private WebElement doodle;

    public GoogleMainPage(WebDriver driver) {
        super(driver, "");
        //this.doodle.submit();
        BasePage myPage = new BasePage();
        myPage.open();
    }
    public GoogleResultsPage searchInGoogle(String searchTxt){
        // Add Code
        this.searchBox.sendKeys(searchTxt);
        this.searchInGoogleButton.click;
        return null;
    }
    public GoogleResultsPage feelingLuckySearch(String searchTxt){
        // Add Code
        this.searchBox.sendKeys(searchTxt);
        this.feelingLuckyButton.click;
        return null;
    }

    @Override
    public boolean isLoaded(){
        // Add Code
        BasePage myBase = new BasePage();
        try{
            WebDriverWait wait= new  WebDriverWait(driver, 10);
            wait.until(ExceptionConditions.VisibilityOf(double));
            myBase.logger.info("Google main page loaded");
        }catch(RunttimeException exception){
            myBase.logger.error("Google main page was not load;"+ exception)
        }
    }
}
