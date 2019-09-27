package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleMainPage extends BasePage implements Page{
  @FindBy(how = How.NAME, using = "q")
  private WebElement searchBox;

  @FindBy(how = How.NAME, using = "btnK")
  private WebElement searchInGoogleButton;

  @FindBy(how = How.NAME, using = "btnI")
  private WebElement feelingLuckyButton;

  @FindBy(how = How.ID, using = "hplogo")
  private WebElement doodle;

  public GoogleMainPage(WebDriver driver) {
    super();
    //this.doodle.submit();
  }
  public GoogleResultsPage searchInGoogle(String searchTxt){
    this.searchBox.sendKeys(searchTxt);
    this.searchInGoogleButton.click;
    return null;
  }
  public GoogleResultsPage feelingLuckySearch(String searchTxt){
    this.searchBox.sendKeys(searchTxt);
    this.feelingLuckyButton.click;
    return null;
  }

  @Override
  public boolean isLoaded(){
    // hay que revisar esto más a detalle
    BasePage myBase = new BasePage();
    try{
      WebDriverWait wait= new  WebDriverWait(driver, 10);
      wait.until(ExceptionConditions.VisibilityOf(double));
      myBase.logger.info("Google main page loaded");
      return true;
    }catch(RunttimeException exception){
      myBase.logger.error("Google main page was not load;"+ exception);
      return false;
    }
  }

}
