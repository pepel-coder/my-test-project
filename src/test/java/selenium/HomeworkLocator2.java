package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkLocator2 {
    private final String HOME_PAGE_URL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";
    private final By LOGO = By.xpath(".//a[@class='main-logo']");
    private final By PASUTIJUMU_INFORMACIJA = By.xpath(".//a[@href='/order_search']");
    private final By FAVORITS = By.className("favorite-items__icon icon-svg");
    private final By LV_LANG = By.xpath(".//a[@hreflang='lv']");
    private final By RU_LANG = By.xpath(".//a[@hreflang='ru']");
    private final By BANNER = By.xpath(".//img[@class = 'welcome-carusel-slider_image']");
    private final By ACCEPT_ALL = By.xpath(".//a[@class='c-button']");
    private final By COMPUTERS_BIRO = By.xpath(".//ul/a[@href= '/c/datortehnika-preces-birojam/2pd']");
    private final By COMPUTERS_COMPONENTS = By.xpath(".//li[@class='submenu-lvl1__list-item color-theme-22 submenu-lvl1__list-item--has-child']");
    private final By MOBILE = By.xpath(".//li[@class='submenu-lvl1__list-item color-theme-22 submenu-lvl1__list-item--has-child']");
    private final By TV = By.xpath(".//li[@class='submenu-lvl1__list-item color-theme-20 submenu-lvl1__list-item--has-child']");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");

    @Test
    public void searchFieldCheck() {
        System.setProperty("webdriver.chrome.driver", "/users/zilite/Downloads/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);
    }
}
