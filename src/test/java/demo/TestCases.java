package demo;

import org.checkerframework.checker.units.qual.min;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.util.logging.Level;
// import io.github.bonigarcia.wdm.WebDriverManager;
import demo.wrappers.Wrappers;

public class TestCases {
        ChromeDriver driver;

        /*
         * TODO: Write your tests here with testng @Test annotation.
         * Follow `testCase01` `testCase02`... format or what is provided in
         * instructions
         */

        /*
         * Do not change the provided methods unless necessary, they will help in
         * automation and assessment
         */
        @BeforeTest
        public void startBrowser() {
                System.setProperty("java.util.logging.config.file", "logging.properties");

                // NOT NEEDED FOR SELENIUM MANAGER
                // WebDriverManager.chromedriver().timeout(30).setup();

                ChromeOptions options = new ChromeOptions();
                LoggingPreferences logs = new LoggingPreferences();

                logs.enable(LogType.BROWSER, Level.ALL);
                logs.enable(LogType.DRIVER, Level.ALL);
                options.setCapability("goog:loggingPrefs", logs);
                options.addArguments("--remote-allow-origins=*");

                System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "build/chromedriver.log");

                driver = new ChromeDriver(options);

                driver.manage().window().maximize();
        }

        @Test
        public void testCase01() throws InterruptedException, AWTException {

                Wrappers action = new Wrappers();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

                action.googleForm(driver, "https://forms.gle/wjPkzeSEk1CM7KgGA");

                // Enter Name
                WebElement name = wait.until(ExpectedConditions
                                .presenceOfElementLocated(By.xpath(
                                                "//*[@id='mG61Hd']/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input")));
                action.enterText(driver, name, "Crio Learner");

                // Ans for Why are you practicing Automation?
                long epoch = System.currentTimeMillis() / 1000;
                WebElement answer = driver.findElement(By.xpath(
                                "//*[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/textarea"));
                action.enterText(driver, answer, "I want to be the best QA Engineer! " + epoch);

                // Select experience
                WebElement selectExperience = driver.findElement(By.xpath("//*[@id='i19']/div[3]/div"));
                action.clickOnElement(driver, selectExperience);

                // Selecting Java Selenium TestNg
                WebElement selectSelenium = driver.findElement(By.xpath("//*[@id='i37']/div[2]"));
                WebElement selectJava = driver.findElement(By.xpath("//*[@id='i34']/div[2]"));
                WebElement selectTestNg = driver.findElement(By.xpath("//*[@id='i43']/div[2]"));
                action.clickOnElement(driver, selectJava);
                action.clickOnElement(driver, selectSelenium);
                action.clickOnElement(driver, selectTestNg);

                // Select Mr from dropdown
                WebElement clickOnDropDown = driver.findElement(
                                By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div[1]/div[1]"));
                action.clickOnElement(driver, clickOnDropDown);
                Thread.sleep(2000);
                WebElement selectMr = driver.findElement(By.xpath(
                                "//*[@id='mG61Hd']/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[2]/div[3]/span"));
                action.clickOnElement(driver, selectMr);

                // Selecting 7 days ago in calendar

                // get the date month year
                LocalDate sevenDaysAgo = LocalDate.now().minusDays(7);

                int day = sevenDaysAgo.getDayOfMonth();
                String daY = String.valueOf(day);

                int month = sevenDaysAgo.getMonthValue();
                String montH = String.valueOf(month);

                // year conversion
                int year = sevenDaysAgo.getYear();
                String yeaR = String.valueOf(year);

                // click on calendar
                WebElement calendar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                                "//*[@id='mG61Hd']/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/input")));
                action.clickOnElement(driver, calendar);

                // Enter year
                action.enterText(driver, calendar, yeaR);
                WebElement clickOnPage = driver.findElement(By.tagName("html"));
                action.clickOnElement(driver, clickOnPage);

                // Enter month
                action.clickOnElement(driver, calendar);
                Thread.sleep(2000);
                action.pressAndReleaseLeftArrowKey();
                Thread.sleep(4000);
                action.actionsSendKeys(driver, montH);
                action.clickOnElement(driver, clickOnPage);

                // Enter day
                Thread.sleep(2000);
                action.clickOnElement(driver, calendar);
                for (int i = 0; i < 2; i++) {
                        action.pressAndReleaseLeftArrowKey();
                        Thread.sleep(100); // Small delay to mimic human interaction
                }
                action.actionsSendKeys(driver, daY);
                action.clickOnElement(driver, clickOnPage);

                // Enter time
                WebElement hours = driver.findElement(By.xpath(
                                "//*[@id='mG61Hd']/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/input"));
                action.enterText(driver, hours, "07");
                WebElement minutes = driver.findElement(By.xpath(
                                "//*[@id='mG61Hd']/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[3]/div/div[1]/div/div[1]/input"));
                action.enterText(driver, minutes, "30");

                // Click on submit button
                WebElement submitButton = driver
                                .findElement(By.xpath("//*[@id='mG61Hd']/div[2]/div/div[3]/div[1]/div[1]/div/span"));
                action.clickOnElement(driver, submitButton);

                // Validate response message after submission
                Thread.sleep(2000);
                WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[3]"));
                String textQA = action.returnGetText(driver, text);
                System.out.println(textQA);

        }

        @AfterTest
        public void endTest() {
                // driver.close();
                driver.quit();

        }
}