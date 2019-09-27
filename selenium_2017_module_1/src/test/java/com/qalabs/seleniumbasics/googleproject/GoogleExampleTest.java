package com.qalabs.seleniumbasics.googleproject;

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

  public GoogleExampleTest(WebDriver driver, String baseUrl) {
    super();
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
  }

  @Test (description = "Search something again", dependsOnMethods = {"searchInGoogle"})
  public void performNewSearch() {
    // Add Code
  }

  @Test (description = "Click next button", dependsOnMethods = {"performNewSearch"})
  public void clickNextResults() {
    // Add Code
  }

  @Test (description = "Click prev button", dependsOnMethods = {"clickNextResults"})
  public void clickPrevResults() {
    // Add Code
  }

  @Test (description = "Select first result found", dependsOnMethods = {"clickPrevResults"})
  public void selectFirstResult() {
    // Add Code
  }

}
