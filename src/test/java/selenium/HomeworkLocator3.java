package selenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeworkLocator3 {
    private final By NAME_FIELD = By.id("name");
    private final By SURNAME_FIELD = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By LUGGAGE = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By PRODUCT_TYPE = By.xpath("//*[@id='fullForm']/span[8]");


    private final String HOME_PAGE_URL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";

    @Test
    public void searchFieldCheck() {
        System.setProperty("webdriver.chrome.driver", "/users/zilite/Downloads/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchField = browser.findElement(NAME_FIELD);
        searchField.sendKeys("Apple");
        WebElement search = browser.findElement(SURNAME_FIELD);
        search.sendKeys("S");
        WebElement searchField3= browser.findElement(DISCOUNT);
        searchField3.sendKeys("1323");
        WebElement searchField4 = browser.findElement(ADULTS);
        searchField4.sendKeys("2");
        WebElement searchField5 = browser.findElement(CHILDREN);
        searchField5.sendKeys("2");
        WebElement searchField6 = browser.findElement(LUGGAGE);
        searchField6.sendKeys("yes");
        WebElement SearchField7 = browser.findElement(FLIGHT);
        SearchField7.sendKeys("13-05-2018");
        Actions actions = new Actions(browser);
        WebElement searchField8 = browser.findElement(PRODUCT_TYPE);

        actions.doubleClick(searchField8).perform();


    }
}
