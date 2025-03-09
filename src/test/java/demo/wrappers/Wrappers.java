package demo.wrappers;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Wrappers {
    /*
     * Write your selenium wrappers here
     */
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void googleForm(WebDriver driver, String Url) {
        driver.get(Url);
    }

    public void enterText(WebDriver driver, WebElement element, String text) {
        if (element != null) {

            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(text);
        } else {
            System.out.println("Element is null. Cannot enter text.");
        }
    }

    public void clickOnElement(WebDriver driver, WebElement element) {
        if (element != null) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } else {
            System.out.println("Element is null. Cannot perform click action.");
        }
    }

    public void pressAndReleaseLeftArrowKey() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
    }

    public void actionsSendKeys(WebDriver driver, String num) {
        Actions actions = new Actions(driver);
        actions.sendKeys(num).perform();
    }

    public String returnGetText(WebDriver driver, WebElement element) {
        return element.getText();
    }
}
