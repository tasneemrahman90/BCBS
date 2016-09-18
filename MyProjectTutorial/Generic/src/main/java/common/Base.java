package common;


/**
 * Created by Tasneem on 9/1/2016.
 */
public class Base {
  public Webdriver driver = null;
@BeforeMethod
public void setUp(){(
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tasneem\\Desktop\\geckodriver-v0.10.0-win64")
      FirefoxDriver();
driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.navigate().to ("http://www.nytimes.com/");
driver.manage().window().maximize();

@AfterMethod
        public void cleanUp() {
        driver.quit();
    }