
package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegionsPage extends Page {
    
    //    *********** testCreateNewRegion ***********

    private void clickOnAddRegionButton() {
        clickOnElement(By.className("pull-right"));
//        WebElement addRegionButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("pull-right")));
//        addRegionButton.click();
    }
    
    private void sendTextOnTitleField() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
//        WebElement insertTitleField = driver.findElement(By.id("title"));
//        insertTitleField.sendKeys(Helper.getRandomText());
    }
    
    private void clickOnSaveRegionButtton() {
        clickOnElement(By.id("save-region-button"));
//        WebElement saveRegionButton = driver.findElement(By.id("save-region-button"));
//        saveRegionButton.click();
    }
         
    public void addNewRegion() {
        clickOnAddRegionButton();
        sendTextOnTitleField();
        clickOnSaveRegionButtton();
    }

//    *********** testEditFirstRegion ***********    
    
    private List<WebElement> getRowsFromTable() {
       WebElement tBody = waitForElementVisibility(By.className("ui-sortable"));         
       List<WebElement> rows = tBody.findElements(By.tagName("tr"));
       return rows;
    }
    
    private WebElement chooseFirstRow() {  
       List<WebElement> rows = getRowsFromTable();
       WebElement firstRow = rows.get(0);
       return firstRow;
    }
    
    private void clickOnEditButton(WebElement row) {
        WebElement editButton = row.findElement(By.cssSelector("a[title='Edit']"));
        editButton.click();
    }
    
    private void sendTextOnTitleFieldWithClear(WebDriver driver) {
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.clear();
        titleField.sendKeys(Helper.getRandomText());
    }
    
    public void editFirstRegion() {
        WebElement firstRow = chooseFirstRow();
        clickOnEditButton(firstRow);
        sendTextOnField(By.id("title"));
        clickOnSaveRegionButtton();
    }
    
    //        *********** testEditLastRegion ***********  
    
    private WebElement chooseLastRow() {  
       List<WebElement> rows = getRowsFromTable();
       WebElement lastRow = rows.get(rows.size()-1);
       return lastRow;
    }
    
    //  testEditLastRegion - objedinjeno predhodno 
    public void editLastRegion() {
        WebElement lastRow = chooseLastRow();
        clickOnEditButton(lastRow);
        sendTextOnField(By.id("title"));
        clickOnSaveRegionButtton();     
    }
    
//        *********** testEditRandomRegion ***********  
    
    private WebElement chooseRandomRow() { 
        List<WebElement> rows = getRowsFromTable();
        WebElement randomRow = rows.get(Helper.getRandomInteger(rows.size()));    
        return randomRow;
    }
        
        //  testEditRandomRegion - objedinjeno predhodno 
    public void editRandomRegion() {
        WebElement randomRow = chooseRandomRow();
        clickOnEditButton(randomRow);
        sendTextOnField(By.id("title"));
        clickOnSaveRegionButtton();      
    }
    
//    *********** testDeleteRagion ***********
    
    private void clickOnDeleteButton (WebElement row) {
        WebElement deleteButton = row.findElement(By.cssSelector("button[title='Delete']"));
        deleteButton.click();
    }
    
    private void clickOnConfirmDeleteRegion () {
        WebElement confirmDelete = waitForElementVisibility(By.xpath("//*[@id='regionDeleteDialog']/div/div/div[3]/button[2]"));
        confirmDelete.click();
    }
    
    public void deleteFirstRegion() {
        WebElement firstRow = chooseFirstRow();
        clickOnDeleteButton(firstRow);
        clickOnConfirmDeleteRegion();
    }

    public void deleteLastRegion() {
        WebElement lastRow = chooseLastRow();
        clickOnDeleteButton(lastRow);
        clickOnConfirmDeleteRegion();
    }

    public void deleteRandomRegion() {
        WebElement randomRow = chooseRandomRow();
        clickOnDeleteButton(randomRow);
        clickOnConfirmDeleteRegion();
    }
    
}
