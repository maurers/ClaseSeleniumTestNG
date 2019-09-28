package com.qalabs.seleniumbasics.googleproject;

import com.qalabs.javabasics.googleproject.components.ResultItem;
import com.qalabs.javabasics.googleproject.page.BasePage;
import com.qalabs.javabasics.googleproject.page.GoogleMainPage;
import com.qalabs.javabasics.googleproject.page.GoogleResultsPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleExampleTest extends BasePage {
  private GoogleMainPage google;
  private GoogleResultsPage resultsPage;
  private ResultItem resultItem;

  public GoogleExampleTest(WebDriver driver, String baseUrl) {
    super(driver, baseUrl);
  }

  @BeforeClass
  public  void initializeGooglePage() {
    this.google = new GoogleMainPage(this.driver);
    this.resultsPage = null;
  }

  @Test
  public void openGoogle() {
    google.open();
    Assert.assertTrue(google.isLoaded());
  }

  @Test (description = "Search something in google", dependsOnMethods = {"openGoogle"})
  public void searchInGoogle() {
    // Add Code
    this.google.searchInGoogle("Selenium");
    Assert.assertNotNull(this.resultsPage.getResults());
  }

  @Test (description = "Search something again", dependsOnMethods = {"searchInGoogle"})
  public void performNewSearch() {
    // Add Code
    this.resultsPage.search("Webdriver");
    Assert.assertNotNull(this.resultsPage.getResults());
  }

  @Test (description = "Click next button", dependsOnMethods = {"performNewSearch"})
  public void clickNextResults() {
    // Add Code
    this.resultsPage.nextResultPage();
    Assert.assertTrue(resultsPage.isLoaded());
  }

  @Test (description = "Click prev button", dependsOnMethods = {"clickNextResults"})
  public void clickPrevResults() {
    // Add Code
    this.resultsPage.prevResultPage();
    Assert.assertTrue(resultsPage.isLoaded());
  }

  @Test (description = "Select first result found", dependsOnMethods = {"clickPrevResults"})
  public void selectFirstResult() {
    // Add Code
    Assert.assertNotNull(this.resultItem.getTitle());
  }

}
