
package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SourcesPage extends Page{
    
    private void clickOnAddSourcesButton() {
//        WebElement addSourceButton = driver.findElement(By.className("pull-right"));
//        addSourceButton.click();
        clickOnElement(By.className("pull-right"));
    }
    
    private void selectRandomPortal() {
//        Select portalCombo = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("portal_id"))));
        Select portalCombo = new Select(waitForElementVisibility(By.name("portal_id")));
        List <WebElement> weblist = portalCombo.getOptions();
        WebElement randomPortal = weblist.get(Helper.getRandomInteger(weblist.size()));  
        randomPortal.click();
    }
    
    private void sendTextOnTitleField() {
//        WebElement insertTitleField = driver.findElement(By.id("title"));
//        insertTitleField.sendKeys(Helper.getRandomText());
        clickOnElement(By.name("title"));
    }
    
    private void sendTextOnUrlField() {
//        WebElement insertUrlField = driver.findElement(By.name("url"));
//        insertUrlField.sendKeys(Helper.getRandomUrl());
        sendUrlOnField(By.name("url"));
    }
    
    private void selectType() {
        WebElement combo = waitForElementVisibility(By.name("news_fetcher"));
        Select typeCombo = new Select(combo);
        typeCombo.selectByValue("rss");
    }
    
    private void selectRandomProcessor() {
//        Select processorCombo = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("portal_id"))));
        Select processorCombo = new Select(waitForElementVisibility(By.name("news_processor")));
        List <WebElement> weblist = processorCombo.getOptions();
        WebElement randomProcessor = weblist.get(Helper.getRandomInteger(weblist.size()));  
        randomProcessor.click();
    }
    
    private void selectRandomCategory() {
//        Select categoryCombo = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("portal_id"))));
        Select categoryCombo = new Select(waitForElementVisibility(By.name("news_processor")));
        List <WebElement> weblist = categoryCombo.getOptions();
        WebElement randomCategory = weblist.get(Helper.getRandomInteger(weblist.size()));  
        randomCategory.click();
    }
    
    private void clickOnSaveSourceButton() {
//        WebElement saveButton = driver.findElement(By.id("save-source-button"));
//        saveButton.click();
        clickOnElement(By.id("save-source-button"));
    }
    
    public void createNewSource() {
        clickOnAddSourcesButton();
        clickOnAddSourcesButton();
        selectRandomPortal();
        sendTextOnTitleField();
        sendTextOnUrlField();
        selectType();
        selectRandomProcessor();
        selectRandomCategory();
        clickOnSaveSourceButton();
    }
    
}
