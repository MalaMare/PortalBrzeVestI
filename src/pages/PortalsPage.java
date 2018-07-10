
package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PortalsPage extends Page {
    
    //    *********** testCreateNewPortal ***********    
    
    private void clickOnAddButton(){
//        WebElement addPortalButton = driver.findElement(By.className("pull-right"));
//        addPortalButton.click();
        clickOnElement(By.className("pull-right"));
    }
    
    private void sendTextOnTitleField() {
//        WebElement insertPortalField = driver.findElement(By.id("title"));
//        insertPortalField.sendKeys(Helper.getRandomText());
        sendTextOnField(By.id("title"));
    }
    
    private void sendTextOnUrlField() {
//        WebElement insertUrlField = driver.findElement(By.id("url"));
//        insertUrlField.sendKeys(Helper.getRandomUrl());
        sendUrlOnField(By.id("url"));
    }
    
//    ******!!!******
    private void selectRandomRegion() {        
//        Select regionCombo = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("region_id"))));
        Select regionCombo = new Select(waitForElementVisibility(By.name("region_id")));
        List <WebElement> weblist = regionCombo.getOptions();
        WebElement randomRegion = weblist.get(Helper.getRandomInteger(weblist.size()));  
        randomRegion.click();
    }
    
    private void clickOnSavePortalButton() {
//        WebElement saveButton = driver.findElement(By.id("save-portal-button"));
//        saveButton.click();
        clickOnElement(By.id("save-portal-button"));
    }
    
    public void createNewPortal() {
        clickOnAddButton();
        sendTextOnTitleField();
        sendTextOnUrlField();
        selectRandomRegion();
        clickOnSavePortalButton();
    }
    
    
}
